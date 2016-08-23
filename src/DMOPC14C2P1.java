import java.util.Scanner;

public class DMOPC14C2P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= x; i++) {
			int w = scanner.nextInt();
			for (int j = 0; j < w; j++) {
				count += scanner.nextInt();
			}
			if (count == 0)
				System.out.println("Weekend");
			else 
				System.out.println("Day " + i + ": " + count);
			count = 0;
		}
	}
}
