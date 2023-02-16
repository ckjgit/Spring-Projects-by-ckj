package com.nt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.nt.bo.BBR_BO;
import com.nt.dao.BBR_DAO_Impl;
import com.nt.dto.BBR_DTO;

public final class BBR_ServiceImpl implements BBR_Service {
	public  BBR_DAO_Impl dao=null;
	private BBR_BO bo=null;
	private Float amount=null;
	private String msg=null;
	
	//injecting DAO Object
	public BBR_ServiceImpl(BBR_DAO_Impl dao) {
		this.dao=dao;
	}
	
	//spring bean init life cycle method
		@PostConstruct
		public void myInit() {
			System.out.println("BBR_ServiceImpl.myInit()");
			if(dao==null)
				throw new IllegalArgumentException("DAO Not Injected...");
		}
		
		//spring bean destroy life cycle method
		@PreDestroy
		public void myDestroy() {
			System.out.println("BBR_ServiceImpl.myDestroy()");
			dao=null;
		}
		

	@Override
	public String calculateBrAmt(BBR_DTO dto) throws Exception {
		
		bo=new BBR_BO();
		bo.setbName(dto.getbName());
		bo.setbId(dto.getbId());
		bo.setBookName(dto.getBookName());
		bo.setIdNo(dto.getIdNo());
		bo.setNoOfDaysOfBorrowing(dto.getNoOfDaysOfBorrowing());
		bo.setAutherName(dto.getAutherName());
		
		//Calculating amount for borrowing
		//		GST										price per day
		amount=19.34f * dto.getNoOfDaysOfBorrowing() *     47.50f;
		
		//passing bo object and collecting results
		msg=dao.registerBBR(bo);
		
		
		return msg+" having Payable Amount of Rs. "+amount;
	}

}
