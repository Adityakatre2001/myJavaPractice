package com.pen;

import java.time.LocalDate;

public class Pen 
{
//	You can define a class Pen with the following fields – 
//	a.	ID (unique identifier for each Pen, should be generated automatically)
//	b.	Brand (Example:  Cello, Parker, Reynolds etc.)
//	c.	Color
//	d.	InkColor
//	e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
//	f.	Stock (Available quantity)
//	g.	Stock Update Date (it changed every time when admin update stock or user order executed)
//	h.	Stock Listing Date (date on which product is added to site for sale)
//	i.	Price (in INR) 
//	j.	Discounts (in percentage)
	private static int cnt=1;
	private int id;
	private String Brand;
	private String color;
	private String InkColor;
	private String Material;
	private int Stock;
	private LocalDate StockUpdateDate;
	private LocalDate StockListingDate;
	private double Price;
	private double Discounts;
	
	
	public Pen(String brand, String color, String inkColor, String material, int stock, LocalDate stockUpdateDate,
			LocalDate stockListingDate, double price) 
	{
		super();
		this.id=cnt++;
		this.Brand = brand;
		this.color = color;
		this.InkColor = inkColor;
		this.Material = material;
		this.Stock = stock;
		this.StockUpdateDate = stockUpdateDate;
		this.StockListingDate = stockListingDate;
		this.Price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkColor() {
		return InkColor;
	}


	public void setInkColor(String inkColor) {
		InkColor = inkColor;
	}


	public String getMaterial() {
		return Material;
	}


	public void setMaterial(String material) {
		Material = material;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}


	public LocalDate getStockUpdateDate() {
		return StockUpdateDate;
	}


	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		StockUpdateDate = stockUpdateDate;
	}


	public LocalDate getStockListingDate() {
		return StockListingDate;
	}


	public void setStockListingDate(LocalDate stockListingDate) {
		StockListingDate = stockListingDate;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}


	public double getDiscounts() {
		return Discounts;
	}


	public void setDiscounts(double d) {
		Discounts = d;
	}


	@Override
	public String toString() {
		return "Id=" +id + ", Brand=" + Brand + ", color=" + color + ", InkColor=" + InkColor + ", Material=" + Material
				+ ", Stock=" + Stock + ", StockUpdateDate=" + StockUpdateDate + ", StockListingDate=" + StockListingDate
				+ ", Price=" + Price + ", Discounts=" + Discounts;
	}
	
	
	//override equals method inherited from obj class
	
	/*
	 * @Override 
	 * public boolean equals(Object o) 
	 * {
	 * System.out.println("In Equals methods--->"); 
	 * if(o instanceof Pen) 
	 * { 
	 * return id==((Pen)o.id); 
	 * } 
	 * return false;
	 * }
	 */	
		
}
