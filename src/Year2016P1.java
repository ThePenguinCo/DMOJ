import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Year2016P1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (int i = 0; i < x; i++) {
			int w = scanner.nextInt();
			for (int j = 0; j < w; j++) {
				list.add(scanner.nextInt());
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}
}
