import java.util.Scanner;

public class VALDAY15P2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		int M = scanner.nextInt();
		int[][] dp = new int[C+1][M+1];
		for (int i = 1; i <= C; i++) {
			int princess = scanner.nextInt();
			int minutes = scanner.nextInt();
			for (int j = 1; j <= M; j++) {
				if (minutes > j) dp[i][j] = dp[i-1][j];
				else dp[i][j]=Math.max(princess + dp[i-1][j-minutes], dp[i-1][j]);
			}
		}
		System.out.println(dp[C][M]);
	}
}
