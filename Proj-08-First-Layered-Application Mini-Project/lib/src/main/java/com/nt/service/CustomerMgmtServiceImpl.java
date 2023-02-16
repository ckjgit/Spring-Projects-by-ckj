package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements CustomerMgmtService {

	private CustomerDAO dao=null;
	
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao=dao;
	}
	
	@Override
	public String calculateInterestAmount(CustomerDTO dto) throws Exception {
		float intrAmt=0.0f;
		CustomerBO bo=null;
		int count=0;
		
		//calculate interest amount
		intrAmt=dto.getPamt()*dto.getTime()*dto.getRate()/100.0f;
		
		//prepare CutomerBO object having persistable data
		bo=new CustomerBO();
		
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntramt(intrAmt);
		
		//use DAO
		count=dao.insert(bo);
		
		//process the result
		if(count==1)
				return "Customer Registration Seccessfull :: Amount = "+dto.getPamt()+" Interest = "+intrAmt;
		else
			return "Customer Registration Failed :: Amount = "+dto.getPamt()+" Interest = "+intrAmt;
		
		
	}

}
