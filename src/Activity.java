import java.util.ArrayList;

public class Activity {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Austin");
		cities.add("London");
		cities.add("Alexandria");
		cities.add("Adelide");
		cities.add("Atlanta");
		cities.add("Liyle");
		cities.add("Layden");
		
		System.out.println("the size of array is " + cities.size());
		
		boolean isEmpty = cities.isEmpty();
		if(cities.isEmpty()) {
			System.out.println("this array is empty");
		} else {
			System.err.println("this array has data");
		
		}
		for (String city : cities) {
			if(city.startsWith("A"));
			System.out.println(city);
		}
		}

}
