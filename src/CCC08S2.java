import java.util.Scanner;

public class CCC08S2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pennies = 0;
		int r2;
		int radius = scanner.nextInt();
		while (radius != 0) {
			r2 = radius * radius;
			for (int x = 1 ; x <= radius ; x++)
				pennies += (int) Math.sqrt (r2 - x * x) + 1;
			pennies = (pennies * 4) + 1;
			System.out.println(pennies);
			pennies = 0;
			radius = scanner.nextInt();
		}
	}
}
