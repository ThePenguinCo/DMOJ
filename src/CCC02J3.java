import java.util.Scanner;

public class CCC02J3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tp, tg, tr, to;
		int test = 999999;
		int count = 0;
		int pink = scanner.nextInt();
		int green = scanner.nextInt();
		int red = scanner.nextInt();
		int orange = scanner.nextInt();
		int total = scanner.nextInt();
		for (int i = 0; i <= total / pink; i++) {
			tp = i * pink;
			for (int j = 0; j <= total / green; j++) {
				tg = j * green;
				for (int k = 0; k <= total / red; k++) {
					tr = k * red;
					for (int l = 0; l <= total / orange; l++) {
						to = l * orange;
						if (tp + tg + tr + to == total) {
			                    if (i + j + k + l < test) {
			                        test = i + j + k + l;
			                    }
			                    count++;
			                    System.out.println("# of PINK is " + i + " # of GREEN is " + j +
			                        " # of RED is " + k + " # of ORANGE is " + l);
						}
					}
				}
			}
		}
		System.out.println("Total combinations is " + count + ".");
		System.out.println("Minimum number of tickets to print is " + test + ".");
	}
}