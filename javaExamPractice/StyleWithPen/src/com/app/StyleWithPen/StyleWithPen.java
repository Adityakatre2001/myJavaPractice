package com.app.StyleWithPen;

import java.time.LocalDate;
import java.util.Objects;

public class StyleWithPen {
	private int id;
	private Brand brand;
	private String color;
	private String inkcolor;
	private Material material;
	private double Stock;
	private LocalDate stock_update_date;
	private LocalDate stock_listing_date;
	private double price;
	private float discounts;
	
	
	public StyleWithPen(int id, Brand brand, String color, String inkcolor, Material material, double stock,
			LocalDate stock_update_date, LocalDate stock_listing_date, double price, float discounts) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.inkcolor = inkcolor;
		this.material = material;
		Stock = stock;
		this.stock_update_date = stock_update_date;
		this.stock_listing_date = stock_listing_date;
		this.price = price;
		this.discounts = discounts;
	}
	public StyleWithPen(int id2) {
		this.id=id2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInkcolor() {
		return inkcolor;
	}
	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public double getStock() {
		return Stock;
	}
	public void setStock(double stock) {
		Stock = stock;
	}
	public LocalDate getStock_update_date() {
		return stock_update_date;
	}
	public void setStock_update_date(LocalDate stock_update_date) {
		this.stock_update_date = stock_update_date;
	}
	public LocalDate getStock_listing_date() {
		return stock_listing_date;
	}
	public void setStock_listing_date(LocalDate stock_listing_date) {
		this.stock_listing_date = stock_listing_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getDiscounts() {
		return discounts;
	}
	public void setDiscounts(float discounts) {
		this.discounts = discounts;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StyleWithPen other = (StyleWithPen) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "StyleWithPen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkcolor=" + inkcolor
				+ ", material=" + material + ", Stock=" + Stock + ", stock_update_date=" + stock_update_date
				+ ", stock_listing_date=" + stock_listing_date + ", price=" + price + ", discounts=" + discounts + "]";
	}
	 
	
   
}
