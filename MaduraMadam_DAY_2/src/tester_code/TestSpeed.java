package tester_code;
//import custom_exceptions.SpeedOutOfRangeException;
import static utility_code.VehicleValidationRules.validspeed;
import java.util.Scanner;

public class TestSpeed {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner (System.in)){
			System.out.print("Enter Speed : ");
			validspeed(scan.nextInt());
			
		}catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.hashCode());
			e.printStackTrace();
			e.getClass();
			
		}
		System.out.println("Main is over ");

	}

}
