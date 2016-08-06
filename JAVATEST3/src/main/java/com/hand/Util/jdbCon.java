package com.hand.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbCon {
	private static jdbCon jdbcon;
	private   jdbCon(){
			}
public static jdbCon getjdbCon(){
	if(jdbcon==null)
	{
		jdbcon=new jdbCon();
	}
	return jdbcon;	
}
public   Connection  getConnection(){
		
 Connection connection=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?"+"user=root&password=zhuzhiyang&useUnicode=true&characterEncoding=UTF8" );
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  return connection;
 }
}
