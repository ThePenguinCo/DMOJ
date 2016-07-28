import java.util.Scanner;

public class VMSS72016Bronze {
	public static void primeFactor(int n) {
		while (n % 2 == 0) {
			n = n / 2;
			System.out.println(2);
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.println(i);
		        n = n / i;
			}
		}
		if (n > 2)
			System.out.println(n);
	}
	public static void main(String args[]) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		primeFactor(n);
	}
}
