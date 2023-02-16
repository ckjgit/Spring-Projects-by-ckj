package com.nt.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.nt.dto.BBR_DTO;
import com.nt.service.BBR_Service;
import com.nt.vo.BBR_VO;

public class BBR_Controller {
	
	public BBR_Service service=null;
	private BBR_DTO dto=null;
	private String msg2=null;
	
	//injecting Service Class through Constructor Injection
	public BBR_Controller(BBR_Service service) {
		this.service=service;
	}
	
	//spring bean init life cycle method
		@PostConstruct
		public void myInit() {
			System.out.println("BBR_Controller.myInit()");
			if(service==null)
				throw new IllegalArgumentException("DataSource Not Injected...");
		}
		
		//spring bean destroy life cycle method
		@PreDestroy
		public void myDestroy() {
			System.out.println("BBR_Controller.myDestroy()");
			service=null;
		}
		
	
	public String getMessage(BBR_VO vo)throws Exception {
		dto=new BBR_DTO();
		dto.setbName(vo.getbName());
		dto.setbId(vo.getbId());
		dto.setIdNo(vo.getIdNo());
		dto.setBookName(vo.getBookName());
		dto.setAutherName(vo.getAutherName());
		dto.setNoOfDaysOfBorrowing(vo.getNoOfDaysOfBorrowing());
		
		//collecting Message from service class
		msg2=service.calculateBrAmt(dto);
		
		return msg2;
	}
	

}
