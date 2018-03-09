package com.cg.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address 
{
	@Id
	private int addId;
	private String addLine;
	private String city;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="rollNo")
	private Student stu;
	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddLine() {
		return addLine;
	}
	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int addId, String addLine, String city, Student stu) {
		super();
		this.addId = addId;
		this.addLine = addLine;
		this.city = city;
		this.stu=stu;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addLine=" + addLine + ", city="
				+ city + "]";
	}
	
	
}
