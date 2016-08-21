import java.util.Scanner;

public class TSOC15C2P3 {
	public static int factorial(int f) {
		if (f == 1)
			return 1;
		else
			return f * factorial(f - 1);
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String s = scanner.nextLine();
		String f = scanner.nextLine();
		int w = f.length() - s.length() + 1;
		w = factorial(w);
		System.out.println(w);
	}
}
