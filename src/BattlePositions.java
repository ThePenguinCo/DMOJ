import java.util.Scanner;

public class BattlePositions {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, min, waves;
		int total = 0;
		int first, last, troop;
		n = scanner.nextInt();
		int[] stations = new int[n + 2];
		for (int i = 0; i < n; i++) {
			stations[i] = 0;
		}
		min = scanner.nextInt();
		waves = scanner.nextInt();
		for (int i = 0; i < waves; i++) {
			first = scanner.nextInt();
			last = scanner.nextInt();
			troop = scanner.nextInt();
			stations[first] += troop;
			stations[last + 1] -= troop;
		}
		for (int i = 1; i < n; i++) {
			stations[i] += stations[i-1];;
		}
		for (int i = 0; i < n; i++) {
			if (stations[i] < min) {
				total++;
			}
		}
		System.out.println(total);
	}
}
