package MockCCC2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NCCC1J5S3 {
	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	static long N;

	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		//br = new BufferedReader(new FileReader("in.txt"));
		//out = new PrintWriter(new FileWriter("out.txt"));
		N = readLong();
		//func(N);
		out.println(func(N));
		out.close();
	}

	public static int func(long N) {
		long threshold = N * (N - 1) / 2;
		int K = 1;
		long count = 0;
		int print = K;
		long L;
		while (K < N) {
			L = K + 1;
			print = K;
			while (L <= N) {
				count += 1;
				L += 1;
				if (2 * count >= threshold) 
				{
					return print;
				}
			}
			K += 1;
		}
		return print;
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}