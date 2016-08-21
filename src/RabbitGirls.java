import java.util.Scanner;

public class RabbitGirls {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		if (r >= g) {
			System.out.println(Math.min(r % g, g - (r % g)));
		}
		else {
    		System.out.println(g - r);
		}
	}
}
