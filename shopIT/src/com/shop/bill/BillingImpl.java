package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {
		
		priceMatrix = new PriceMatrixImpl_v1();
		double total = 0.0;
		for (String item : cart) {
			total = total + priceMatrix.getPrice(item);
		}
		return total;
		
	}

}
