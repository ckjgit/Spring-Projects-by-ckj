package com.nt.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.common.annotations.VisibleForTesting;

public class TestBankLoanService {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcSimpleIntrAmtWithSmallNo() {
		BankLoanService bls=new BankLoanService();
		float actual=bls.calcSimpleInterestAmt(12000.0f, 2.0f, 5.0f);
		float expected=1200.0f;
		assertEquals(expected, actual, 0.1);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcSimpleIntrAmtWithBigNo() {
		BankLoanService bls=new BankLoanService();
		float actual=bls.calcSimpleInterestAmt(2400000, 2, 5);
		float expected=240000.0f;
		assertEquals(expected, actual, 0.1);
	
		
	}
}
