import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GFSSPC1P5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, ans = 999999999;
		int N = scanner.nextInt();
		int T = scanner.nextInt();
		ArrayList<Integer> arrplus = new ArrayList<Integer>();
		ArrayList<Integer> arrminus = new ArrayList<Integer>();
		arrplus.add(0); arrminus.add(0);
		for (int i = 0; i < N; i++) {
			x = scanner.nextInt();
			if (x < 0) { arrminus.add(Math.abs(x));}
			else { arrplus.add(x); }
		}
		Collections.sort(arrplus); Collections.sort(arrminus);
		if (arrplus.size() > T) { ans = arrplus.get(T); }
		for (int i = 0; i < Math.min(arrplus.size(), T); i++) {
			if ((T - i) < arrminus.size()) {
				ans = Math.min(ans, arrplus.get(i) + arrminus.get(T - i) + Math.min(arrplus.get(i), arrminus.get(T - i)));
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
