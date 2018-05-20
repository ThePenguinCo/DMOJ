import java.util.*;
public class TLE16C6S3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][][] dp = new int[2][2002][2002];
		int[] pie = new int[2002];
		ArrayList<Edge a = new ArrayList[]();
		for (int i = 0; i < N; i++) {
			a[i].x = scanner.nextInt();
			a[i].d = scanner.nextInt();
		}
	}
	public static void fox(int L, int R, int cur) {
		
	}
	public static class Edge implements Comparable<Edge> {
		int x, d;
		Edge (int x, int d) {
			this.x = x; this.d = d;
		}
		@Override
		public int compareTo(Edge e) {
			return this.x - e.x; // check other way if not working (return this.x < y.x;)
		}
	}
}
