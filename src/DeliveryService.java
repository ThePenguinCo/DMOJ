import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DeliveryService  {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(in.readLine());
		String[] za = in.readLine().split(" ");
		int D = Integer.parseInt(za[0]); int N = Integer.parseInt(za[1]); int P = Integer.parseInt(za[2]);
		int[] fuel = new int[D + 2]; int[] dp = new int[D + 2]; int[] dif = new int[D + 2];
		fuel[0] = N;
		dp[0] = 0;
		for (int i = 0; i < P; i++) {
			String[] zb = in.readLine().split(" ");
			int qi = Integer.parseInt(zb[0]);
			int ri = Integer.parseInt(zb[1]);
			fuel[qi] = ri;
		}
		for (int i = 0; i <= D; i++) {
			dp[i+1] += dp[i];
			dp[i + fuel[i] + 1] -= dp[i];
		}
		// fuel, diff, dp
		for (int i = 0; i <= D; i++) {
			System.out.println(dp[i]);
		}
		//System.out.println(dp[D]);
	}
}
