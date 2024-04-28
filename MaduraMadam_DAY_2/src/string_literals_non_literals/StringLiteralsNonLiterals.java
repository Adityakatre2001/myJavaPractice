package string_literals_non_literals;

public class StringLiteralsNonLiterals {

	public static void main(String[] args) {
		String s1 = "aditya";
		String s2 = new String(s1);
		String s3 = "aditya";
		String s4 = "Aditya";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		s1=s2=s3=s4=null;
		
		String s5 = "aditya";
		System.out.println(s1);
		System.out.println(s5);
		try{
		System.out.println("Length of String is : " + s1.length());}
		catch (Exception e) {
			System.out.println("Error Occurd");
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.hashCode());
			//e.printStackTrace();
			e.getClass();
		}
		

	}

}
