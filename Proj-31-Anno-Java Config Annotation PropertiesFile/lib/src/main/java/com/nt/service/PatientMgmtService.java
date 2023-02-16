package com.nt.service;

import com.nt.dto.PatientDTO;

public interface PatientMgmtService {
	public String calculateBillAmt(PatientDTO dto) throws Exception;
}
