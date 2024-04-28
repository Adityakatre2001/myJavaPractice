package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		try {
			String [] names = {"Raghav","Raghu","Ram"};
			System.out.println(names[5]);
			int a = 20;
			int b = 5;
			//System.out.println("Division : " + (a/0));
			System.out.println("Integer value : " + Integer.parseInt("Adity"));
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException |ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurd");
		}
		catch(Exception e) {
			System.out.println("In catch - all block ");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}
		System.out.println("Main continues");

	}

}
