import java.util.Scanner;

public class DMOPCP15C6P3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long[]farm = new long[200002];
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		long K = scanner.nextLong();
		int a,b;
		long ans = 999999999;
		for (int i = 0; i < M; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			farm[a] --;
			farm[b + 1] ++;
		}
		farm[0] = M;
		for (int i = 1; i <= N; i++) {
			farm[i] = farm[i] + farm[i-1];
		}
		for (int i = 1; i <= N; i++) {
			farm[i] = farm[i] + farm[i-1];
		}
		for (int l = 0, r = 1; r <= N + 1; r++) {
			while (l <= r && farm[r] - farm[l] >= K) {
				ans = Math.min(ans, r-l);
				l++;
			}
		}
		if (ans > N) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);;
		}
	}
}
