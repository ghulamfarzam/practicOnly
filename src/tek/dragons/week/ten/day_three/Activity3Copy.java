package tek.dragons.week.ten.day_three;

import java.util.Scanner;
import java.util.Set;

public class Activity3Copy {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scanner.next();
        scanner.close();
        
        if (password.length() >= 8) {           
        	String keepDigits = password.replaceAll("[^0-9]", "");
            if(keepDigits.length() >= 1) {          
            	String upperCaseLetters = password.replaceAll("[^A-Z]", "");
                if (upperCaseLetters.length() >= 1) {                  
                	String specialCharacters = password.replaceAll("[A-Za-z0-9]", "");
                    if (specialCharacters.length() >= 1) {
                        System.out.println("Valid Password");
                    }else {
                        System.out.println("Password should contain at least 1 Special Character");
                    }
                }else {
                    System.out.println("Password should contain at least 1 Upper Case Letter");
                }
            }else {
                System.out.println("Password should contain at least 1 digits");
            }       
        }else {
            System.out.println("Password Length should be more that 8 Character");
        }
    }
}
	

