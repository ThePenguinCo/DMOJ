import java.util.Scanner;

public class BTS16P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int upper = 0, lower = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 'A' && s.charAt(i) < 'Z')
				upper++;
			else if (s.charAt(i) > 'a' && s.charAt(i) < 'z')
				lower++;
		}
		if (lower > upper) {
			String a = s.toLowerCase();
			System.out.println(a);
		}
		else if (upper > lower){
			String a = s.toUpperCase();
			System.out.println(a);
		}
		else 
			System.out.println(s);
	}
}
