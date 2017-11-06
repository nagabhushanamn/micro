package com.example.demo.web;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="request")
public class TxrRequest {

	private double amount;
	private String from;
	private String to;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
