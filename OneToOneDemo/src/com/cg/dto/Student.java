package com.cg.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String sname;
	
	@OneToMany(mappedBy="stu", cascade=CascadeType.ALL)
	//@JoinColumn(name="addId")
	
	private Set<Address> address;
	
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	public Student(int rollno, String sname, Set<Address> address) 
	{
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.address=address;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
}
