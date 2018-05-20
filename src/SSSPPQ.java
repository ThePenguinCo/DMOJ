import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// java min is first
// c++ max is first
public class SSSPPQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int M = scanner.nextInt();
		// declare distance array, priority queue and the ArrayList (Graph)
		ArrayList<Edge> [] adj = new ArrayList[N+1];
		int[] dis = new int[N+1];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		
		// initialize the empty graph
		for (int i = 0; i <= N; i++) {
			adj[i] = new ArrayList<Edge>();
		}
		
		// fill the distance array with MAX VALUES
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		// initialize the graph
		for (int i = 0; i < M; i++) {
			// x and y are vertices, z is the weight
			int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
			adj[x].add(new Edge(y,z)); 
			adj[y].add(new Edge(x,z));
		}
		// start the priority queue at 1
		pq.add(new Edge(1,0));
		// loops while the priority queue is not empty
		while(!pq.isEmpty()) {
			Edge cur = pq.poll();
			if (dis[cur.v] < cur.w) continue;
			dis[cur.v] = cur.w;
			for (Edge next : adj[cur.v]) {
				if (dis[next.v] > dis[cur.v] + next.w) {
					pq.add(new Edge(next.v, dis[cur.v] + next.w));
				}
			}
		}
		for (int i = 1; i<= N; i++) {
			if (dis[i] == Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(dis[i]);
		}
	}
	public static class Edge implements Comparable<Edge> {
		// destination vertices and weight
		int v, w;
		Edge(int v, int w) { this.v = v; this.w = w; }
		// hello comparator!
		public int compareTo(Edge x) {
			if (this.w < x.w) return -1;
			else return 1;
		}
	}
}
