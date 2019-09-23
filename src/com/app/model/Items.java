package com.app.model;

public class Items {

	private int id;
	private String itemname;
	private String itemcode;
	private double price;

	public Items(int id, String itemname, String itemcode, double price) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.itemcode = itemcode;
		this.price = price;
	}

	public Items() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemname=" + itemname + ", itemcode=" + itemcode + ", price=" + price + "]";
	}
}
