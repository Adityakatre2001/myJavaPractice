package exception_handling;

public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		try {
			testme("1542");//testme("juu");
			System.out.println("At the end of mains try block");
		}finally {
			System.out.println("In the mains finally block");
		}
		System.out.println("End of main method");

	}
	private static void testme(String s) throws InterruptedException{
		System.out.println("in testme method");
		try {
			System.out.println("Parsed int value " + Integer.parseInt(s));
			Thread.sleep(5000);
			System.out.println("End of methods try block");
		}finally {
			System.out.println("In methods finally block");
		}System.out.println("End of test me method");
	}

}
