package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.PatientBO;

@Repository("patientDao")
public final class PatientDAOImpl implements PatientDAO {

	private static final String INSERT = "INSERT INTO CORONA_PATIENT(PNAME,PAGE,PADD,HOSPITALNAME) VALUES(?,?,?,?)";
	
	@Autowired
	@Qualifier("hkds")
	private DataSource ds;
	
	Connection con = null;
	PreparedStatement ps = null;
	int count = 0;

	// 1-param constructor injecting by IOC Container
//	public PatientDAOImpl(DataSource ds) {
//		System.out.println(ds.getClass());
//		this.ds = ds;
//	}

	@Override
	public int insert(PatientBO bo) throws Exception {
		// get polled connection from DataSource Object
		con = ds.getConnection();

		// creating preparedStatement object
		ps = con.prepareStatement(INSERT);

		// set parameter to preparedStatement object
		ps.setString(1, bo.getPname());
		ps.setInt(2, bo.getPage());
		ps.setString(3, bo.getPadd());
		ps.setString(4, bo.getHospitalname());

		// execute query
		count = ps.executeUpdate();

		return count;
	}

}
