package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init

		BillingImpl billingComp = new BillingImpl();

		// use
		String[] cart = { "345", "456", "653" };
		double total = billingComp.getTotalPrice(cart);
		System.out.println("Total :" + total);

		// destroy
		// ..

	}

}
