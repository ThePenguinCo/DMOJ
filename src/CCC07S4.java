import java.util.ArrayList;
import java.util.Scanner;

public class CCC07S4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// create adjacency list
		ArrayList<Integer>[] adj = new ArrayList [N+1];
		// create lists for each vertice
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		int x = 1, y = 1;
		for (x = scanner.nextInt(), y = scanner.nextInt(); x != 0 && y != 0;x = scanner.nextInt(), y = scanner.nextInt()) {
			adj[x].add(y);
			// adj[y].add(x); undirected
		}
		int [] dp = new int [N+1];
		dp[1] = 1;
		for (int i = 1; i <= N; i++) {
			// for (int j = 0; j < adj[i].size(); j++) {
			for (int j: adj[i]) {
				dp[j] += dp[i];
			}
		}
		System.out.println(dp[N]);
	}
}
