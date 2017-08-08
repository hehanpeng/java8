package com.tanlan.java8s4.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) throws Exception {
		RowSetFactory factory=RowSetProvider.newFactory();
		JdbcRowSet rs=factory.createJdbcRowSet();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		rs.setUsername("tanlan");
		rs.setPassword("tanlan");
		
		rs.setCommand("select id,name from test_table");
		
		rs.execute();
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+","+rs.getString(2));
		}
		
		rs.first();
		rs.updateString(2, "Rose1");
		rs.updateRow();
	}

}
