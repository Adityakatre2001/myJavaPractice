package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.app.StyleWithPen.Brand;
import com.app.StyleWithPen.Material;
import com.app.StyleWithPen.StyleWithPen;

public class StyleWithPenUtils {
	/*
	 * int id, Brand brand, String color, String inkcolor, Material material, double
	 * stock, LocalDate stock_update_date, LocalDate stock_listing_date, double
	 * price, float discounts
	 */
	public static StyleWithPen addPen(int id,String brandname,
			String color,String inkcolor,String material,double stock,String stock_update_date,String stock_listing_date,double price,float discounts)
	{
		Brand b=Brand.valueOf(brandname.toUpperCase());
		Material m=Material.valueOf(material.toUpperCase());
		LocalDate stockupdatedate=LocalDate.parse(stock_update_date);
		LocalDate stocklistingdate=LocalDate.parse(stock_listing_date);
		return new StyleWithPen(id,b,color,inkcolor,m,stock,stockupdatedate,stocklistingdate,price,discounts);
	}
	
	public static StyleWithPen updateStock(int id, double stock, List<StyleWithPen> pen_list) {
		StyleWithPen idpen=new StyleWithPen(id);
		int i=pen_list.indexOf(idpen);
		System.out.println(i);
		StyleWithPen updatestock= pen_list.get(i);
		updatestock.setStock(stock);
		return updatestock;
	}
	
	public static List<StyleWithPen> updateDiscount(List<StyleWithPen> pen_list) {
		List<StyleWithPen> discountpen=new ArrayList<>();
		for(StyleWithPen a:pen_list)
		{
			int month=Period.between(a.getStock_listing_date(),a.getStock_update_date()).getMonths();
			if(month>=3)
			{
				a.setDiscounts(20);
				discountpen.add(a);
				
			}
		}
		return discountpen;
	}
	
	public static String removePen(List<StyleWithPen> pen_list) {
		
		for(StyleWithPen a:pen_list)
		{
			int month=Period.between(a.getStock_listing_date(),a.getStock_update_date()).getMonths();
			if(month>=9)
			{
				StyleWithPen idpen=new StyleWithPen(a.getId());
				int i=pen_list.indexOf(idpen);
				pen_list.remove(i);
				
			}
		}
		return "Pen is Removed";
	}


}
