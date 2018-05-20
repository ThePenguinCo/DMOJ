import java.util.*;

public class CCC09S4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int INFINITY = 999999999;
		int lowest = INFINITY;
		int N = scanner.nextInt(); int T = scanner.nextInt();
		int[][] adj = new int[N+1][N+1];
		int [] cost = new int[N+2];
		for (int i = 0; i <= N; i++) {
			Arrays.fill(adj[i], INFINITY);
			Arrays.fill(cost, INFINITY);
		}
		for (int i = 0; i < T; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int c = scanner.nextInt();
			adj[x][y] = adj[y][x]= Math.min(adj[x][y], c);
		}
		int K = scanner.nextInt();
		for (int i = 0; i < K; i++) {
			int w = scanner.nextInt();
			cost[w] = scanner.nextInt();
		}
		int dist[] = new int[N+1];
		boolean vis[] = new boolean[N+1];
		Arrays.fill(dist,  INFINITY); dist[1] = 0;
		for (int i = 0; i < N; i++) {
			int MIN = INFINITY, v = -1;
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
		int D = scanner.nextInt();
		for (int i =1; i <= N; i++) {
			lowest = Math.min(dist[i] + cost[i], lowest);
		}
		System.out.println(lowest);
	}
}
