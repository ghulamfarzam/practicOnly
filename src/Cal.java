import java.util.Calendar;

public class Cal {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Second is " + cal.get(Calendar.SECOND));
		System.out.println("Minute is " + cal.get(Calendar.MINUTE));
		System.out.println("Hour is " + cal.get(Calendar.HOUR));
		System.out.println("Day is " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month is " + cal.get(Calendar.MONTH));
		System.out.println("Year is " + cal.get(Calendar.YEAR));

	}

}
