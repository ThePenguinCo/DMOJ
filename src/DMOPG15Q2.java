import java.util.Scanner;

public class DMOPG15Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		
		m = m + x;
		if (m > 60) {
			h = h + (m / 60);
			m = m % 60;
		}
		else if (m == 60) {
			h++;
			m = 0;
		}
		if (h > 24) {
			h = h % 24;
		}
		else if (h == 24) {
			h = 0;
		}
		System.out.println(h + " " + m);
	}
}
