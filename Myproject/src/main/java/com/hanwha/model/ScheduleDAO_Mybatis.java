package com.hanwha.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleDAO_Mybatis {
	
	@Autowired
	SqlSession session;
	
	public List<ScheduleDTO> selectAll() {
		return session.selectList("com.hanwha.schedule.selectAll");
	}
	
	
	
}
