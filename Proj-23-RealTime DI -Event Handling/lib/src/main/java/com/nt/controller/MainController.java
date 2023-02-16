package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientMgmtService;
import com.nt.vo.PatientVO;

public class MainController {
	private PatientMgmtService service = null;

	public MainController(PatientMgmtService service) {
		this.service = service;
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
