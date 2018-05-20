import java.util.*;

public class DMOPC16C4P5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		long[][] adj = new long[N+1][N+1];
		for (int i = 0; i <= N; i++) {
			Arrays.fill(adj[i], Long.MAX_VALUE);
		}
		for (int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int c = scanner.nextInt();
			adj[x][y] = adj[y][x] = Math.min(adj[x][y], c);
		}
		long dist[] = new long[N+1];
		boolean vis[] = new boolean[N+1];
		Arrays.fill(dist,  Long.MAX_VALUE); dist[1] = 0;	
		for (int i = 0; i < N; i++) {
			long MIN = Long.MAX_VALUE;
			int v = -1;
			for (int j = 1; j <= N; j++) {
				if (!vis[j] && dist[j] < MIN) { MIN=dist[j]; v=j; }
			}
			if (v==-1) {break;}
			vis[v] = true;
			for (int j = 1; j <= N; j++) {
				if (!vis[j] && dist[j] > dist[v] + adj[v][j]) {
					dist[j] = dist[v] + adj[v][j];
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(dist[i]);
		}
	}
}
