package com.cg.mobapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Mobile 
{
	@Id
	@Column(name="mob_id")
	private int mobId;
	
	@Column(name="mob_name")
	private String mobName;
	
	@Column(name="mob_category")
	private String mobCategory;
	
	@Column(name="mob_price")
	private double mobPrice;
	
	@Column(name="mob_online")
	private String online;
	
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}
	public double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	
	
}
