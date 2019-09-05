package com.hanwha.model;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanwha.util.DBUtil_Oracle;

//DAO(Data Access Object):Business logic
//<bean id="deptDAO" class = "com.hanwha.model.DeptDAO"/>
@Repository
public class ScheduleDAO {
	
	@Autowired
	DataSource ds;
	

	public List<ScheduleDTO> selectAll() {
		List<ScheduleDTO> schedulelist = new ArrayList<>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from schedule";
		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				String book = rs.getString("book");
				String section = rs.getString("section");
				String d_QT = rs.getString("d_QT");
				String reading = rs.getString("reading");
				ScheduleDTO schedule = new ScheduleDTO(book,section,d_QT,reading);
				schedulelist.add(schedule);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil_Oracle.dbClose(rs, st, conn);
		}
		return schedulelist;
	}

	
}
