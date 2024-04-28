package exception_handling;

public class Test5 {

	public static void main(String[] args) {
		try {
			testme("5254");//testme("juu");
			System.out.println("At the end of mains try block");
		}
		catch(Exception e){
			System.out.println("In mains catch all exception block");
		}finally {
		
			System.out.println("In the mains finally block");
		}
		System.out.println("End of main method");
}

private static void testme(String s) throws InterruptedException{
	System.out.println("In testme method");
	try {
		System.out.println("parsed int value " + Integer.parseInt(s));
		Thread.sleep(1000);
		boolean flag = true;
		if(!flag)
			System.exit(0);
		System.out.println("End of methods Try block");
	}finally {
		System.out.println("In methods finally block");
	}
	System.out.println("End of testme method ");
}
}
