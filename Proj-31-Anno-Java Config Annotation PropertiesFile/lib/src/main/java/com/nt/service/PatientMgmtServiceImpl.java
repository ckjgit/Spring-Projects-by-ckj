package com.nt.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

//@Service("patientService")
@Named("patientService")		//java config anno
public final class PatientMgmtServiceImpl implements PatientMgmtService {
	
	//injecting DAO class object through Annotation
	//@Autowired
	//@Qualifier("patientDao")
	@Inject
	//@Named("patientDao")	// for ambiguity problem
	private PatientDAO dao;
	
	private float billAmt = 0.0f;
	public PatientBO bo=null;
	int count=0;
	
	@Value("${prop.age}") //inserting (Softcoding) value from properties file
	private int age;
	
//	//injecting DAO class object through 1-param constructor
//	public PatientMgmtServiceImpl(PatientDAO dao) {
//		this.dao=dao;
//	}

	@Override
	public String calculateBillAmt(PatientDTO dto) throws Exception {
		System.out.println("Age is :"+age);
		
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
