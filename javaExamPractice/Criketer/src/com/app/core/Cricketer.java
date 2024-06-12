package com.app.core;
/*
4. Write a class Cricketer with following Fields 
String name,int age,String email_id,String Phone,int rating
This application should contains the test class called CricketerTest which will test 
the functionality of Cricketer class.
Use any collection you like to store the data.
1.Accept minimum 5 Cricketer in the collection.
2.Modify Cricketer's rating
3.Search Cricketer by name
4. Display all Cricketers added in collection.
5.Display All Cricketers in sorted form by rating.
*/

public class Cricketer {
	private String name;
	private int age;
	private String email_id; // make it primary key 
	private String Phone;
	private int rating;
	
	
	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		Phone = phone;
		this.rating = rating;
	}


	public Cricketer(String next, int nextInt) {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email_id=" + email_id + ", Phone=" + Phone + ", rating="
				+ rating + "]";
	}
	
	
	
	
	

}
