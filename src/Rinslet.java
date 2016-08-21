import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rinslet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		int sum = 0;
		int[] alpha = new int[27];
		char[] xx = first.toCharArray();
		char[] yy = second.toCharArray();
		for (int i = 0; i < 27; i++) alpha[i] = 0;
		for (int i = 0; i < xx.length; i++) {
			if (xx[i] == 'a') alpha[1]++;
			if (xx[i] == 'b') alpha[2]++;
			if (xx[i] == 'c') alpha[3]++;
			if (xx[i] == 'd') alpha[4]++;
			if (xx[i] == 'e') alpha[5]++;
			if (xx[i] == 'f') alpha[6]++;
			if (xx[i] == 'g') alpha[7]++;
			if (xx[i] == 'h') alpha[8]++;
			if (xx[i] == 'i') alpha[9]++;
			if (xx[i] == 'j') alpha[10]++;
			if (xx[i] == 'k') alpha[11]++;
			if (xx[i] == 'l') alpha[12]++;
			if (xx[i] == 'm') alpha[13]++;
			if (xx[i] == 'n') alpha[14]++;
			if (xx[i] == 'o') alpha[15]++;
			if (xx[i] == 'p') alpha[16]++;
			if (xx[i] == 'q') alpha[17]++;
			if (xx[i] == 'r') alpha[18]++;
			if (xx[i] == 's') alpha[19]++;
			if (xx[i] == 't') alpha[20]++;
			if (xx[i] == 'u') alpha[21]++;
			if (xx[i] == 'v') alpha[22]++;
			if (xx[i] == 'w') alpha[23]++;
			if (xx[i] == 'x') alpha[24]++;
			if (xx[i] == 'y') alpha[25]++;
			if (xx[i] == 'z') alpha[26]++;
		}
		for (int i = 0; i < yy.length; i++) {
			if (yy[i] == 'a') alpha[1]--;
			if (yy[i] == 'b') alpha[2]--;
			if (yy[i] == 'c') alpha[3]--;
			if (yy[i] == 'd') alpha[4]--;
			if (yy[i] == 'e') alpha[5]--;
			if (yy[i] == 'f') alpha[6]--;
			if (yy[i] == 'g') alpha[7]--;
			if (yy[i] == 'h') alpha[8]--;
			if (yy[i] == 'i') alpha[9]--;
			if (yy[i] == 'j') alpha[10]--;
			if (yy[i] == 'k') alpha[11]--;
			if (yy[i] == 'l') alpha[12]--;
			if (yy[i] == 'm') alpha[13]--;
			if (yy[i] == 'n') alpha[14]--;
			if (yy[i] == 'o') alpha[15]--;
			if (yy[i] == 'p') alpha[16]--;
			if (yy[i] == 'q') alpha[17]--;
			if (yy[i] == 'r') alpha[18]--;
			if (yy[i] == 's') alpha[19]--;
			if (yy[i] == 't') alpha[20]--;
			if (yy[i] == 'u') alpha[21]--;
			if (yy[i] == 'v') alpha[22]--;
			if (yy[i] == 'w') alpha[23]--;
			if (yy[i] == 'x') alpha[24]--;
			if (yy[i] == 'y') alpha[25]--;
			if (yy[i] == 'z') alpha[26]--;
		}
		for (int i = 1; i < 27; i++) {
			if (alpha[i] > 0) {
				sum += alpha[i];
			}
			else if (alpha[i] < 0) {
				sum += alpha[i] * -1;
			}
		}
		System.out.println(sum);
	}	
}
