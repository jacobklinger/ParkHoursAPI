package com.jklngr.parkhours.exception;

public class ParkHoursNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ParkHoursNotFoundException(String date) {
	    super("Park hours not found for date " + date);
	  }

}
