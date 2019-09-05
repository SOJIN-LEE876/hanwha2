package com.hanwha.model;



//DTO(Date Transfer Object)
//VO(Value Object)

public class ScheduleDTO {
	String book;
	String section;
	String d_QT;
	String reading;
	 
	
	public ScheduleDTO() {

	}


	public ScheduleDTO(String book, String section, String d_QT, String reading) {
		super();
		this.book = book;
		this.section = section;
		this.d_QT = d_QT;
		this.reading = reading;
	}


	public String getBook() {
		return book;
	}


	public void setBook(String book) {
		this.book = book;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public String getD_QT() {
		return d_QT;
	}


	public void setD_QT(String d_QT) {
		this.d_QT = d_QT;
	}


	public String getReading() {
		return reading;
	}


	public void setReading(String reading) {
		this.reading = reading;
	}


	@Override
	public String toString() {
		return "ScheduleDTO [book=" + book + ", section=" + section + ", d_QT=" + d_QT + ", reading=" + reading + "]";
	}


	

	

	
	

}
