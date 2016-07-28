import java.util.Scanner;
 
public class CCC02S2 {
	static String simp(int x, int y) {
		for (int i = x ; i > 0; i--) {
			if (x % i == 0 && y % i == 0 ) {
				x /= i;
				y /= i;
			}
		}
		
		return (x + "/" + y);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x % y == 0) {
			System.out.println(x / y);
		}
		else if (x < y) {
			System.out.println(simp(x, y));
		}
		else {
			System.out.println((x / y) + " " + simp(x%y, y));
		}
	}
}

