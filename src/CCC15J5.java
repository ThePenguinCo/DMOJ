import java.util.Scanner;

public class CCC15J5 {
	public static int[][] dp = new int[251][251];
	public static int fun(int n, int k) {
		if (n < 0 || (k == 0 && n != 0)) return 0;
		if (n == 0 && k != 0) return 1;
		if (dp[n][k] != 0) return dp[n][k];
		return dp[n][k] = fun(n, k-1) + fun(n - k, k);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.println(fun(n-k,k));
	}
}
