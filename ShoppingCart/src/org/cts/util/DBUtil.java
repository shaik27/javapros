package org.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection con=null;
	public static Connection getConnection(String driver,String url,String uname,String pwd)
	{
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,uname,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}
