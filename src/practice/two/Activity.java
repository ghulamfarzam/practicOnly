package practice.two;

public class Activity {

		public static String getEmail() {
			String email = "farzam";
			String providor = "@gmail.com";
			int randomNumber = (int) (Math.random() * 100);
			String autoEmail = email + randomNumber + providor;
			return autoEmail;
		}
		
		

		public static void main(String[] args) {
		System.out.println("Hello world this is the github repository");
		System.out.println("this is the second github");
		System.out.println(getEmail());
	}
	
		
	

}
