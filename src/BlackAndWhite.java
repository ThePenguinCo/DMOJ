import java.util.*;

public class BlackAndWhite {
	public static void main(String[] args) {
		char[][] a = new char [10002][10002];
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		for (int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			x++; y++;
			a[x][y]++; a[x][y+h]--; a[x+w][y]--; a[x+w][y+h]++;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				a[i][j] += a[i-1][j] + a[i][j-1] - a[i-1][j-1];
				if ((a[i][j] & 1) != 0) cnt++;
			}
		}
		System.out.println(cnt);
	}
}
