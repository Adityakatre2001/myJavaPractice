package com.pen;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pen_Operation 
{
	
	List<Pen> penList=new ArrayList<Pen>();
	
	public void addPenData(Pen p)
	{
			penList.add(p);
			System.out.println("Data added Successfully...! ");
	}
	
	public void updateStock(int id, int stock)
	{
		for(Pen p: penList)
		{
			if(p.getId()==id)
			{
				p.setStock(stock);
				System.out.println("Stock Updated Successfully!");
			}
			else
			{
				System.out.println("Failed to update Stock !!!!");
			}
		}
	}
	
	public void setUnsoldedDiscount()
	{
		LocalDate currentDate=LocalDate.now();
		for(Pen p: penList)
		{
			int month=Period.between(p.getStockUpdateDate(), currentDate).getMonths();
			if(month>=3)
			{
				p.setDiscounts(20.0);
				
				System.out.println("Discounts updated for unsold pens!");
			}
			
			else
			{
				System.out.println("Discount Failed for unsold pens !!!!!");
			}
		}
		
	}
	
	public void removeUnsoldedPens()
	{
		LocalDate currentDate=LocalDate.now();
		
		Iterator<Pen> i= penList.iterator();
		
		while(i.hasNext())
		{
			Pen p=i.next();
			if(Period.between(p.getStockListingDate(), currentDate).getMonths()>=9)
			{
				i.remove();
			}
		}
		System.out.println("Removed pens that were never sold in the last 9 months!");
	}
	
	
	public void displayPenData()
	{
		if(penList.isEmpty())
		{
			System.out.println("Empty Data !!!!");
		}
		
		else
		{
			for(Pen p: penList)
			{
				System.out.println(p);
			}
		}
	}
}
