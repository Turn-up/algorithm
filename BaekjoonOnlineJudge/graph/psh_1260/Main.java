package psh_1260;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/1260
 * ���� ���� : �׷��� DFS, BFS ����
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-04
 * */
public class Main {

	static ArrayList<ArrayList<Integer>> a;
	static boolean dfsCheck[];
	static boolean bfsCheck[];
	static Queue<Integer> q;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // ����
		int m = in.nextInt(); // ����
		int v = in.nextInt(); // ���� ����
		dfsCheck = new boolean[n + 1];
		bfsCheck = new boolean[n + 1];
		a = new ArrayList<>();
		q = new LinkedList<>();

		for (int i = 0; i <= n; i++) {
			a.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			a.get(x).add(y);
			a.get(y).add(x);
		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(a.get(i));
		}

		dfs(v);
		System.out.println();
		bfs(v);
	}

	public static void dfs(int x) {
		dfsCheck[x] = true;
		System.out.print(x + " ");
		for (int i = 0; i < a.get(x).size(); i++) {
			int y = a.get(x).get(i);
			if (dfsCheck[y] == false) {
				dfs(y);
			}
		}
	}

	public static void bfs(int start) {
		q.offer(start);
		bfsCheck[start] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int i : a.get(x)) {
				if (bfsCheck[i] == false) {
					q.offer(i);
					bfsCheck[i] = true;
				}
			}
		}
	}
}