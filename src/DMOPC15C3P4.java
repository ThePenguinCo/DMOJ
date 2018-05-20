import java.util.*;

public class DMOPC15C3P4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long INFINITY = 99999999999999L;
		long[][] adj = new long[N+1][N+1];
		long [] dist = new long[N+2];
		long [][] store = new long[N+2][3];
		for (int i = 0; i <= N; i++) {
			Arrays.fill(adj[i], INFINITY);
			Arrays.fill(dist, INFINITY);
		}
		for (int i = 0; i < N; i++) {
			store[i][0] = scanner.nextInt();
			store[i][1] = scanner.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				adj[i][j] = adj[j][i] = (long) (Math.pow(store[i][0]-store[j][0],2) + Math.pow(store[i][1]-store[j][1],2));
			}
		}
		boolean vis[] = new boolean[N+1];
		int Q = scanner.nextInt();
		for (int z = 0; z < Q; z++) {
			Arrays.fill(dist,  INFINITY); dist[1] = 0;
			for (int i = 0; i < N; i++) {
				long MIN = INFINITY, v = -1;
				for (int j = 1; j <= N; j++) {
					if (!vis[j] && dist[j] < MIN) { MIN=dist[j]; v=j; }
				}
				if (v==-1) {break;}
				vis[(int) v] = true;
				for (int j = 1; j <= N; j++) {
					if (!vis[j] && dist[j] > dist[(int) v] + adj[(int) v][j]) {
						dist[j] = dist[(int) v] + adj[(int)v][j];
					}
				}
			}
		}
	}
}
