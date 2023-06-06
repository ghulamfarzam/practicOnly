import java.util.ArrayList;

public class Activity11 {
	public static void main(String[] args) {
		//Create and Array of type String;
				//add some cities of the array
				//print only those cities starting with letter A
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Austin");
		cities.add("New York");
		cities.add("Alexadria");
		cities.add("Adelide");
		
		boolean isEmpaty = cities.isEmpty();
		if(cities.isEmpty()) {
			System.out.println("This array is empty");
		} else {
			System.out.println("This array has data");
		}
		
		for(String city : cities) {
			if(city.startsWith("A"))
			System.out.println(city);
		}
	}

}
