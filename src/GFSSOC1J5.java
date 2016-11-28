import java.util.*;
import java.io.*;

public class GFSSOC1J5 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] t = in.readLine().split(" ");
		int N = Integer.parseInt(t[0]);
		int M = Integer.parseInt(t[1]);
		int T = Integer.parseInt(t[2]);
		// adjacency list
		ArrayList<Integer>[] adj = new ArrayList[1002];
		// visited boolean array
		boolean[] vis = new boolean[1002];
		// bfs queue (deque is faster than arraylist)
		Queue<Integer> queue = new ArrayDeque<Integer>();
		// distance array
		int[] dis = new int[2002];
		// iterate create adjacency list objects
		for (int i = 0; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		// iterate and add nodes from directed graph
		for (int i = 0; i < M; i++) {
			String[] z = in.readLine().split(" ");
			adj[Integer.parseInt(z[0])].add(Integer.parseInt(z[1]));
		}
		String[] z = in.readLine().split(" ");
		int Q = Integer.parseInt(z[0]);
		for (int i = 0; i < Q; i++) {
			String[] w = in.readLine().split(" ");
			int a = Integer.parseInt(w[0]);
			int b = Integer.parseInt(w[1]);
			queue.add(a); vis[a] = true; dis[a] = 0;
			// BFS
			while (!queue.isEmpty()) {
				Integer current = queue.poll();
				ArrayList<Integer> n = adj[current];
				// faster than foreach
				for (int l=0; l < n.size(); l++) {
					Integer u = n.get(l);
					if (!vis[u]) {
						vis[u] = true;
						dis[u] = dis[current]+1;
						queue.add(u);
					}
				}
			}
			// output
			if(vis[b]) System.out.println(dis[b] * T);
			else System.out.println("Not enough hallways!");
			vis = new boolean[1002];
			dis = new int[1002];
		}
	}
}