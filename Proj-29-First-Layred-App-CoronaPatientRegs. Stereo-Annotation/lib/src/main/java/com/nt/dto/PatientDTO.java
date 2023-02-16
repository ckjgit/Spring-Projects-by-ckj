package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	private String pname;
	private Integer page;
	private String padd;
	private String hospitalname;
	private Integer noofdays;

	// getters and setters
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPadd() {
		return padd;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public Integer getNofodays() {
		return noofdays;
	}

	public void setNofodays(Integer nofodays) {
		this.noofdays = nofodays;
	}

}
