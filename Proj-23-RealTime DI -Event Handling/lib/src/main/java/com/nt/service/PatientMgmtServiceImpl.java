package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

public final class PatientMgmtServiceImpl implements PatientMgmtService {
	private PatientDAO dao=null;
	private float billAmt = 0.0f;
	public PatientBO bo=null;
	int count=0;
	
	String osName=null;
	String path=null;
	
	//injecting DTO class object through 1-param constructor
	public PatientMgmtServiceImpl(PatientDAO dao) {
		this.dao=dao;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String calculateBillAmt(PatientDTO dto) throws Exception {
		System.out.println("\n\n OS Name : "+osName+" Path : "+path);
		
		billAmt=dto.getNofodays()*3000;
	//preparing bo object having persistable data
		bo=new PatientBO();
		
		bo.setPname(dto.getPname());
		bo.setPage(dto.getPage());
		bo.setPadd(dto.getPadd());
		bo.setHospitalname(dto.getHospitalname());
		bo.setNoofdays(dto.getNofodays());
		
		//use dao object
		count=dao.insert(bo);
		
		//process the result
		if(count==1)
				return "Patient Registration Successfull :: Amount Payble for "+dto.getNofodays()+" days is : Rs. "+billAmt;
		else
			return "Patient Registration Failed ";
		
	}

}
