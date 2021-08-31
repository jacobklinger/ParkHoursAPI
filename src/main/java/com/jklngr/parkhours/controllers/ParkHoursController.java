package com.jklngr.parkhours.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jklngr.parkhours.model.ParkHours;
import com.jklngr.parkhours.service.ParkHoursService;

@RestController
public class ParkHoursController {
	
	private ParkHoursService parkHoursService;
	
	public ParkHoursController(ParkHoursService dayService)
	{
		this.parkHoursService = dayService;
	}
	
	@GetMapping("/parkHours/{date}")
	public ParkHours getParkHours(@PathVariable String date)
	{
		return parkHoursService.getParkHours(date);
	}
	
	@PutMapping("/parkHours/{date}")
	public void putParkHours(@RequestBody ParkHours parkHours, @PathVariable String date)
	{
		parkHoursService.setParkHours(date, parkHours);
	}
	
	@PatchMapping("/parkHours/{date}")
	public void patchParkHours(@RequestBody ParkHours parkHours, @PathVariable String date)
	{
		parkHoursService.appendParkHours(date, parkHours);
	}

}
