package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.app.utils.StyleWithPenUtils.*;

import com.app.StyleWithPen.StyleWithPen;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			List<StyleWithPen> pen_list=new ArrayList<>();
			boolean exit=false;
		 try {
			while(!exit)
			{
			 System.out.println("--------Admin Menu------------");
			 System.out.println("1.Add new Pen");
			 System.out.println("2.Update stock of A Pen");
			 System.out.println("3.Set discount of 20% for all the pens which are not at all sold in last 3 months");
			 System.out.println("4. Remove Pens which arenever sold once listed in 9 months");
			 System.out.print("Enter your choice : ");
			 switch(sc.nextInt())
			 {
			 case 1:
				 System.out.println("Enter following information");
				 System.out.println("id,brandname,color,inkcolor,material, stock, stock update date, stock listing date,price, discounts");
				 StyleWithPen item=addPen(sc.nextInt(),sc.next(),
						 sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.nextDouble(),sc.nextFloat());
				 pen_list.add(item);
				 for(StyleWithPen a:pen_list)
				 {
				 System.out.println(a);
				 }
				 break;
			 case 2:
				 //enter id search id on list then update stock of that id pen
				 System.out.println("Enter id of pen And stock of new pen");
				 StyleWithPen update_item= updateStock(sc.nextInt(),sc.nextDouble(),pen_list); 
				 System.out.println(update_item);
				 break;
			 case 3:
				 //return list of all pen which are not sold and increase discoount
				 List<StyleWithPen> updatediscount=updateDiscount(pen_list);
				 for(StyleWithPen a:updatediscount)
				 {
				 System.out.println(a);
				 }
				 break;
			 case 4:
				 System.out.println(removePen(pen_list));
				 break;
			 case 5:
				 System.out.println("------------------------Exit--------------");
				 exit=true;
				 break;
			 }
			 
			}
		} catch(Exception e)
			{
				sc.nextLine();
				System.out.println(e);
			}
		}
		

	}

	}


