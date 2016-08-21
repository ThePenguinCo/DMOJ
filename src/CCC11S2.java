import java.util.Scanner;

public class CCC11S2 {
	public static void main(String[] args) {
		String[] stu = new String[10001];
		Scanner scanner = new Scanner(System.in);
		String ans;
		int count = 0;
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			stu[i] = scanner.next();
		}
		for (int i = 0; i < a; i++) {
			ans = scanner.next();
			if (ans.equals(stu[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
