import java.util.Scanner;

public class CSPC1P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (scanner.nextInt() > 14) {
				count++;
			}
		}
		if (count > 12) {
			
		}
		
	}
}