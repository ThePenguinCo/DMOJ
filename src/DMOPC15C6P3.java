import java.util.Arrays;
import java.util.Scanner;

public class DMOPC15C6P3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int W = 0;
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int a,b, total = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = M;
		}
		int K = scanner.nextInt();
		for (int i = 0; i < M; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			for (int j = a; j < b; j++) {
				arr[j]--;
			}
		}
		Arrays.sort(arr);
		try {
			while (total < K) {
				W++;
				total += arr[W];
			}
			System.out.println(W);
		}
		catch(Exception e) {
			System.out.println(-1);
		}
	}
}
