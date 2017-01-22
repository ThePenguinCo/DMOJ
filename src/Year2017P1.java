import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Year2017P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		int Q = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < Q; i++) {
			String a = scanner.nextLine();
			if (a.charAt(0) == 'F')
				list.addFirst(Integer.valueOf(a.charAt(2))-48);
			else if (a.charAt(0) == 'E')
				list.addLast(Integer.valueOf(a.charAt(2))-48);
			else {
				for(Iterator itr = list.iterator(); itr.hasNext();)  {
					if (itr.next().equals(Integer.valueOf(a.charAt(2))-48)) {
						itr.remove();
						break;
					}
				}
			}
		}
		for (Iterator itr = list.iterator(); itr.hasNext();)  {
			System.out.println(itr.next());
		}
	}
}
