import java.util.*;

public class NAQ15G {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans = 0;
		int temp1, temp2;
		ArrayList<Integer> person = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			person.add(scanner.nextInt());
		}
		Collections.sort(person);
		temp1 = person.get(0);
		person.remove(0);
		temp2 = person.get(0);
		person.remove(0);
		ans += Math.max(temp1, temp2);
		while (!person.isEmpty()) {
			if (person.size() == 2) {
				int temp3 = person.remove(person.size() - 1);
				int temp4 = person.remove(person.size() - 1);
				System.out.println(temp3);
				System.out.println(temp4);
				ans += temp3 + temp4;
			}
			else if (person.size() == 1) {
				int temp3 = person.remove(person.size() - 1);
				ans += temp3;
			}
			else {
				ans += person.remove(person.size() - 1);
				ans += temp1;
			}
		}
		System.out.println(ans);
	}
}
