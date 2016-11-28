import java.util.*;

public class VMSS7WC16C3P2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		// adjacency list
		ArrayList<Integer>[] adj = new ArrayList[2001];
		// visited boolean array
		boolean[] vis = new boolean[2001];
		// bfs queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// iterate create adjacency list objects
		for (int i = 0; i <= N; i++)
			adj[i] = new ArrayList<Integer>();
		// iterate and add nodes from undirected graph
		for (int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			adj[x].add(y); adj[y].add(x);
		}
		// add the first node (starting)
		queue.add(A); vis[A] = true;
		// BFS
		while (!queue.isEmpty()) {
			int current = queue.poll();
			for (int u : adj[current]) {
				if (!vis[u]) {
					vis[u] = true;
					queue.add(u);
				}
			}
		}
		// output
		if(vis[B]) System.out.println("GO SHAHIR!");
		else System.out.println("NO SHAHIR!");

	}
}
