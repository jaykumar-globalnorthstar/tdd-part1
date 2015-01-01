package sibisoft;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTestCases {

	@Test public void testMultiplication() {
		//initialize object
		Dollar five= new Dollar(5);
		Dollar product= (Dollar) five.times(2);
		assertEquals(10, product.amount);
		product= five.times(3);
		assertEquals(15, product.amount);
	}
}
