
public class OutputUtility {

	public void print(String message) {
		System.err.println(message);
	}

	public void print(int number) {
		System.out.println(number);
	}

	public void print(boolean value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		OutputUtility object = new OutputUtility();
		object.print("Sending String to print");
		object.print(100);
		object.print(true);
	}
}
