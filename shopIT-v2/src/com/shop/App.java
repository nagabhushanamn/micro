package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init

		PriceMatrix v1 = new PriceMatrixImpl_v1();
		PriceMatrix v2 = new PriceMatrixImpl_v2();
		Billing billingComp = new BillingImpl(v2);

		// use
		String[] cart = { "345", "456", "653" };
		double total = billingComp.getTotalPrice(cart);
		System.out.println("Total :" + total);

		// destroy
		// ..

	}

}
