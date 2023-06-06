package tek.dragons.week.ten.day_three;

public class Acivity2 {
	public static void main(String[] args) {
		
	
	String text = "Something123";
	
	//Remove any number in this String. 
	
	String remove = text.replaceAll("Something123", "Something");
	System.out.println(remove);
	
	//[0 - 9] range of digits. 
	//[A - Z] range of alphabet A - Z upper case 
	//[a - z] rand of alphabet a - z lower case
	// ^ [0 - 9] ^ = not 0-9 digits. 
	
	String replaced = text.replaceAll("[0 - 9]", "");
	String keepNumber = text.replaceAll("[^0-9]", "");
	System.out.println(replaced);
	System.out.println(keepNumber);
	
	}
}
