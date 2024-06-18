package com.may23;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	int cid;
	String company;
	
	@Column(name = "carowner")
	private String ownername;
	String cost;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int cid, String comapany, String carowner, String cost) {
		super();
		this.cid = cid;
		this.company = comapany;
		this.ownername = carowner;
		this.cost = cost;
	}

	public Car(String comapany, String carowner, String cost) {
		super();
		this.company = comapany;
		this.ownername = carowner;
		this.cost = cost;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getComapany() {
		return company;
	}

	public void setComapany(String comapany) {
		this.company = comapany;
	}

	public String getCarowner() {
		return ownername;
	}

	public void setCarowner(String carowner) {
		this.ownername = carowner;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", comapany=" + company + ", carowner=" + ownername + ", cost=" + cost + "]";
	}

}
