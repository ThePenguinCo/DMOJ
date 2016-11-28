import java.util.*;

public class DMOPC14CE1P5ALT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] dp = new int[1002][1002];
		int[] sum = new int[1002];
		for (int i = 1; i <= N; i++) {
			sum[i] = scanner.nextInt();
			dp[i][i] = sum[i];
			sum[i] += sum[i-1];
		}
		for (int len = 1; len < N; len++) {
			for (int l = 1; l <= N-len; l++) {
				int r = l + len;
				dp[l][r] = sum[r]-sum[l-1] - Math.min(dp[l+1][r], dp[l][r-1]);
			}
		}
		System.out.println(dp[1][N]);
	}
}
