package com.stackroute.projectmicroservice.indexermodel;

import com.stackroute.projectmicroservice.relationshipmodel.SkillRelationshipProperties;
import com.stackroute.projectmicroservice.relationshipmodel.WorkInRelationshipProperties;

public class Relationship {
	
	private WorkInRelationshipProperties workInRelationshipProperties;
	private SkillRelationshipProperties skillRelationshipProperties;
	
	public Relationship(WorkInRelationshipProperties workInRelationshipProperties) {
		super();
		this.workInRelationshipProperties = workInRelationshipProperties;
		this.skillRelationshipProperties = null;
	}
	
	public Relationship(SkillRelationshipProperties skillRelationshipProperties) {
		super();
		this.skillRelationshipProperties = skillRelationshipProperties;
		this.workInRelationshipProperties = null;
		
	}
	
	public Relationship(WorkInRelationshipProperties workInRelationshipProperties,
			SkillRelationshipProperties skillRelationshipProperties) {
		super();
		this.workInRelationshipProperties = workInRelationshipProperties;
		this.skillRelationshipProperties = skillRelationshipProperties;
	}
	public WorkInRelationshipProperties getWorkInRelationshipProperties() {
		return workInRelationshipProperties;
	}
	public void setWorkInRelationshipProperties(WorkInRelationshipProperties workInRelationshipProperties) {
		this.workInRelationshipProperties = workInRelationshipProperties;
	}
	public SkillRelationshipProperties getSkillRelationshipProperties() {
		return skillRelationshipProperties;
	}
	public void setSkillRelationshipProperties(SkillRelationshipProperties skillRelationshipProperties) {
		this.skillRelationshipProperties = skillRelationshipProperties;
	}
	
	
}
