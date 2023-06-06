import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		
		Calendar caldr = Calendar.getInstance();
		System.out.println("Year 	 : " + caldr.get(Calendar.YEAR));
		System.out.println("Month    : " + caldr.get(Calendar.MONTH));
		System.out.println("Day_Of_Month : " + caldr.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week " + caldr.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("HOUR   : " + caldr.get(Calendar.HOUR));
		System.out.println("Minute   : " + caldr.get(Calendar.MINUTE));
		System.out.println("Second   : " + caldr.get(Calendar.SECOND));
		
	}

}
