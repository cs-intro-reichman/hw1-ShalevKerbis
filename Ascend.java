// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);

		System.out.println(a + " " + b + " " + c + " ");

		int smallest = Math.min(c, Math.min(a, b));
		int largest = Math.max(c, Math.max(a, b));
		int middle = a + b + c - smallest - largest;

		System.out.println(smallest + " " + middle + " " + largest);
	}
}
