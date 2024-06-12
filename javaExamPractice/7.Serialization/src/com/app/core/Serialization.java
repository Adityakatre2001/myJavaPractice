package com.app.core;

import java.time.LocalDate;

/*
7. Create java application for the following.
 Create Item class with following
	Item Code ( String) : primary key
	Description : String
	Price : double
	Shipment Date : Date
Create Tester Java Application to accept Item details from user (minimum -- 5 items) using Scanner.
Store them in a suitable data structure.
 Sort these details as per Item code. Store them in binary file using serialization technique, before terminating from application.(file name : items_code.ser)
 
Sort these details as per Item price. Store them in binary file using serialization technique, before terminating from application
Note : Use Scanner to accept details from user.
 */
public class Serialization {
	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	
	
	public Serialization(String itemCode, String description, double price, LocalDate shipmentDate) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public LocalDate getShipmentDate() {
		return shipmentDate;
	}


	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}


	@Override
	public String toString() {
		return "Serialization [itemCode=" + itemCode + ", description=" + description + ", price=" + price
				+ ", shipmentDate=" + shipmentDate + "]";
	}
	
	
	
	
	

}
