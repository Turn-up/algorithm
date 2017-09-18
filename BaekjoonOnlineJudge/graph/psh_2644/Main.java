package psh_2644;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int findBfs(int x, int y, ArrayList<ArrayList<Integer>> r) {
		int result[] = new int[r.size() + 1];
		Queue<Integer> q = new LinkedList<>();
		q.add(x);
		while (!q.isEmpty()) {
			int nextX = q.remove();
			int size = r.get(nextX).size();
			for (int i = 0; i < size; i++) {
				int v = r.get(nextX).get(i);
				if (result[v] == 0) {
					// 부모의 자식이 여러명 일 수 있다 그러나 다 1촌관계다
					result[v] = result[nextX] + 1;
					q.add(v);
				}
			}
		}
		return result[y];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int relation = in.nextInt();
		ArrayList<ArrayList<Integer>> r = new ArrayList<>();

		for (int i = 0; i < n+1; i++) {
			r.add(new ArrayList<>());
		}
		for (int i = 0; i < relation; i++) {
			int parent = in.nextInt();
			int child = in.nextInt();
			r.get(parent).add(child);
			r.get(child).add(parent);
		}
		int result = findBfs(x, y, r);
		if (result == 0)
			System.out.println(-1);
		else
			System.out.println(result);
	}
}
