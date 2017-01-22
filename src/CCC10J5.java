import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC10J5 {
	public static int[] dx = {-1,-1,-2,-2,1,1,2,2};
	public static int[] dy = {2,-2,1,-1,2,-2,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] _ = in.readLine().split(" ");
		int x1 = Integer.parseInt(_[0]);
		int y1 = Integer.parseInt(_[1]);
		String[] __ = in.readLine().split(" ");
		int x2 = Integer.parseInt(__[0]);
		int y2 = Integer.parseInt(__[1]);
		boolean[][] vis = new boolean[9][9];
		int dis[][] = new int[9][9];
		Queue<Point> queue = new ArrayDeque<Point>();
		queue.add(new Point(x1,y1)); vis[x1][y1] = true; dis[x1][y1] = 0;
		// BFS
		while (!queue.isEmpty()) {
			Point current = queue.poll();
			for (int i = 0; i < 8; i++) {
				int nx = current.x+dx[i], ny = current.y+dy[i];
				if (nx >= 1 && nx <=8 && ny >= 1 && ny <= 8 && !vis[nx][ny]) {
					queue.add(new Point(nx,ny)); vis[nx][ny] = true; dis[nx][ny] = dis[current.x][current.y] + 1;
				}
			}
		}
		System.out.println(dis[x2][y2]);
	}
	static class Point {
		int x, y;
		Point(int x, int y) { this.x = x; this.y = y; }
	}
}
