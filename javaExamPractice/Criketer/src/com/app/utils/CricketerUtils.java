package com.app.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Cricketer;

public class CricketerUtils {
	//List<Cricketer> cricketerList;
	
	public CricketerUtils() {
		//cricketerList = new ArrayList<Cricketer>(); 
	}
	
	public void addCricketer(Cricketer c,List<Cricketer>criList) {
		criList.add(c);
		System.out.println("Cricketer Entery Done Succesfully");
		//System.out.println(cricketerList);
		System.out.println(criList);
	}
	
	
	//to update Rating
	public List<Cricketer> changeRating(String email,int rating,List<Cricketer> criList) {
		for(Cricketer c : criList) {
			if(c.getEmail_id().equals(email)){
				c.setRating(rating);
				System.out.println("Rating updated sucessfully and updated Rating is : " + c.getRating());
			}
		}
		return criList;
	}
	
	
	// to search player by name;
	public List<Cricketer> searchCricketerByName(String name,List<Cricketer> criList) {
		List<Cricketer>tempList=new ArrayList<Cricketer>();
		for(Cricketer c : criList) {
			if(c.getName().equalsIgnoreCase(name)) {
				System.out.println(c.toString());
				tempList.add(c);
			
			}
			
		}
		return tempList;
		
	}
	
	public void displayPlayerList(List<Cricketer>criList) {
		if(criList.isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
		for(Cricketer c : criList)
			System.out.println(c);
		}
	}


//	public void displayPlayerList1() {
//		for(Cricketer c : cricketerList)
//		System.out.println(c);
//		
//	}


	public List<Cricketer> searchCricketerByName1(String name,List<Cricketer>criList) {
		for(Cricketer c : criList) {
			if(c.getName().equalsIgnoreCase(name)) {
				System.out.println(c.toString());
			
			}
			
		}
		return criList;
		
		
	}

	public void addCricketer1(Cricketer c, List<Cricketer> cricketerList) {
		// TODO Auto-generated method stub
		
	}
		
		
		//To sort by Rating
		 public List<Cricketer> sortByRating(List<Cricketer> criList) {
		        Collections.sort(criList, new Comparator<Cricketer>() {
		            @Override
		            public int compare(Cricketer c1, Cricketer c2) {
		                return Integer.compare(c1.getRating(), c2.getRating());
		            }
		        });
				return criList;
		    }
		
		 
		
	}
	
	


