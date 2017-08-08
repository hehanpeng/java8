package com.tanlan.java8s4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception {
		Connection conn = DBHelper.getConnection();
		// PreparedStatement stmt = conn
		// .prepareStatement("insert into test_table values(?,?)");
		// stmt.setInt(1, 4);
		// stmt.setString(2, "老谭");
		// stmt.execute();
		PreparedStatement stmt = conn
				.prepareStatement("select * from test_table where trim(name)=?");
		stmt.setString(1, "Tom1");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
	}

}
