import java.util.*;
import java.io.*;

public class LineGraph {
	static int [] p;
	static int [] rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		p = new int [N+1]; rank = new int[N+1];
		for (int i = 1; i <= N; i++) p[i] = i;
		for (int i = 1; i+K<=N; i++) {
			int fx = Find(i), fy = Find(i+K);
			if (fx != fy) Union(fx, fy);
		}
		ArrayList<Edge> list = new ArrayList<Edge>();
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N; i++) 
			list.add(new Edge(i, i+1, Integer.parseInt(st.nextToken())));
		Collections.sort(list);
		int ans = 0;
		for (int count = N - K, i = 0; count < N - 1; i++) {
			int fx = Find(list.get(i).u), fy = Find(list.get(i).v);
			if (fx != fy) {
				Union(fx,fy); count++; ans += list.get(i).w;
			}
		}
		System.out.println(ans);
	}
	
	public static class Edge implements Comparable<Edge> {
		int u, v, w;
		Edge (int u, int v, int w) {
			this.u = u; this.v = v; this.w = w;
		}
		@Override
		public int compareTo(Edge x) {
			return this.w - x.w;
		}
	}
	public static int Find(int x) {
	    if (x != p[x]) p[x] = Find(p[x]);
	    return p[x];
	}

	public static void Union (int x, int y) {
	    if(rank[x] > rank[y]) {
	    	p[y] = x;
	    }
	    else {
	        p[x] = y;
	        if (rank[x] == rank[y]) rank[y]++;
	    }
	}
}