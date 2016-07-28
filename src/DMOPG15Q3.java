import java.util.Arrays;
import java.util.Scanner;

public class DMOPG15Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int numberofminion;
		int myminion[];
		int yourminion;
		int yourhealth;
		int attacks;
		int otherattacks;
		int totalattack;
		int count;
		boolean fail;
		for (int i = 0; i < x; i++) {
			attacks = 0;
			otherattacks = 0;
			totalattack = 0;
			count = 0;
			fail = true;
			numberofminion = scanner.nextInt();
			myminion = new int[numberofminion];
			for (int j = 0; j < numberofminion; j++) {
				myminion[i] = scanner.nextInt();
				totalattack = totalattack + myminion[i];
			}
			
			yourhealth = scanner.nextInt();
			yourminion = scanner.nextInt();
			
			Arrays.sort(myminion);
			count = numberofminion - 1;
			while (attacks < yourminion) {
				if (count > 0) {
					count--;
					attacks += myminion[count];
				}
				if (count == 0) {
					fail = true;
					break;
				}
			}
			while (count >= 0) {
				if (count == 0) {
					fail = true;
					break;
				}
				count--;
				otherattacks += myminion[count];
				if (otherattacks > yourhealth) {
					fail = false;
					break;
				}
			}

			if (fail) {
				System.out.println("NOT LETHAL");
			}
			else {
				System.out.println("LETHAL");
			}
		}
		scanner.close();
	}
}