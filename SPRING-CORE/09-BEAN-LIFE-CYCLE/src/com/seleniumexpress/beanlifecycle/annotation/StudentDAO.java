package com.seleniumexpress.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;

	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("Inside the custom init method...!");
		createStudentDBConnection();
	}
	
	
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		
		System.out.println("Creating Connection for Student DB");
		// Load Driver Class
		Class.forName(driver);

		// get a connection
	 con = DriverManager.getConnection(url, userName, password);
	}

	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrived All Records..!!");
		// execute Query
		
		
		Statement stmt = con.createStatement();
	
		ResultSet rs = stmt.executeQuery("SELECT * FROM springcore.hostelstudentinfo");

		while (rs.next()) {

			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hotelFee = rs.getDouble(3);
			String foodType = rs.getString(4);

			System.out.println(studentId + "--" + studentName + "--" + hotelFee + "--" + foodType);
		}

	}

	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {

		// execute Query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("DELETE FROM springcore.hostelstudentinfo where Student_id = " + studentId);
		System.out.println("Record deleted with the id " + studentId);

	}

	//@PreDestroy
	public void closeConnection() throws SQLException {
		// closing the Databasecconnection
		
		System.out.println("inside destroy method called..!!!");
		con.close();
	}
}
