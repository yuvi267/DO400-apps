package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
}
@Test
public void canCalculateTheCostForARegion() {
	 ShippingCalculator calculator = new ShippingCalculator();
	  assertEquals(0, calculator.costForRegion("A Region"));
}

@Test
public void onNARegionTheCostIs100() {
	 assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
}

public int costForRegion(String name) {
	 if (name.equals("NA")) {
		  return 100;
		   }
	  return 0;
}

@Test
public void onNARegionTheCostIs100() {
	 // Given a shipping calculator
	   ShippingCalculator calculator = new ShippingCalculator();
	 //   // When NA is the country region
	     int calculatedCost = calculator.costForRegion("NA");
 // Then the shipping cost is 100
  assertEquals(100, calculatedCost);
   }	     
