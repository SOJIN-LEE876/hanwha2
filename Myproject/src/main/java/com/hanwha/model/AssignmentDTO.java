package com.hanwha.model;


import org.springframework.web.multipart.MultipartFile;


public class AssignmentDTO {
	int assignment_id;
	String assignment_name;
	String week;
	
	MultipartFile uploadfile1;
	String fileName1;

	MultipartFile uploadfile2;
	String fileName2;

	MultipartFile uploadfile3;
	String fileName3;

	public AssignmentDTO() {

	}

	

	public AssignmentDTO(int assignment_id, String assignment_name, String week) {
		super();
		this.assignment_id = assignment_id;
		this.assignment_name = assignment_name;
		this.week = week;
	}



	public int getAssignment_id() {
		return assignment_id;
	}

	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}

	public String getAssignment_name() {
		return assignment_name;
	}

	public void setAssignment_name(String assignment_name) {
		this.assignment_name = assignment_name;
	}

	public MultipartFile getUploadfile1() {
		return uploadfile1;
	}

	public void setUploadfile1(MultipartFile uploadfile1) {
		this.uploadfile1 = uploadfile1;
	}

	public String getFileName1() {
		return fileName1;
	}

	public void setFileName1(String fileName1) {
		this.fileName1 = fileName1;
	}

	public MultipartFile getUploadfile2() {
		return uploadfile2;
	}

	public void setUploadfile2(MultipartFile uploadfile2) {
		this.uploadfile2 = uploadfile2;
	}

	public String getFileName2() {
		return fileName2;
	}

	public void setFileName2(String fileName2) {
		this.fileName2 = fileName2;
	}

	public MultipartFile getUploadfile3() {
		return uploadfile3;
	}

	public void setUploadfile3(MultipartFile uploadfile3) {
		this.uploadfile3 = uploadfile3;
	}

	public String getFileName3() {
		return fileName3;
	}

	public void setFileName3(String fileName3) {
		this.fileName3 = fileName3;
	}

	public String getWeek() {
		return week;
	}


	public void setWeek(String week) {
		this.week = week;
	}

	



	@Override
	public String toString() {
		return "AssignmentDTO [assignment_id=" + assignment_id + ", assignment_name=" + assignment_name
				+ ", week=" + week + ", uploadfile1=" + uploadfile1 + ", fileName1=" + fileName1 + ", uploadfile2="
				+ uploadfile2 + ", fileName2=" + fileName2 + ", uploadfile3=" + uploadfile3 + ", fileName3=" + fileName3
				+ "]";
	}


	

	
	
}
