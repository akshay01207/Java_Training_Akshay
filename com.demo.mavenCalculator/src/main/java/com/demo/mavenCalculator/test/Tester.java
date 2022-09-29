package com.demo.mavenCalculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.mavenCalculator.bean.Calculation;

public class Tester {
	
	Calculation obj=new Calculation();
    
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before all class");  
    }  
    @Before
    public  void beforeAllDemo() {
        System.out.println("before all the methods");
    }
       @Test
        public void testCheckAddition() {
            int actualResult = obj.add(12,4);
            assertEquals(16, actualResult);
        }
       @SuppressWarnings("deprecation")
	@Test
        public void testCheckDouble() {
            double actualResult = obj.add(4.0,5.0);
            assertEquals(true, actualResult);
//            assertEquals(2.5, Calculator.division(5, 2), 0.0);
        }
       
       @Test
        public void testString() {
            String actualResult = obj.add("aks","hay");
            assertEquals("akshay", actualResult);
        }
       @Test
        public void testCheckDivide() {
            double actualResult = obj.divide(10.0,5.0);
            assertNotEquals(2.0, actualResult);
        }


	
	
//	@Test
//	@DisplayName("TestAddition")
//	
//	public Tester() {
//		int expected=8;
//		Calculation cal =new Calculation();
//		int actual = cal.addition(4,4);
//		assertEquals(actual, expected);
//	}
//	
//	@Test
//	@DisplayName("TestSubstract")
//	
//	public testSubstract() {
//		int expected=4;
//		Calculation cal =new Calculation();
//		int actual = cal.addition(8,4);
//		assertEquals(actual, expected);
//	}

}
