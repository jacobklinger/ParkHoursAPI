package com.jklngr.parkhours.model;

import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="ParkHoursTest")
public class ParkHours {
	
	private String date;	
	private Map<String, Park> parks;

	@DynamoDBHashKey(attributeName="Date")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@DynamoDBAttribute(attributeName="parks")
	public Map<String, Park> getParks() {
		return parks;
	}

	public void setParks(Map<String, Park> parks) {
		this.parks = parks;
	}

}
