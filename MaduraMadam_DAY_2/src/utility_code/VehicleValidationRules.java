package utility_code;
//import custom_exceptions.SpeedOutOfRangeException; 
public class VehicleValidationRules {
	public static final int MAX_SPEED;
	public static final int MIN_SPEED;
	static {
		MAX_SPEED = 80;
		MIN_SPEED = 40;
	}
	
	public static void validspeed(int speed) throws Exception{
		if(speed > MAX_SPEED) {
			System.out.println("Drive Slow You are driving too fast ");
		}
		if(speed < MIN_SPEED) {
			System.out.println("Drive Fast You are driving too slowly ");
			
		}
		System.out.println("Speed with in Range");
	}

}
