import java.util.Scanner;

public class CCC07J3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b[] = {0, 100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		int a = scanner.nextInt();
		int total = 0;
		for (int i = 0; i <= 10; i++) {
			total += b[i];
		}
		for (int i = 0; i < a; i++) {
			total -= b[scanner.nextInt()];
		}
		int bank = scanner.nextInt();
		if (total / (10 - a) <= bank) {
			System.out.println("deal");
		}
		else {
			System.out.println("no deal");
		}
	}
}
