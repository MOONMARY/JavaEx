package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployees {
	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";
	static final String dbpass = "hrdb";
	
	//connection, statement, resultSet
	public static void main(String[] args) {
		//Connection
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		//Driver 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			System.out.print("검색어 입력: ");
			String keyword = scanner.next();
			
			String sql = "select concat(first_name, ' ', last_name) full_name, "
					+ "email, phone_number, hire_date "
					+ "from employees "
					+ "where UPPER(first_name) like '%" + keyword.toUpperCase() + "%' "
					+ "or upper(last_name) like '%" + keyword.toUpperCase() +  "%'  ";
			
			System.out.println("QUERY:" + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String fullName = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s : %s, %s, %s%n", fullName, email, phoneNumber, hireDate);
			} 
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
	}
}
