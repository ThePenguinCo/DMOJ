import java.util.*;

public class VMSS15C1P3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long xh = scanner.nextLong();
		long yh = scanner.nextLong();
		long xs = scanner.nextLong();
		long ys = scanner.nextLong();
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			long a = scanner.nextLong(); long b = scanner.nextLong(); long c = scanner.nextLong();
			if (a *xh+b*yh+c > 0 && a*xs+b*ys+c <0 || a*xh+b*yh+c < 0 && a*xs+b*ys+c > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
