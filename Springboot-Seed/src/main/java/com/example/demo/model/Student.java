package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_seed")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  id;
	
	@Column(name = "studentName")
	private String studentName;
	
	
	@Column(name = "emailId")
	private String emailId;
	
	
	
	@Column(name = "course")
     private String course;
	
	@Column(name = "address")
	private String address;
	
	
	@Column(name = "addmission_status")
	private String addmission_status;
	
	@Column(name = "mobileNo")
	private String mobileNo;
	
	
	public Student() {
		super();
	}


	public Student( String studentName, String emailId, String course, String address, String addmission_status,
		String mobileNo) {
		super();
		
		this.studentName = studentName;
		this.emailId = emailId;
		this.course = course;
		this.address = address;
		this.addmission_status = addmission_status;
		this.mobileNo = mobileNo;
		
	}


	public long getId() 
	{
		return id;
	}


	public void setId(long id) 
	{
		this.id = id;
	}


	public String getStudentName() 
	{
		return studentName;
	}


	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}


	public String getEmailId() 
	{
		return emailId;
	}


	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}


	public String getCourse() 
	{
		return course;
	}


	public void setCourse(String course) 
	{
		this.course = course;
	}


	public String getAddress() 
	{
		return address;
	}


	public void setAddress(String address)
	{
		this.address = address;
	}


	public String getAddmission_status() {
		return addmission_status;
	}


	public void setAddmission_status(String addmission_status) {
		this.addmission_status = addmission_status;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
	
	
	