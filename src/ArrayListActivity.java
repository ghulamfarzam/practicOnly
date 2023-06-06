import java.util.ArrayList;

public class ArrayListActivity {

	public static void main(String[] args) {
		// create an ArrayList of type double
		// add some value
		// print size
		// print elements one by one
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		numbers.add(33.2);
		numbers.add(88.2);
		numbers.add(99.2);
		
		System.out.println(numbers.size());
		for(double number : numbers) {
			System.out.println(number);

		}
		

	}

}
