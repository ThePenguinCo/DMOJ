import java.util.Scanner;

public class CCC12J4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int x = scanner.nextInt();
		scanner.nextLine();
		String w = scanner.nextLine();
		for (int i = 0; i < w.length(); i++){
			char q = (char)(w.charAt(i) - (3 * (i + 1) + x));
		    if (q < 'A')
		        q = (char)((int)('Z') + q - (int)('A') + 1);
			builder.append(q);
		}
		System.out.println(builder.toString());
	}
}
