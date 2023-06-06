import java.util.ArrayList;

public class Activity22 {

	public static void main(String[] args) {
		//Create and Array of type String;
		//add some cities of the array
		//print only those cities starting with letter A
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Austin");
		cities.add("Adelide");
		cities.add("New York");
		cities.add("Alexandria");
		
		
		boolean isCityEmpty = cities.isEmpty();
		if(cities.isEmpty()) {
			System.out.println("This Array is empty");
		} else {
			System.out.println("this Array has data");
			
			
		for(String city : cities) {
			if(city.startsWith("A"));
			System.out.println(city);
			
		
		}
		}
		

	}

}
