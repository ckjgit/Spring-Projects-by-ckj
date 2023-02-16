package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BBR_DTO implements Serializable{
	private String bName;
	private String bId;
	private String idNo;
	private String bookName;
	private String autherName;
	private Float noOfDaysOfBorrowing;
	
	//Generating getter and setter
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public Float getNoOfDaysOfBorrowing() {
		return noOfDaysOfBorrowing;
	}
	public void setNoOfDaysOfBorrowing(Float noOfDaysOfBorrowing) {
		this.noOfDaysOfBorrowing = noOfDaysOfBorrowing;
	}
	
	
}
