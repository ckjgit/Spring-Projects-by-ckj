package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements CustomerDAO{
	
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO CUSTOMER_GRADLE (CNAME,CADD,PRINCIPALAMT,INTERESTAMT) VALUES (?,?,?,?)";
	private DataSource ds=null;
	
	public CustomerDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	
	@Override
	public int insert(CustomerBO bo) throws Exception { 
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		con=ds.getConnection();
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		
		//ps.setInt(1, 1);
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getIntramt());
		
		count=ps.executeUpdate();
		ps.close();
		con.close();
		
		return count;
	}

}
