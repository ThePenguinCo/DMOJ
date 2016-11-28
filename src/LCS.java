import java.util.Scanner;

public class LCS {
	static int[][] dp = new int[1001][1001];
	static short[] a = new short[1001]; static short[] b = new short[1001];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int M = scanner.nextInt();
		for (short i = 0; i < N; i++) a[i] = scanner.nextShort();
		for (short i = 0; i < M; i++) b[i] = scanner.nextShort();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (a[i-1] != b[j-1]) dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				else if (a[i-1] == b[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
			}
		}
		System.out.println(dp[N][M]);
	}
}