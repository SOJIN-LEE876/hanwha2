package com.hanwha.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO_Mybatis {
	
	@Autowired
	SqlSession session;
	
	
	public List<Integer> selectAllManager() {
		return session.selectList("com.hanwha.member.selectAllManager");
	}
	
	
	public List<MemberVO> selectByClass(int c_id) {
		return session.selectOne("com.hanwha.member.selectByClass", c_id);
	}
	
	public List<MemberVO> selectByManager(int managerid) {
		return session.selectOne("com.hanwha.member.selectByManager", managerid);
	}
	
	public List<MemberVO> selectAll() {
		return session.selectList("com.hanwha.member.selectAll");
	}
	
	public MemberVO selectById(int memberid) {
		return session.selectOne("com.hanwha.member.selectById", memberid);
	}
	
	public int deleteMember(int memberid) {
		return session.delete("com.hanwha.member.delete", memberid);
	}

	public int updateMember(MemberVO member) {
		return session.update("com.hanwha.member.update", member);
	}

	public int insertEmp(MemberVO member) {
		return session.update("com.hanwha.member.insert", member);
	}
	
}
