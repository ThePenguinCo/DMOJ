import java.util.*;
import java.io.*;

public class ClaireElstein {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] t = in.readLine().split(" ");
		int N = Integer.parseInt(t[0]);
		int M = Integer.parseInt(t[1]);
		int mod = 1000000007;
		int[] indegree = new int[N+2];
		int[] len = new int[N+2];
		int[] cnt = new int[N+2];
		int ans = 0;
		ArrayList<Integer>[] adj = new ArrayList[N+2];
		for (int i = 0; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= M; i++) {
			String[] z = in.readLine().split(" ");
			adj[Integer.parseInt(z[0])].add(Integer.parseInt(z[1]));
			indegree[Integer.parseInt(z[1])]++;
		}
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) cnt[i] = 1;
		}
		for (int i = 1; i <= N; i++) {
			if (adj[i].isEmpty()) { ans = (ans + len[i]) % mod; }
			for (int j : adj[i]) {
				cnt[j] = (cnt[j] + cnt[i]) % mod;
				len[j] = (len[j] + (cnt[i] + len[i]) % mod) % mod;
			}
		}
		System.out.println(ans % mod);
	}
}