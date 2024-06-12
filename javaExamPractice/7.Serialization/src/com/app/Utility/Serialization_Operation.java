package com.app.Utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Serialization;

public class Serialization_Operation {
	
	
	public static void addItem(Serialization s,List<Serialization>sList) {
		sList.add(s);
		System.out.println(sList.toString());
	}
	
	// sorting by item id
	public static List<Serialization> sortByItemCode(List<Serialization>srList) {
		Collections.sort(srList,new Comparator<Serialization>(){

			@Override
			public int compare(Serialization o1, Serialization o2) {
				
				 return o1.getItemCode().compareTo(o2.getItemCode());
			}
		});
		return srList;

	}
	
	public static List<Serialization> sortItemByCost(List<Serialization>srList) {
		Collections.sort(srList,new Comparator<Serialization>() {

			@Override
			public int compare(Serialization o1, Serialization o2) {
				
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		return srList;
		
	}
	
//	public static void serialize(List<Serialization>seList,String filename) throws FileNotFoundException, IOException {
//		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
//			out.writeObject(seList);
//			System.out.println("Serialized data is stored in " + filename);
//		}
//		
//	}
	
}
	


