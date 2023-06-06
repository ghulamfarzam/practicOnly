package tek.dragons.week.ten.day_three;

import java.util.Scanner;
import java.util.Set;

public class Activity3 {

	public static void main(String[] args) {
		// Create a Password check code
		// Take user input for password.
		// check length to be more than 8 characters
		// should have at least one numbers.
		// should have at least one special character
		// should have at least on upper case letter.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = scanner.next();
		scanner.close();

		if (password.length() >= 8) {
			// next check digits
			String keepDigits = password.replaceAll("[^0-9]", "");
			if (keepDigits.length() >= 1) {
				// next check upperCase letters
				String upperCaseLetters = password.replaceAll("[^A-Z]", "");
				if (upperCaseLetters.length() >= 1) {
					// next check specailCharacter
					String specialCharacters = password.replaceAll("[A-Za-z0-9]", "");
					if (specialCharacters.length() >= 1) {
						System.out.println("Valid Password");
					} else {
						System.out.println("Password should contain at least 1 Special Character");
					}
				} else {
					System.out.println("Password should contain at least 1 upper case letter");
				}
			} else {
				System.out.println("Password should contain at least 1 digit(s)");
			}
		} else {
			System.out.println("Passowrd length should be more than 8 characters");
		}

	}
}
