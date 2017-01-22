import java.util.*;

public class DeathGun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt(); int count = 0;
		ArrayList<Integer>[] adj = new ArrayList[M+1];
		Map<String, Integer> map = new HashMap();
		String[] name = new String[M+1];
		int[] degree = new int[M+1];
		for (int i = 0; i < M+1; i++)
			adj[i] = new ArrayList<Integer>();
		for (int i = 0; i< M; i++) {
			String s1 = scanner.next(), s2 = scanner.next();
			if (!map.containsKey(s1)) {name[count] =s1; map.put(s1, count++);}
			if (!map.containsKey(s2)) {name[count] =s2; map.put(s2, count++);}
			adj[map.get(s2)].add(map.get(s1)); degree[map.get(s1)]++;
		}
		while(true) {
			boolean flag = false;
			for (int i = 0; i < count; i++) {
				if (degree[i] == 0) {
					flag = true;
					System.out.println(name[i]);
					degree[i]--;
					for(int v: adj[i]) degree[v]--;
					break;
				}
			}
			if (!flag) break;
		}
	}
}