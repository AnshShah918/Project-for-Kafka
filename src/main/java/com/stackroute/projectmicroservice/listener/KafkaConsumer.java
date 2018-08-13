package com.stackroute.projectmicroservice.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.projectmicroservice.indexermodel.Indexer;
import com.stackroute.projectmicroservice.indexermodel.Relationship;
import com.stackroute.projectmicroservice.indexermodel.TargetNodeProperty;
import com.stackroute.projectmicroservice.model.Project;
import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

@Service
public class KafkaConsumer { 
	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public SkillRelationshipProperties skillRelationshipProperties = new SkillRelationshipProperties();
	public WorkInRelationshipProperties workInRelationshipProperties = new WorkInRelationshipProperties();
	public Indexer workinIndexer= new Indexer();
	public Indexer skillIndexer = new Indexer();
	

	/*Properties for Kafka defined
	 * 
	 */
    @KafkaListener(topics = "${app.topic.name}", group = "${spring.kafka.consumer.group-id}",
            containerFactory = "projectKafkaListenerFactory")
    public void consumeJson(Project project) {
    	
    	//Target Node Type
    	workinIndexer.setTragetNodeType("Profile");
    	skillIndexer.setTragetNodeType("Profile");
    	
    	//Source Node Type
    	workinIndexer.setSourceNodeType("Project");
    	skillIndexer.setSourceNodeType("Project");
    	
    	//Source Node Property
    	workinIndexer.setSourceNodeProperty(project.getProjectId());
    	skillIndexer.setSourceNodeProperty(project.getProjectId());
    	
    	//Target Node Property
    	targetNodeProperty.setId(project.getProfileId());
    	
    	workinIndexer.setTargetNodeProperty(targetNodeProperty);
    	skillIndexer.setTargetNodeProperty(targetNodeProperty);
    	
    	//Work in Defined
    	workInRelationshipProperties.setDepartment(project.getDepartment());
    	workInRelationshipProperties.setFrom(project.getFrom());
    	workInRelationshipProperties.setProjectName(project.getProjectTitle());
    	workInRelationshipProperties.setRole(project.getRole());
    	workInRelationshipProperties.setTo(project.getTo());

    	Relationship workRelationship = new Relationship(workInRelationshipProperties);
    	workinIndexer.setRelationship(workRelationship);
    	
    	// Skill Defined
    	skillRelationshipProperties.setExperience("0");
    	
    	Relationship skillRelationship = new Relationship(skillRelationshipProperties);
    	skillIndexer.setRelationship(skillRelationship);
    	
    	//Operations
    	skillIndexer.setOperation(project.getMessage());
    	workinIndexer.setOperation(project.getMessage());
    	
    	//Printing
    	
        LOG.info("received message='{}'", workinIndexer);
        LOG.info("received message='{}'", skillIndexer);
        
    }
}
    

