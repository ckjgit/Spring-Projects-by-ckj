package com.nt.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientMgmtService;
import com.nt.vo.PatientVO;

@Controller("controller")
public class MainController {
	
	//injecting DAO class object through Annotation
	@Autowired
	@Qualifier("patientService")
	private PatientMgmtService service;

	
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
			


	public String processPatient(PatientVO vo) throws Exception {
		PatientDTO dto = null;
		String result = null;

		dto = new PatientDTO();

		dto.setPname(vo.getPname());
		dto.setPage(Integer.parseInt(vo.getPage()));
		dto.setPadd(vo.getPadd());
		dto.setHospitalname(vo.getHospitalname());
		dto.setNofodays(Integer.parseInt(vo.getNoofdays()));

		// process dto
		result = service.calculateBillAmt(dto);

		return result;
	}
}
