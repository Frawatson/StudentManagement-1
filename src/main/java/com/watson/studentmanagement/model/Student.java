package com.watson.studentmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@NonNull
	@Column(name="student_firstname")
	private String fname;
	@NonNull
	@Column(name="student_lastname")
	private String lname;
	@NonNull
	@Column(name="student_email")
	private String email;
	@NonNull
	@Column(name="student_age")
	private int age;
	@NonNull
	@Column(name="student_phonenumber")
	private long phoneN;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(long phoneN) {
		this.phoneN = phoneN;
	}
	public Student(long id, String fname, String lname, String email, int age, long phoneN) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.age = age;
		this.phoneN = phoneN;
	}
	public Student(String fname, String lname, String email, int age, long phoneN) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.age = age;
		this.phoneN = phoneN;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", age=" + age
				+ ", phoneN=" + phoneN + "]";
	}
	
	
}
