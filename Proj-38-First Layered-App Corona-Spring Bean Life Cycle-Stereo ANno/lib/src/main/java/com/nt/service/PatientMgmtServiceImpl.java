package com.nt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

@Service("patientService")
public final class PatientMgmtServiceImpl implements PatientMgmtService {
	
	//injecting DAO class object through Annotation
	@Autowired
	@Qualifier("patientDao")
	private PatientDAO dao;
	
	private float billAmt = 0.0f;
	public PatientBO bo=null;
	int count=0;
	
//	//injecting DAO class object through 1-param constructor
//	public PatientMgmtServiceImpl(PatientDAO dao) {
//		this.dao=dao;
//	}
	
	
	//spring bean init life cycle method
			@PostConstruct
			public void myInit() {
				//System.out.println("BBR_Controller.myInit()");
				if(dao==null)
					throw new IllegalArgumentException("DataSource Not Injected...");
			}
			
			//spring bean destroy life cycle method
			@PreDestroy
			public void myDestroy() {
			//	System.out.println("BBR_Controller.myDestroy()");
				dao=null;
			}
			

	@Override
	public String calculateBillAmt(PatientDTO dto) throws Exception {
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
