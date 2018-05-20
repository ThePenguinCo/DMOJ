import java.util.*;

public class CheckerBoardSumEasy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		long[][] board = new long[M+2][N+2];
		long ans = 0;
		while (true) {
			int R = scanner.nextInt();
			int C = scanner.nextInt();
			int X = scanner.nextInt();
			if (R == 0 && C == 0 && X == 0) break;
			if ((R + C) % 2 != 0) board[R][C] = X;
			else board[R][C] = -X;
		}
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				board[i][j] += board[i-1][j] + board[i][j-1] - board[i-1][j-1];
			}
		}
		while (true) {
			int R1 = scanner.nextInt();
			int C1 = scanner.nextInt();
			int R2 = scanner.nextInt();
			int C2 = scanner.nextInt();
			if (R1 == 0 && C1 == 0 && R2 == 0 && C2 == 0) break;
			ans = board[R2][C2] + board[R1-1][C1-1] - board[R1-1][C2] - board[R2][C1-1];
			if ((R1 + C1) % 2 != 0) {
				System.out.println(ans);
			}
			else {
				System.out.println(-ans);
			}
		}
	}
}
