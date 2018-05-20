import java.util.Scanner;

public class VMSS7WC16C2P3 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N+1];
		for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
		int M = scanner.nextInt();
		int[] b = new int[M+1];
		int[][] dp = new int[N+1][M+1];
		for (int i = 0; i < M; i++) b[i] = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (a[i-1] != b[j-1]) dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				else if (a[i-1] == b[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
			}
		}
		System.out.println(dp[N][M]);
	}
}