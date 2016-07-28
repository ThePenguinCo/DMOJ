import java.util.Scanner;

public class DMOPC14C2P4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int tree[] = new int[N];
		for (int i = 0; i < N; i++) {
			tree[i] = scanner.nextInt();
		}
		int newtree[] = new int[N + 1];
		newtree[0] = 0;
		for (int i = 0; i < N; i++) {
			newtree[i + 1] = newtree[i] + tree[i];
		}
		int Q = scanner.nextInt();
		int first, last;
		for (int i = 0; i < Q; i++) {
			first = scanner.nextInt();
			last = scanner.nextInt();
			System.out.println(newtree[last + 1] - newtree[first]);
		}
		scanner.close();
	}
}
