import java.util.Scanner;

public class CCC08S1 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		int x;
		String y;
		String coldname = "";
		int coldtemp = 201;
		
		while (true) {
			y = scanner.nextLine();
			x = scanner1.nextInt();
			
			if (x < coldtemp) {
				coldtemp = x;
				coldname = y;
			}
			
			if (y.equals("Waterloo")) {
				break;
			}
		}
		
		System.out.println(coldname);
	}
}
