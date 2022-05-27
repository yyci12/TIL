package common;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCTemplate {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("01.드라이버 연결");
		} catch (ClassNotFoundException e) {
			System.out.println("01.드라이버 연결 실패");
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost/multi";
		String id = "root";
		String pw = "1234";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("02.계정연결");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("02.계정연결 실패");
			e.printStackTrace();
		}

		return con;
	}
	public static void close(Connection con) {
		try {
			con.close();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			stmt.close();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close (Connection con,Statement stmt,ResultSet rs) {
		try {
			con.close();
			stmt.close();
			rs.close();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	public static void close (Connection con,Statement stmt) {
		try {
			con.close();
			stmt.close();	
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
