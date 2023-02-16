package com.nt.vo;

public class CustomerVO {
	private String cname;
	private String cadd;
	private String time;
	private String pamt;
	private String rate;

	// creating getters & setters automatically be Lombok API

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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPamt() {
		return pamt;
	}

	public void setPamt(String pamt) {
		this.pamt = pamt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
