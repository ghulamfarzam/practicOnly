import java.util.ArrayList;

public class Activity1 {

	public static void main(String[] args) {
		// create an ArrayList of type double
				// add some value
				// print size
				// print elements one by one
				
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(33.2);
		numbers.add(11.2);
		numbers.add(99.33);
		
		System.out.println(numbers.size());
		for(double number : numbers) {
			System.out.println(number);
			
		for(int i = 0; i < numbers.size(); i++) {
			double num = numbers.get(i);
			System.out.println(num);
			}
		}

	}

}
