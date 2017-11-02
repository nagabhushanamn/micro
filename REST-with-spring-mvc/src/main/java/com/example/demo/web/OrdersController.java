package com.example.demo.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public String listOrders() {
		return "GET: /orders";
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET, params = { "status=!active" })
	public String listOrdersByStatus() {
		return "GET: /orders by status param";
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET, headers = { "Accept-Language=en" })
	public String listOrderInEng() {
		return "GET: /orders by header : en";
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET, headers = { "Accept-Language=ar" })
	public String listOrderInAr() {
		return "GET: /orders by header : ar";
	}
	// -------------------------------------------------------

	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		if (id.equals("111")) {
			throw new OrderNotFoundException();
		}
		return "GET: /orders - " + id;
	}
	// -------------------------------------------------------

	
	@RequestMapping(value = "/orders", method = RequestMethod.POST,consumes= {"application/xml"},produces= {"application/xml"})
	public String createOrder(@RequestBody Order order) {
		System.out.println(order);
		return "POST: /orders  ";
	}

}
