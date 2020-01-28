package com.simiyu.enock.enock.model;

import javax.persistence.*;

@Entity
public class Vehicle {

	private @Id @GeneratedValue Long id;
	private String name;
	private String model;
	private String company;	
	private @Lob String info;
	private double price;
	private double numberInStock;
	private double total;
	private boolean inCart;
	private String picPath;
	public Vehicle() {}	
	public Vehicle(String name, String model, String company, String info, double price, double numberInStock,
			double total,boolean inCart, String picPath) {
		super();
		this.name = name;
		this.model = model;
		this.company = company;
		this.info = info;
		this.price = price;
		this.total = total;
		this.inCart = inCart;
		this.numberInStock = numberInStock;
		
		this.picPath = picPath;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public boolean isInCart() {
		return inCart;
	}
	public void setInCart(boolean inCart) {
		this.inCart = inCart;
	}
	public double getNumberInStock() {
		return numberInStock;
	}
	public void setNumberInStock(double numberInStock) {
		this.numberInStock = numberInStock;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", model=" + model + ", company=" + company + ", info=" + info
				+ ", price=" + price + ", numberInStock=" + numberInStock + ", total=" + total + ", inCart=" + inCart
				+ ", picPath=" + picPath + "]";
	}
	
	
	
	
}
