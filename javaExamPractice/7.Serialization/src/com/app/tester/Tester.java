package com.app.tester;
import static com.app.Utility.Serialization_Operation.addItem;
import static com.app.Utility.Serialization_Operation.sortByItemCode;
import static com.app.Utility.Serialization_Operation.sortItemByCost;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Serialization;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(Scanner sc = new Scanner(System.in)){
			List<Serialization> seriList = new ArrayList<Serialization>();
			int choice;
			String ch="";
			do {
			
			System.out.println("*********** Welcome ***********");
			System.out.println("1. Add item in Collection");
			System.out.println("2. Sort By Item Code");
			System.out.println("3. Sort By Item Price");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter item details in below Format");
				System.out.println("itemCode, description, price, shipmentDate");
				Serialization s = new Serialization(sc.next(), sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()));
				addItem(s, seriList);
				System.out.println("Item Added SucessFully");
				break;
			case 2:
				
				List<Serialization> s1 =sortByItemCode(seriList);
				System.out.println(s1);
				//serialize(s1, "Item_code.ser");
				break;
			case 3:
				List<Serialization>s2 = sortItemByCost(seriList);
				System.err.println(s2);
				//serialize(seriList, "Item_price.ser");
				break;

			default:
				System.out.println("invalid input");
				break;
				
			}
			
			
			System.out.println("Enter Any Key to continue");
			ch=sc.next();			
			}while(ch.equalsIgnoreCase(ch));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	 

}
