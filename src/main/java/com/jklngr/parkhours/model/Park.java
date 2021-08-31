package com.jklngr.parkhours.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Park {
	
	private Hours hours;
	private Hours parkHopperHours;
	private List<Event> fireworks;
	private List<Event> parades;
	private List<Event> events;
	
	@DynamoDBAttribute(attributeName = "hours")
	public Hours getHours() {
		return hours;
	}
	
	public void setHours(Hours hours) {
		this.hours = hours;
	}
	
	@DynamoDBAttribute(attributeName = "parkHopperHours")
	public Hours getParkHopperHours() {
		return parkHopperHours;
	}
	
	public void setParkHopperHours(Hours parkHopperHours) {
		this.parkHopperHours = parkHopperHours;
	}
	
	@DynamoDBAttribute(attributeName = "fireworks")
	public List<Event> getFireworks() {
		return fireworks;
	}
	
	public void setFireworks(List<Event> fireworks) {
		this.fireworks = fireworks;
	}
	
	@DynamoDBAttribute(attributeName = "parades")
	public List<Event> getParades() {
		return parades;
	}
	
	public void setParades(List<Event> parades) {
		this.parades = parades;
	}
	
	@DynamoDBAttribute(attributeName = "events")
	public List<Event> getEvents() {
		return events;
	}
	
	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
