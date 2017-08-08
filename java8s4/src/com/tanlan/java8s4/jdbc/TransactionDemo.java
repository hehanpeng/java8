package com.tanlan.java8s4.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		Connection conn=DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			Statement stmt=conn.createStatement();
			stmt.execute("insert into test_table values('15','Tom')");
			Savepoint sp=conn.setSavepoint();
			stmt.execute("insert into test_table values('16','Jack')");
			Savepoint sp2=conn.setSavepoint();
			conn.rollback(sp);
//			conn.rollback(sp2);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
