package QA.cource.tasks1Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import QA.cource.tasks1.CurrencyConverter;


public class CurrencyConverterTest {
	CurrencyConverter cc1;
	@BeforeEach
	  public void setUp() {
	   System.out.println("create instance of Currency Converter before each test");
       cc1=new CurrencyConverter();

	  }
	@Test
	public void convertUsdToEurTestPos() {
		double amount=10.5;
 		System.out.println("Test convert From USD to EUR function with positive value");
		double result=cc1.convert(amount, "USD", "EUR");
	    assertEquals(amount*0.9185,result);
		System.out.println("expected result :"+amount*0.9185);
		System.out.println("actual result :"+result);
	
		
	}
	public void convertUsdToEurTestZero() {
		double amount=0.0;
 		System.out.println("Test convert From USD to EUR function with zero value");
		double result=cc1.convert(amount, "USD", "EUR");
	    assertEquals(amount*0.9185,result);
		System.out.println("expected result :"+amount*0.9185);
		System.out.println("actual result :"+result);
	
		
	}
	public void convertUsdToEurTestNeg() {
		double amount=-14.75;
 		System.out.println("Test convert From USD to EUR function with negative value");
		double result=cc1.convert(amount, "USD", "EUR");
	    assertEquals(amount*0.9185,result);
		System.out.println("expected result :"+amount*0.9185);
		System.out.println("actual result :"+result);
	
		
	}
	
/////////FROM USD EUR
	
	@Test
	public void convertUsdToILSTestPos() {
		double amount=15;
 		System.out.println("Test convertFrom Usd To ILS function with positive value");
		double result=cc1.convert(amount, "USD", "ILS");
	    assertEquals(amount*3.627,result);
		System.out.println("expected result :"+amount*3.627);
		System.out.println("actual result :"+result);
    }
	@Test
	public void convertUsdToILSTestZero() {
		double amount=0.0;
 		System.out.println("Test convertFrom Usd To ILS function with zero value");
		double result=cc1.convert(amount, "USD", "ILS");
	    assertEquals(amount*3.627,result);
		System.out.println("expected result :"+amount*3.627);
		System.out.println("actual result :"+result);
    }
	@Test
	public void convertUsdToILSTestNeg() {
		double amount=-5.5;
 		System.out.println("Test convertFrom Usd To ILS function with negative value");
		double result=cc1.convert(amount, "USD", "ILS");
	    assertEquals(amount*3.627,result);
		System.out.println("expected result :"+amount*3.627);
		System.out.println("actual result :"+result);
    }
////////////////// USD to ILS	
	
	@Test
	public void convertEurToILSTestPos() {
		double amount=25;
 		System.out.println("Test convertFrom EUR To ILS function with positive value");
		double result=cc1.convert(amount, "EUR", "ILS");
	    assertEquals(amount*3.9483,result);
		System.out.println("expected result :"+amount*3.9483);
		System.out.println("actual result :"+result);
    }
	@Test
	public void convertEurToILSTestZero() {
		double amount=0.0;
 		System.out.println("Test convertFrom EUR To ILS function with zero value");
		double result=cc1.convert(amount, "EUR", "ILS");
	    assertEquals(amount*3.9483,result);
		System.out.println("expected result :"+amount*3.9483);
		System.out.println("actual result :"+result);
    }
	@Test
	public void convertEurToILSTestNeg() {
		double amount=-23;
 		System.out.println("Test convertFrom EUR To ILS function with negative value");
		double result=cc1.convert(amount, "EUR", "ILS");
	    assertEquals(amount*3.9483,result);
		System.out.println("expected result :"+amount*3.9483);
		System.out.println("actual result :"+result);
    }
	
/////////////////EUR to ILS
	
	@Test
	public void convertEurToUSDTestPos() {
		double amount=8.7;
 		System.out.println("Test convertFrom EUR To USD function wiht positive value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*1.0887,result);
		System.out.println("expected result :"+amount*1.0887);
		System.out.println("actual result :"+result);
	}
	
	@Test
	public void convertEurToUSDTestZero() {
		double amount=0.0;
 		System.out.println("Test convertFrom EUR To USD function wiht zero value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*1.0887,result);
		System.out.println("expected result :"+amount*1.0887);
		System.out.println("actual result :"+result);
	}
	
	@Test
	public void convertEurToUSDTestNeg() {
		double amount=-20;
 		System.out.println("Test convertFrom EUR To USD function wiht negative value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*1.0887,result);
		System.out.println("expected result :"+amount*1.0887);
		System.out.println("actual result :"+result);
	}
	
//////////////////////EUR to USD	
	
	
	@Test
	public void convertILSToUSDTestPos() {
		double amount=6.25;
 		System.out.println("Test convertFromUsdToILS function with positive value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*0.2757,result);
		System.out.println("expected result :"+amount*0.2757);
		System.out.println("actual result :"+result);	
	}

	@Test
	public void convertILSToUSDTestZero() {
		double amount=0.0;
 		System.out.println("Test convertFromUsdToILS function with zero value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*0.2757,result);
		System.out.println("expected result :"+amount*0.2757);
		System.out.println("actual result :"+result);	
	}
	
	@Test
	public void convertILSToUSDTestNeg() {
		double amount=-19.25;
 		System.out.println("Test convertFromUsdToILS function with negative value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertNotEquals(amount*0.2757,result);
		System.out.println("expected result :"+amount*0.2757);
		System.out.println("actual result :"+result);	
	}
////////////////////// ILS to USD	
	@Test
	public void convertILSToEURPos() {
		double amount=21.13;
 		System.out.println("Test convertFrom ILS to EUR function with positive value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*0.2533,result);
		System.out.println("expected result :"+amount*0.2533);
		System.out.println("actual result :"+result);	
	}
	
	@Test
	public void convertILSToEURZero() {
		double amount=0.0;
 		System.out.println("Test convertFrom ILS to EUR function with zero value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*0.2533,result);
		System.out.println("expected result :"+amount*0.2533);
		System.out.println("actual result :"+result);
	
		
	}
	@Test
	public void convertILSToEURNeg() {
		double amount=-7.77;
 		System.out.println("Test convertFrom ILS to EUR function with negative value");
		double result=cc1.convert(amount, "EUR", "USD");
		assertEquals(amount*0.2533,result);
		System.out.println("expected result :"+amount*0.2533);
		System.out.println("actual result :"+result);
	
		
	}
	
}
