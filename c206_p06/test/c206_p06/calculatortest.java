/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Reuben Sim
 * Student ID: 21019352
 * Class: W64N
 * Date/Time created: Friday 27-05-2022 11:34
 */

package c206_p06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 21019352
 *
 */
public class calculatortest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	public void testSubtract() {
		int a = 100;
		int b = 50;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 50;
		assertEquals (expected, actual);
		}

	public void testMultiple() {
		int a = 50;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 100;
		assertEquals (expected, actual);
		}
	
	public void testDivide() {
		int a = 100;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 50;
		assertEquals (expected, actual);
		}


}
