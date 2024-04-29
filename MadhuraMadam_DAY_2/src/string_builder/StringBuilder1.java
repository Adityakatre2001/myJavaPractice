package string_builder;

import java.util.Date;

public class StringBuilder1 {

	public static void main(String[] args) {
		//System.out.println("Hello");
		StringBuilder sb1 = new StringBuilder("Hello Aditya ");
		System.out.println(sb1.length() + " "  + sb1.capacity());
		StringBuilder sb2 = sb1.append(false );
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1 == sb2);
		sb1.append('a').append(1542).append(" JAGGU DADA ").append(4.22).append(new Date());
		System.out.println(sb1           );
		sb1.insert(sb1.length(), new char[] {'a','b','c','d'},0,3);
		System.out.println(sb1);
		System.out.println(sb1.length() + " " + sb1.capacity());
//		sb1.delete(0,sb1.length());
//		System.out.println("After Deleting " + sb1);
//		System.out.println(sb1.length()+" "+sb1.capacity());
//		sb1.trimToSize();
//		System.out.println(sb1.length()+ " " + sb1.capacity());
		System.out.println(sb1 == sb2);
		System.out.println(sb1);
		System.out.println(sb2);
		
	
	}

}
