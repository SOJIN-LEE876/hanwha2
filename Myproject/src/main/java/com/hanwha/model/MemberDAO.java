package com.hanwha.model;

import java.sql.*;

import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MemberDAO {

	@Autowired
	DataSource ds;

	public List<MemberVO> selectByClass(int c_id) {
		List<MemberVO> memberlist = new ArrayList<>();
		Connection conn = null;
		Statement st = null;
		String sql = "select * from member where class_id=" + c_id;
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int m_id = rs.getInt("m_id");
				String m_name = rs.getString("m_name");
				int manager_id = rs.getInt("manager_id");
				int class_id = rs.getInt("class_id");

				MemberVO member = new MemberVO(m_id, m_name, manager_id, class_id);
				memberlist.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberlist;
	}
	
	public List<MemberVO> selectByManager(int managerid) {
		List<MemberVO> memberlist = new ArrayList<>();
		Connection conn = null;
		Statement st = null;
		String sql = "select * from member where manager_id=" + managerid;
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int m_id = rs.getInt("m_id");
				String m_name = rs.getString("m_name");
				int manager_id = rs.getInt("manager_id");
				int class_id = rs.getInt("class_id");

				MemberVO member = new MemberVO(m_id, m_name, manager_id, class_id);
				memberlist.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberlist;
	}


	public List<MemberVO> selectAll() {
		List<MemberVO> memberlist = new ArrayList<>();
		Connection conn = null;
		Statement st = null;
		String sql = "select * from member";
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {

				int m_id = rs.getInt("m_id");
				String m_name = rs.getString("m_name");
				int manager_id = rs.getInt("manager_id");
				int class_id = rs.getInt("class_id");

				MemberVO member = new MemberVO(m_id, m_name, manager_id,class_id);
				memberlist.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberlist;
	}

	public MemberVO selectById(int memberid) {
		MemberVO member = null;
		Connection conn = null;
		Statement st = null;
		String sql = "select * from member where m_id= " + memberid;
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int m_id = rs.getInt("m_id");
				String m_name = rs.getString("m_name");
				int manager_id = rs.getInt("manager_id");
				int class_id = rs.getInt("class_id");

				member = new MemberVO(m_id, m_name, manager_id,class_id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public int deleteMember(int memberid) {
		Connection conn = null;
		PreparedStatement st = null;
		int result = 0;
		String sql = " delete from member " + " where m_id = ? ";
		try {
			conn = ds.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, memberid);

			result = st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public int updateMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement st = null;
		int result = 0;
		String sql = " update member "
				+ " set m_name =?,manager_id=?,class_id=?"
				+ " where m_id =? ";
		try {
			conn = ds.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(4, member.getM_id());
			st.setString(1, member.getM_name());
			st.setInt(2, member.getManager_id());
			st.setInt(3, member.getClass_id());

			result = st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public List<Integer> selectAllManager() {
		List<Integer> mlist = new ArrayList<>();
		Connection conn = null;
		Statement st = null;
		String sql = "select distinct manager_id from member";
		ResultSet rs = null;
	
		try {
			conn = ds.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				mlist.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mlist;
	}
	
	
	public int insertMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement st = null;
		int result = 0;
		String sql = " insert into member " + " values(?,?,?,?)";
		try {
			conn = ds.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, member.getM_id());
			st.setString(2, member.getM_name());
			st.setInt(3, member.getManager_id());
			st.setInt(11, member.getClass_id());

			result = st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
