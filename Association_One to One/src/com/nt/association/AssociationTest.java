package com.nt.association;

import com.nt.bank.Bank;
import com.nt.employee.Employee;

public class AssociationTest {

	public static void main(String[] args) {
		Bank bank=new Bank("HDFC");
		
		
		Employee emp=new Employee("Chaita");
		
		System.out.println(emp.getEmployeeName()+" is an Employee of "+bank.getBankName()+" bank. ");
	}

}
