package com.shop.bill;

import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;

/*
 *  design & performance issues
 *  ------------------------------
 *  
 *  --> tight-coupling b/w dependent & dependency
 *  
 *     ==> Maintenance/Extending with new features very difficult
 *  
 *  --> creating too many duplicate dependency-instances
 *  
 *     ==> slow,memory-usage high,....
 *  
 *  -->  Unit_testing not possible
 *  
 *     ==> dev/bug fix will become slow
 *     
 *     
 *     why these issues are raising in this comp ?
 *     
 *     -> dependent-obj creating its own dependency-obj
 *     
 *     Soln:
 *     
 *     -> Dont create dependency-obj in dependent's class , do Lookup
 *     
 *     
 *     Limitation on Lookup:
 *     
 *     --> location tight-coupling
 *     
 *     Best Soln:
 *     
 *     --> Dont create/lookup , get/inject by 'Some-One' ( Inversion Of Control )
 *     
 *     
 *        How to implement IOC ?
 *        
 *          using 'Dependency Injection' ( DI )
 *          
 *           types:
 *           
 *           --> constructor DI
 *           --> setter DI
 *           
 *       -------------------------------    
 *     
 *     
 *     
 *     
 *     
 *     
 *  
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		for (String item : cart) {
			total = total + priceMatrix.getPrice(item);
		}
		return total;

	}

}
