import java.util.*;

public class CCC11S3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int m = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			while (true) {
				int tempx = (x / (int) Math.pow(5, m-1));
				int tempy = (y / (int) Math.pow(5, m-1));
				if ((tempx >= 1 && tempx <= 3 && tempy == 0) || (tempx == 2 && tempy == 1)) {
					System.out.println("crystal");
					break;
				}
				else if (((tempx == 1 || tempx == 3) && tempy == 1) || (tempx == 2 && tempy == 2) && m != 1) {
					x = (x % (int) Math.pow(5, m-1));
					y = (y % (int) Math.pow(5, m-1));
					m--;
				}
				else {
					System.out.println("empty");
					break;
				}
			}
		}
	}
}