import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PrimeFactorization {
	public static void primeFactor(int n) {
		while (n % 2 == 0) {
			n = n / 2;
			System.out.print(2 + " ");
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
		        n = n / i;
			}
		}
		if (n > 2)
			System.out.print(n + " ");
		System.out.println();
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int j;
		for (int i = 0; i < n; i++) {
			j = Integer.parseInt(in.readLine());
			primeFactor(j);
		}
	}
}
