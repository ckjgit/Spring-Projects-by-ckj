package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExtQryVsExtUpdt {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///sys","root","Ckj123@0909");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from User01");
			System.out.println(rs.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
