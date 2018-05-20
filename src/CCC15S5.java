import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC15S5 {
	static int dp[][][][] = new int[3001][101][101][2];
	static int[] listn = new int[3001];
	static int[] listm = new int[3001];
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		for (int i = 1; i <= N; i++) {
			listn[i] = Integer.parseInt(in.readLine());
		}
		int M = Integer.parseInt(in.readLine());
		for (int i = 1; i <= M; i++) {
			listm[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(listm);
		System.out.println(solve(1,1,M,1,N));
	}

	public static int solve(int pos, int l, int r, int take, int N) {
		if (dp[pos][l][r][take] != 0) {
			return dp[pos][l][r][take];
		}
		if (pos == N+1) {
			if (l <= r) {
				if (take == 1) return dp[pos][l][r][take] = listm[r] + solve(pos, l, r-1, 0, N);
				return dp[pos][l][r][take] = solve(pos, l+1, r, 1, N);
			}
			return dp[pos][l][r][take]=0;
		}
		if (take == 1) {
			dp[pos][l][r][take] = Math.max(solve(pos, l, r, 0, N), listn[pos] + solve(pos+1,l,r,0,N));
			if (l <= r) {
				dp[pos][l][r][take]=Math.max(dp[pos][l][r][take], listm[r] + solve(pos,l,r-1,0,N));
			}
		}
		else {
			dp[pos][l][r][take] = solve(pos+1,l,r,1,N);
			if (l <= r) {
				dp[pos][l][r][take] = Math.max(dp[pos][l][r][take], solve(pos,l+1,r,1,N));
			}
		}
		return dp[pos][l][r][take];
	}
}
