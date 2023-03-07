package com.skillcube.driver.util;

public class AppConstant {

	static String dbURL = "jdbc:mysql://localhost:3306/DRIVERDB";
	static String username = "root";
	static String password = "root";

	public static String sqlAllDrivers = "select * from driver";

	public static String sqlSaveDriver = "insert into driver(driverId,firstName,telephonebnumber,address,city,enginesize,quoteamount)values(?,?,?,?,?,?,?)";

	public static String sqlDeleteDriverById = "delete from driver where driverId=?";

}
