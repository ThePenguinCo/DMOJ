import java.util.Scanner;

public class CCC11J3 {
	public static int seq(int a, int b) {
		int c = 0;
		int count = 2;
		while (a >= b && a >= 0 && b >= 0) {
			count++;
			c = a - b;
			a = b;
			b = c;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(seq(x,y));
	}
}
