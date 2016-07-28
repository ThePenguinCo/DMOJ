import java.util.Scanner;

public class CCC13J4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int N = scanner.nextInt();
		int[] arr = new int[N];
		boolean sorted = false;
		int temp;
		int count = 0;
		int total = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < N - 1; i++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (total + arr[i] <= T) {
				total = total + arr[i];
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}