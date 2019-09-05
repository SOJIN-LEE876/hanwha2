package com.hanwha.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO_Mybatis dao;
	

	public List<Integer> selectAllManager() {
		return dao.selectAllManager();
	}

	public List<MemberVO> selectByClass(int c_id) {
		return dao.selectByClass(c_id);
	}

	public List<MemberVO> selectByManager(int managerid) {
		return dao.selectByManager(managerid);
	}
	
	public List<MemberVO> selectAll() {
		return dao.selectAll();
	}

	public MemberVO selectById(int memberid) {
		return dao.selectById(memberid);
	}

	public int deleteMember(int memberid) {
		return dao.deleteMember(memberid);
	}

	public int updateMember(MemberVO member) {
		return dao.updateMember(member);
	}

	public int insertMember(MemberVO member) {
		return dao.insertEmp(member);
	}
}
