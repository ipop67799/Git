import java.util.*;
public class abc {
	public static void main (String args[]) throws IOException {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b (in two separate lines): ");
		a = sc.readLine();
		b = sc.readLine();
		System.out.println("Adding a and b: " + (a + b));
	}
}
// This is the new line added
// No further changes