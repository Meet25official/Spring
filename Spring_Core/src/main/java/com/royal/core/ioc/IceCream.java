package com.royal.core.ioc;

public class IceCream {
	private String name;
	private String fla;
	private double price;
	
	public IceCream() {
		this.name = "hocco";
		this.fla = "mango";
		this.price = 20;
	}
	
	public IceCream(String name, String fla, double price) {
		this.name = name;
		this.fla = fla;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "IceCream [name=" + name + ", fla=" + fla + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFla() {
		return fla;
	}

	public void setFla(String fla) {
		this.fla = fla;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
