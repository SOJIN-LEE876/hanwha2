package com.hanwha.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmpDAO_Mybatis dao;
	//EmpDAO dao;
	
	public List<String> selectAllJob() {
		return dao.selectAllJob();
	}

	public List<Integer> selectAllManager() {
		return dao.selectAllManager();
	}

	

	public List<EmpVO> selectByDept(int deptid) {
		return dao.selectByDept(deptid);
	}

	public List<EmpVO> selectAll() {
		return dao.selectAll();
	}

	public EmpVO selectById(int empid) {
		return dao.selectById(empid);
	}

	public int deleteEmp(int empid) {
		return dao.deleteEmp(empid);
	}

	public int updateEmp(EmpVO emp) {
		return dao.updateEmp(emp);
	}

	public int insertEmp(EmpVO emp) {
		return dao.insertEmp(emp);
	}
}
