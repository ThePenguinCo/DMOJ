import java.util.*;

public class DMOPC13C3P3 {
	public static int[] dr = {-1,0,1,0};
	public static int[] dc = {0,-1,0,1};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int[][] adj = new int[1502][1502];
		boolean[][] vis = new boolean[1502][1502];
		Queue<Point> queue = new LinkedList<Point>();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int x = scanner.nextInt();
				adj[i][j] = x;
			}
		}
		queue.add(new Point(1,1)); vis[1][1] = true;
		while (!queue.isEmpty()) {
			Point current = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nr = current.r+dr[i], nc = current.c+dc[i];
				if (nr >= 1 && nr<=N && nc >= 1 && nc <= N && !vis[nr][nc] && Math.abs(adj[nr][nc] - adj[current.r][current.c]) <= H) {
						queue.add(new Point(nr,nc)); vis[nr][nc] = true;
				}
			}
		}
		if(vis[N][N]) System.out.println("yes");
		else System.out.println("no");
	}
	static class Point {
		int r, c;
		Point(int r, int c) { this.r = r; this.c = c; }
	}
}