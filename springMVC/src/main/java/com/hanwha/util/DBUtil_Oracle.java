package com.hanwha.util;

import java.sql.*;

public class DBUtil_Oracle {
	
	
	public static void dbClose(ResultSet rs,Statement st,Connection conn) {
		try {
			if(rs!=null) rs.close();
			if(st!=null) rs.close();
			if(conn!=null) rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
