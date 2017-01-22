import java.util.*;

public class SleighRide {
	public static int total = 0, maxD;
	public static ArrayList<Point>[] adj = new ArrayList[100001];
	public static boolean[] vis = new boolean[100001];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 0; i <= N; i++)
			adj[i] = new ArrayList<Point>();
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int c = scanner.nextInt();
			adj[x].add(new Point(y, c));
			adj[y].add(new Point(x, c));
			total += c;
		}
		dfs(0,0);
		System.out.println((2 * total) - maxD);
	}
	public static void dfs(int u, int dis) {
		vis[u]=true; maxD = Math.max(maxD, dis);
		for (Point p : adj[u]) {
			if(!vis[p.x]) dfs(p.x, dis+p.dist);
		}
	}
	static class Point {
		int x, dist;
		Point(int x, int dist) { this.x = x; this.dist = dist; }
	}
}