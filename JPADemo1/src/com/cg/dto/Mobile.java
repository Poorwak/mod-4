package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiles")
public class Mobile 
{
	@Id
	private int mobileid;
	
	@Column(name="name") 		//if table name and column name are different then add @column annotation
	private String mname;
	
	private double price;
	
	@Column(name="quantity")
	private int qty;

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Mobile(int mobileid, String mname, double price, int qty) {
		super();
		this.mobileid = mobileid;
		this.mname = mname;
		this.price = price;
		this.qty = qty;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mobile [mobileid=" + mobileid + ", mname=" + mname + ", price="
				+ price + ", qty=" + qty + "]";
	}
	
	
	
}
