import java.util.Scanner;

public class CCC05J2 {
	public static int divisors(int s) {
		int a = 0;
		for (int i = 1; i <= s; i++) {
			if (s % i == 0)
				a++;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = 0;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			if (divisors(i) == 4)
				w++;
		}
		System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + w);
	}
}
