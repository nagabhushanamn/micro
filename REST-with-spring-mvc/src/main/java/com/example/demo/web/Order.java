package com.example.demo.web;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

	private String placedBy;

	public String getPlacedBy() {
		return placedBy;
	}

	public void setPlacedBy(String placedBy) {
		this.placedBy = placedBy;
	}

	@Override
	public String toString() {
		return "Order [placedBy=" + placedBy + "]";
	}

}
