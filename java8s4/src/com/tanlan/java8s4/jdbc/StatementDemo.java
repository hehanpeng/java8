package com.tanlan.java8s4.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
//		add();
		batch();
//		update();
//		delete();
	}

	static void add() {
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn.createStatement();
			int i=stmt.executeUpdate("insert into test_table values('1','Tom')");
			System.out.println(i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static void update() {
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.execute("update test_table set name='Jack' where id='1'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void delete() {
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.execute("delete from test_table where id='1'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void batch(){
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into test_table values('2','Jack')");
			stmt.addBatch("insert into test_table values('3','Rose')");
			stmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
