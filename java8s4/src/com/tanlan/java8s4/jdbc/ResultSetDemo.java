package com.tanlan.java8s4.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {
		// query();
		query2();
	}

	static void query() {

		try (Connection conn = DBHelper.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from test_table");) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString(2);
				System.out.println(id + "," + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void query2() {
		Connection conn = DBHelper.getConnection();
		try {
			Statement stmt = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select id,name from test_table");
			rs.absolute(2);
			int id = rs.getInt("id");
			String name = rs.getString(2);
			System.out.println(id + "," + name);
			rs.updateString(2, "Tom1");
			rs.updateRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
