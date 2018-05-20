import java.util.*;

public class TheOddNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			ans ^= x;
		}
		System.out.println(ans);
	}
}
