package com.hanwha.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO_Mybatis {
	
	@Autowired
	SqlSession session;
	
	public List<String> selectAllJob() {
		return session.selectList("com.hanwha.emp.selectAllJob");
	}
	public List<Integer> selectAllManager() {
		return session.selectList("com.hanwha.emp.selectAllManager");
	}
	
	
	public List<EmpVO> selectByDept(int deptid) {
		return session.selectOne("com.hanwha.emp.selectByDept", deptid);
	}
	
	public List<EmpVO> selectAll() {
		return session.selectList("com.hanwha.emp.selectAll");
	}
	
	public EmpVO selectById(int empid) {
		return session.selectOne("com.hanwha.emp.selectById", empid);
	}
	
	public int deleteEmp(int empid) {
		return session.delete("com.hanwha.emp.delete", empid);
	}

	public int updateEmp(EmpVO emp) {
		return session.update("com.hanwha.emp.update", emp);
	}

	public int insertEmp(EmpVO emp) {
		return session.update("com.hanwha.emp.insert", emp);
	}
	
}
