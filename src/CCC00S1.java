import java.util.Scanner;

public class CCC00S1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int w=0;
		while (true) {
			a++; x--; w++;
			if (a == 35) {
				a = 0;
				x += 30;
			}
			if (x == 0) break;
			b++; x--; w++;
			if (b == 100) {
				b = 0;
				x += 60;
			}
			if (x == 0) break;
			c++; x--; w++;
			if (c == 10) {
				c = 0;
				x += 9;
			}
			if (x == 0) break;
			
		}
		System.out.println("Martha plays " + w + " times before going broke.");
	}
}