package com.tanlan.java8s4.concurrent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class THreadLocalDemo {
	private static ThreadLocal<Connection> t=new ThreadLocal<Connection>(){
		protected Connection initialValue() {
			return null;
		};
	};
	
	public static Connection test(){
		Connection conn=t.get();
		if(conn==null){
			try {
				conn=DriverManager.getConnection("","","");
				t.set(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	

	public static void main(String[] args) {
		System.out.println(test());
		System.out.println(test());
	}

}
