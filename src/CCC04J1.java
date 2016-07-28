import java.util.Scanner;

public class CCC04J1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("The largest square has side length " + (int)Math.sqrt(x) + ".");
    }
}