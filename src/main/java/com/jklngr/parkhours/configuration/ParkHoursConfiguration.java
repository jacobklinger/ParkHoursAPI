package com.jklngr.parkhours.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class ParkHoursConfiguration {
	
	@Bean
	public AmazonDynamoDB getAmazonDynamoDB()
	{
		return AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
	}

	@Bean
	public DynamoDBMapper getDynamoMapper(AmazonDynamoDB client)
	{
		return new DynamoDBMapper(client);
	}
}
