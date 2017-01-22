import java.util.*;

public class NoisyClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int counter = 0;
		ArrayList<Integer>[] adj = new ArrayList[N+1];
		Queue<Integer> queue = new ArrayDeque();
		int[] indegree = new int[N+1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			adj[x].add(y); indegree[y]++;
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
		if (counter == N) System.out.println("Y");
		else System.out.println("N");
	}
}