import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC03S3 {
	public static int LCP(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (!s.substring(i, i + 1).equals(t.substring(i, i + 1))) {
				// System.out.println(i); == >:(
				return i;
			}
		}
		return n;
	}
	public static int solve(String s) {
		ArrayList<String> suffix = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			suffix.add(s.substring(i));
		}
		Collections.sort(suffix);
		int count = suffix.get(0).length() + 1;
		for (int i = 1; i < s.length(); i++) {
	        int lcp = LCP(suffix.get(i), suffix.get(i - 1));
	        count += suffix.get(i).length() - lcp;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < c; i++) {
			System.out.println(solve(scanner.nextLine()));
		}
	}
}
