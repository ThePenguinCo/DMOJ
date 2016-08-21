import java.util.Scanner;

public class CCC11J5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[7];
		int s;
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			arr[i] = 1;
		}
		for (int i = 1; i < N; i++) {
			s = scanner.nextInt();
			arr[i] += 1;
			arr[s] *= arr[i];
		}
		System.out.println(arr[N]);
	}
}
