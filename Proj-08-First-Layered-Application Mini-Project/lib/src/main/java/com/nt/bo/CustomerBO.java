package com.nt.bo;


public class CustomerBO {
	
	private String cname;
	private String cadd;
	private float pamt;
	private float intramt;
	
	
	// setters & getters by Lombok API
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public float getIntramt() {
		return intramt;
	}
	public void setIntramt(Float intramt) {
		this.intramt = intramt;
	}
	
	
}
