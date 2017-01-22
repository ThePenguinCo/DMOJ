import java.util.*;

public class DirectedAcyclicGraph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int counter = 0;
		ArrayList<Integer>[] adj = new ArrayList[N+1];
		Queue<Integer> queue = new ArrayDeque<Integer>();
		int[] indegree = new int[N+1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (scanner.nextInt() == 1) {
					adj[i].add(j); indegree[j]++;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) { queue.add(i); indegree[i]--; }
		}
		while (!queue.isEmpty()) {
			int current = queue.poll();
			counter++;
			for (Integer v : adj[current]) {
				indegree[v]--;
				if (indegree[v] == 0) queue.add(v);
			}
		}
		if (counter == N) System.out.println("YES");
		else System.out.println("NO");
	}
}