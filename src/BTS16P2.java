import java.util.Scanner;

public class BTS16P2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean truest = false;
		boolean falsest = false;
		int a; boolean b;
		int C = scanner.nextInt();
		for (int i = 0; i < C; i++) {
			a = scanner.nextInt();
			if (a == 1) {
				b = scanner.nextBoolean();
				if (b && !truest) {
					truest = true;
					System.out.println(true);
				}
				else if (!b && !falsest) {
					falsest = true;
					System.out.println(true);
				}
				else System.out.println(false);
			}
			if (a == 2) {
				b = scanner.nextBoolean();
				if (b && truest) {
					truest = false;
					System.out.println(true);
				}
				else if (!b && falsest) {
					falsest = false;
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			if (a == 3) {
				b = scanner.nextBoolean();
				if (b) {
					if (truest) System.out.println(truest);
					else System.out.println(-1);
				}
				else {
					if (falsest) System.out.println(falsest);
					else System.out.println(-1);
				}
			}
			if (a == 4) {
				if (falsest) System.out.print(false + " ");
				if (truest) System.out.print(true);
			}
		}
	}
}