import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class DMOPC2015P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int x = scanner.nextInt();
		scanner.nextLine();
		char y;
		for (int i = 0; i < x; i++) list.add(scanner.nextLine());
		Collections.sort(list);
		System.out.print(list.get(0));
		for (int i = 1; i < x; i++) {
			y = list.get(i - 1).charAt(0);
			if (list.get(i).charAt(0) == y) System.out.print(", ");
			else System.out.println();
			System.out.print(list.get(i));
		}
	}
}
