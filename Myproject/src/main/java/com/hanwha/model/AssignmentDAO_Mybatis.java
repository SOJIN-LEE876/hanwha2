package com.hanwha.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AssignmentDAO_Mybatis {

	@Autowired
	SqlSession session;
	
	public List<AssignmentDTO> selectAll() {
		return session.selectList("com.hanwha.assignment.selectAll");
	}
	
	public List<AssignmentDTO> selectAllbyId(int assignmentid) {
		return session.selectList("com.hanwha.assignment.selectAllbyId", assignmentid);
	}

	public AssignmentDTO selectById(int assignmentid) {
		return session.selectOne("com.hanwha.assignment.selectbyid", assignmentid);
	}
	
	public int insertAssignment(AssignmentDTO assignment) {
		return session.insert("com.hanwha.assignment.insert", assignment);
	}
	
	
	public int updateAssignment(AssignmentDTO dto) {
		return session.update("com.hanwha.assignment.update", dto);
	}
	
	public int deleteAssignment(AssignmentDTO dto) {
		return session.delete("com.hanwha.assignment.delete", dto);
	}
	
	public AssignmentDTO selectByIdandWeek(AssignmentDTO dto) {
		return session.selectOne("com.hanwha.assignment.selectByIdandWeek", dto);
	}
	


}
