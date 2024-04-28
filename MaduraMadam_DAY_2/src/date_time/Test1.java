package date_time;

import java.util.Date;

public class Test1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	Date d1 = new Date();
	System.out.println(d1);
	Date d2 = new Date(10000000);
	System.out.println(d2);
	System.out.println(d1.before(d2));
	System.out.println(d1.after(d2));
	System.out.println(d2.before(d1));
	System.out.println(d2.after(d1));
	System.out.println(d1.getDate());
	System.out.println(d1.getYear());
	System.out.println(d1.compareTo(d2));
	System.out.println(d1.getTimezoneOffset());
	System.out.println(d1.hashCode());
	

	}

}
