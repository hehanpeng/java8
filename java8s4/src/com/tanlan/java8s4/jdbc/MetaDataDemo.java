package com.tanlan.java8s4.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDemo {

	public static void main(String[] args) throws Exception {
//		databaseMetaData();
		resultSetMetaData();
	}
	
	static void databaseMetaData() throws Exception{
		Connection conn=DBHelper.getConnection();
		DatabaseMetaData data=conn.getMetaData();
		System.out.println(data.getDatabaseProductName());
		System.out.println(data.getDatabaseProductVersion());
		System.out.println(data.getDriverName());
		System.out.println(data.getDriverVersion());
	}

	static void resultSetMetaData() throws Exception{
		Connection conn=DBHelper.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from test_table");
		ResultSetMetaData data=rs.getMetaData();
		System.out.println(data.getColumnCount());
		System.out.println(data.getColumnName(1));
		System.out.println(data.getColumnClassName(1));
		System.out.println(data.getColumnTypeName(1));
	}
}
