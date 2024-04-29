package string;

public class TestString {

	//private static CharSequence '';

	public static void main(String[] args) {
		String s1 = new String("hello");
		s1 = s1.concat(" Aditya");
		System.out.println(s1);
		System.out.println(s1.concat(" Aditya"));
		System.out.println(s1);
		s1 += " Are you Student !!!";
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.substring(4,28));
		String s2 = s1.substring(6,28);
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1.replace('A','d'));
		
		//s2 = s1.replace('S','d');
		System.out.println(s2);
		
		System.out.println(s2.replaceAll("ditya", "dinath"));
		

	}

}

