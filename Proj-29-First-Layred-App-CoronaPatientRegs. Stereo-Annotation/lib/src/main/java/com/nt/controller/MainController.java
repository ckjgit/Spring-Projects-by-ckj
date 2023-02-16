package com.nt.controller;

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
