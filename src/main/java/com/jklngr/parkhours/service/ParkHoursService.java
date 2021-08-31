package com.jklngr.parkhours.service;

import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.jklngr.parkhours.exception.ParkHoursNotFoundException;
import com.jklngr.parkhours.model.ParkHours;

@Service
public class ParkHoursService {
	
	private DynamoDBMapper mapper;
	
	public ParkHoursService(DynamoDBMapper mapper)
	{
		this.mapper = mapper;
	}
	
	public ParkHours getParkHours(String date)
	{
		ParkHours parkHours = mapper.load(ParkHours.class, date);
		if (parkHours == null)
		{
			throw new ParkHoursNotFoundException(date);
		}
		return parkHours;
	}

	public ParkHours setParkHours(String date, ParkHours parkHours) {
		parkHours.setDate(date);
		mapper.save(parkHours);
		return parkHours;
	}

	public ParkHours appendParkHours(String date, ParkHours parkHours) throws ParkHoursNotFoundException {
		ParkHours existing = mapper.load(ParkHours.class, date);
		
		if (existing == null)
		{
			throw new ParkHoursNotFoundException(parkHours.getDate());
		}
		
		existing.getParks().putAll(parkHours.getParks());
		mapper.save(existing);
		return existing;
	}

}
