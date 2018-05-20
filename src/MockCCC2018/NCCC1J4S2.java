package MockCCC2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NCCC1J4S2 {
	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	static int N;

	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		//br = new BufferedReader(new FileReader("in.txt"));
		//out = new PrintWriter(new FileWriter("out.txt"));
		
		N = readInt();
		
		char[][] arr = new char[N+1][N+1];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (arr[i][j] == arr[i][k] || arr[j][i] == arr[k][i]) {
						out.println("No");
						return;
					}
				}
				
			}
		}
		
		for (int i = 0; i < N - 1; i++) {
			if (arr[0][i] > arr[0][i+1] || arr[i][0] > arr[i + 1][0])
			{
				out.println("Latin");
				return;
			}
		}
		out.println("Reduced");
		out.close();
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