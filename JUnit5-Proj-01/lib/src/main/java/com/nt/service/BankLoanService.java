package com.nt.service;

public class BankLoanService {
	public float calcSimpleInterestAmt(float PAmount, float Time, float Rot) {
		System.out.println("BankLoanService.calcSimpleInterestAmt()");
		return PAmount * Time * Rot / 100.0f;
	}
}
