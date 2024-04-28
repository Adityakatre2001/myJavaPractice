package exception_handling;

public class Test2 {

	public static void main(String[] args) {
		try {
			testme("4541");//try string => testme("Adi");
			System.out.println("End of try block in main ");
			
		}catch(Exception e) {
			System.out.println("Exception occured in mains catch block ");
		}finally {
			System.out.println("printing from mains finally ");
		}
		System.out.println("Out of main");}
		
		
		private static void testme(String s){
			System.out.println("In testme");
			try {
				System.out.println("Parsed int value " + Integer.parseInt(s));
				System.out.println("At the end of methods try block");
			}finally {
				System.out.println("Methods finally block");
			}
			System.out.println("End of method");
		}

	}


