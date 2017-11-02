package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdvosor {

	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This order not exist")
	@ExceptionHandler(value = { OrderNotFoundException.class })
	public void handleIfNoOrderExist() {

	}

}
