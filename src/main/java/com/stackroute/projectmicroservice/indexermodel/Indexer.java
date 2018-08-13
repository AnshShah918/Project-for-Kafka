package com.stackroute.projectmicroservice.indexermodel;

public class Indexer {
	
	private String sourceNodeType;
	private String sourceNodeProperty;
	private String TragetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private Relationship relationship;
	private String operation;
	
	public Indexer () {
		
	}
	
	public Indexer(String sourceNodeType, String sourceNodeProperty, String tragetNodeType,
			TargetNodeProperty targetNodeProperty, Relationship relationship, String operation) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		TragetNodeType = tragetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationship = relationship;
		this.operation = operation;
	}
	public String getSourceNodeType() {
		return sourceNodeType;
	}
	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}
	public String getSourceNodeProperty() {
		return sourceNodeProperty;
	}
	public void setSourceNodeProperty(String sourceNodeProperty) {
		this.sourceNodeProperty = sourceNodeProperty;
	}
	public String getTragetNodeType() {
		return TragetNodeType;
	}
	public void setTragetNodeType(String tragetNodeType) {
		TragetNodeType = tragetNodeType;
	}
	public TargetNodeProperty getTargetNodeProperty() {
		return targetNodeProperty;
	}
	public void setTargetNodeProperty(TargetNodeProperty targetNodeProperty) {
		this.targetNodeProperty = targetNodeProperty;
	}
	public Relationship getRelationship() {
		return relationship;
	}
	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "Indexer [sourceNodeType=" + sourceNodeType + ", sourceNodeProperty=" + sourceNodeProperty
				+ ", TragetNodeType=" + TragetNodeType + ", targetNodeProperty=" + targetNodeProperty
				+ ", relationship=" + relationship + ", operation=" + operation + "]";
	}
	
	

}
