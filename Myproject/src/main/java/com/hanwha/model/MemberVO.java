package com.hanwha.model;



public class MemberVO {
	 int m_id;
	 String m_name;
	 int manager_id;
	 int class_id;
	 
	 public MemberVO() {  }

	public MemberVO(int m_id, String m_name, int manager_id, int class_id) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.manager_id = manager_id;
		this.class_id = class_id;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "MemberVO [m_id=" + m_id + ", m_name=" + m_name + ", manager_id=" + manager_id + ", class_id=" + class_id
				+ "]";
	}
	 
	
	 
	 
	 
	 
	 
	 
	 
}
