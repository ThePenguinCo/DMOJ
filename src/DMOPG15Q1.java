import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class DMOPG15Q1 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < x; i++) {
			 list.add(scanner.nextLine());
		}
		Collections.sort(list);
		for (int i = 0; i < x; i++) {
				if (i != x - 1 && list.get(i).charAt(0) == list.get(i+1).charAt(0)) {
					System.out.print(list.get(i) + ", ");
				}
				else if (i != 0 && list.get(i - 1).charAt(0) == list.get(i).charAt(0)) {
					System.out.print(list.get(i));
					System.out.println();
				}
				else {
					System.out.println(list.get(i)); 
				}
	    }
	}
}
