package com.royal.core.ioc;

public class Food {
	private int id;
	private String name;
	private double price;
	private boolean isAvailable;
	
	public Food() {
		this.id = 1;
		this.name = "ladoo";
		this.price = 200;
		this.isAvailable = true;
		
	}
	
	public Food(int id, String name, double price, boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
		
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
}
