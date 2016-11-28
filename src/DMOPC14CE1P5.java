import java.util.Scanner;

public class DMOPC14CE1P5 {
	static int[][] dp = new int[1002][1002];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] coins = new int[1002];
		int[] sum = new int[1002];
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) { 
			coins[i] = scanner.nextInt();
			sum[i] = sum[i-1] + coins[i];
		}
		System.out.println(func(sum, 1, N));
	}
	public static int func(int[] sum, int left, int right) {
		if (left > right) return 0;
		if (dp[left][right]!= 0) return dp[left][right];
		int s = sum[right]-sum[left-1];
		return dp[left][right] = Math.max(s-func(sum,left,right-1), s-func(sum, left+1,right));
	}
}
