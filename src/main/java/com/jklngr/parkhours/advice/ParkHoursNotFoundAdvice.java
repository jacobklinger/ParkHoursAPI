package com.jklngr.parkhours.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jklngr.parkhours.exception.ParkHoursNotFoundException;

@ControllerAdvice
public class ParkHoursNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ParkHoursNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String parkHoursNotFoundHandler(ParkHoursNotFoundException ex) {
		return ex.getMessage();
	}

}
