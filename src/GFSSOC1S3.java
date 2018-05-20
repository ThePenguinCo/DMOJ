import java.util.*;

public class GFSSOC1S3 {
	public static int N,M,T, count, ri, ci;
	public static int[][][] d;
	public static char[][] map;
	public static int[] ord;
	public static int dis = 0;
	public static int ans = 7777;
	public static int[][] dir;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		T = scanner.nextInt();
		d = new int[T+1][N][M];
		map = new char[N][M];
		ord = new int[T+1];
		dir = new int[4][4];
		int[] hider_r = new int[T]; int[] hider_c = new int[T];
		for (int i = 0; i < N; i++) {
			String x = scanner.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = x.charAt(j);
				if (x.charAt(j) == 'G') {
					ri = i; ci=j;
				}
				else if (x.charAt(j) == 'H') {
					hider_r[count] = i; hider_c[count] = j; count++;
				}
			}
		}
		BFS(ri, ci, 0);
		for (int i = 0; i < T; i++) {
			ord[i] = i;
			BFS(hider_r[i], hider_c[i], i + 1);
		}
		do {
			int next = ord[0];
			dis += d[0][hider_r[next]][hider_c[next]];
			for (int i = 1; i < T; i++) {
				next = ord[i];
				dis += d[i][hider_r[next]][hider_c[next]];
			}
			ans = Math.min(ans, dis);
		} while(next_permutation(ord));
		System.out.println(ans);
	}
	public static void BFS(int r, int c, int i) {
		boolean [][] vis = new boolean[N][M];
		Queue<Integer> Qr = new ArrayDeque<Integer>();
		Queue<Integer> Qc = new ArrayDeque<Integer>();
		Qr.add(r); Qc.add(c); vis[r][c] = true; d[i][r][c] = 0;
		while(!Qr.isEmpty()) {
			int curr = Qr.poll(), curc = Qc.poll();
			for (int j = 0; j < 4; j++) {
				int nr = curr+dir[j][0], nc=curc+dir[j][1];
				if (nr >= 0 && nr < N && nc >= 0 && nc < M && !vis[nr][nc] && map[nr][nc] != 'X') {
					Qr.add(nr); Qc.add(nc); vis[nr][nc] = true;
					d[i][nr][nc] = d[i][curr][curc] + 1;
				}
			}
		}
	}
	public static boolean next_permutation(int[] a) {
		int p = 0, q = 0;
		for (p = a.length - 2; p >= 0; p--) {
			if(a[p] < a[p+1]) break;
		}
		if (p < 0) return false;
		for (q = a.length - 1; q > p; q--) {
			if (a[q] > a[p]) break;
		}
		int t1 = a[p]; a[p] = a[q]; a[q] = t1;
		for (int l = p + 1, r = a.length-1; l <= r; l++, r--) {
			int t2 = a[l]; a[l] = a[r]; a[r] = t2;
		}
		return true;
	}
}