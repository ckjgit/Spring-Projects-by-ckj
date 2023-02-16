package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.BBR_Controller;
import com.nt.vo.BBR_VO;

public class BookBorrowRegnTest {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BBR_VO vo=null;
		
		String bName=null;
		String bId=null;
		String idNo=null;
		String bookName=null;
		String autherName=null;
		Float noOfDays=0f;
		
		Scanner  sc=null;
		
		BBR_Controller ctrl=null;
		
		String msg=null;
		
		char confirm='y';
		
		//creating/preparing ApplicationContext Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		
		sc=new Scanner(System.in);
		
		
		
		
		System.out.println("\n\n===========>> BOOK BORROW REGISTRATION <<=============");
		System.out.print("\nEnter Borrower Name ");
		bName=sc.nextLine();
		
		System.out.print("\nEnter Borrower ID Type (Aadhar / PAN / DL ) ");
		bId=sc.nextLine();
		
		System.out.print("\nEnter Borrower ID Number ");
		idNo=sc.nextLine();
		
		System.out.print("\nEnter Book Name For Borrow ");
		bookName=sc.nextLine();
		
		System.out.print("\nEnter Book Auther Name ");
		autherName=sc.nextLine();
		
		System.out.print("\nEnter No  Of Days For Borrow ");
		noOfDays=sc.nextFloat(); 
		
		
		
		
		vo=new BBR_VO();
		vo.setbName(bName);
		vo.setbId(bId);
		vo.setIdNo(idNo);
		vo.setBookName(bookName);
		vo.setAutherName(autherName);
		vo.setNoOfDaysOfBorrowing(noOfDays);
		
		//collecting Controller class object
		ctrl=ctx.getBean("controller", BBR_Controller.class);
		
		try {
			msg=ctrl.getMessage(vo);
			
			System.out.println("\n-----------Borrow Recepit-----------");
			System.out.println("Borrower Name : "+bName);
			System.out.println("Borrower ID Type : "+bId);
			System.out.println("Borrower ID No. : "+idNo);
			System.out.println("Borrowed Book Name : "+bookName);
			System.out.println("Book Auther Name : "+autherName);
			System.out.println("Borrowing Days : "+noOfDays+" days");
			System.out.println(msg);
			
			System.out.println("\n\n ----------~ ~ Thank you ~ ~-----------");
			System.out.println("\n\n -------------Visit Again--------------");
	
			
		}
		catch(Exception e) {
			System.out.println("\n Internal Errors... ");
			e.printStackTrace();
		}
		
		
			
			
		//closing Scanner Class
		sc.close();
		//Container Stopped...at this following line
				((AbstractApplicationContext) ctx).close();
	}
}
