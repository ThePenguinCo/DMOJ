import java.util.*;

public class CCC05S4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int z = 0; z < T; z++) {
			int N = scanner.nextInt();
			scanner.nextLine();
			String[] list = new String[N]; String[] tree = new String[N];
			for (int i = 0; i < N; i++)
				list[i] = scanner.nextLine();
			tree[0] = list[N-1];
			int current = 0, len = 0;
			for (int i = 0, j = 0; i < N; i++) {
				for (j = 0; j <= current; j++)
					if (tree[j].equals(list[i])) break;
				tree[j] = list[i]; current = j;
				len = Math.max(j, len);
			}
			System.out.println(N*10 - len*20);
		}
	}
}