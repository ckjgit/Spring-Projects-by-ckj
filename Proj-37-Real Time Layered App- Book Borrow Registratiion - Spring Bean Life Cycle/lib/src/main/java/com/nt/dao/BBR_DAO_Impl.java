package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import com.nt.bo.BBR_BO;

public final class BBR_DAO_Impl implements BBR_DAO {

	private static final String INSERTBBRDETAILS = "INSERT INTO BookBorrowRegn(BNAME, BID, IDNO, BOOKNAME, AUTHERNAME,NOOFDAYSOFBORROWING) VALUES (?,?,?,?,?,?)";
	private DataSource ds = null;
	private Connection con = null;
	private PreparedStatement pst = null;
	public int count = 0;

	// injecting DataSource object to ds through Spring Bean
	public BBR_DAO_Impl(DataSource ds) {
		this.ds = ds;
	}

	// spring bean init life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("BBR_DAO_Impl.myInit()");
		if (ds == null)
			throw new IllegalArgumentException("DataSource Not Injected...");
	}

	// spring bean destroy life cycle method
	@PreDestroy
	public void myDestroy() {

		System.out.println("BBR_DAO_Impl.myDestroy()");
		ds = null;
	}

	@Override
	public String registerBBR(BBR_BO bo) throws Exception {
		// injecting Connection object
		con = ds.getConnection();

		// creating PreparedStatement obj
		pst = con.prepareStatement(INSERTBBRDETAILS);
		pst.setString(1, bo.getbName());
		pst.setString(2, bo.getbId());
		pst.setString(3, bo.getIdNo());
		pst.setString(4, bo.getBookName());
		pst.setString(5, bo.getAutherName());
		pst.setFloat(6, bo.getNoOfDaysOfBorrowing());

		count = pst.executeUpdate();

		if (count == 1)
			return "Borrowing Successfull";
		else
			return "Borrowing Not Successfull";
	}

}
