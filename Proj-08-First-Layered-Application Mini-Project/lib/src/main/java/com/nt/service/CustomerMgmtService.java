package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface CustomerMgmtService {
	public String calculateInterestAmount(CustomerDTO dto)throws Exception;
}
