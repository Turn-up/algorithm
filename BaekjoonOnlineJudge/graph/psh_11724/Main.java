package psh_11724;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제        : https://www.acmicpc.net/problem/11724
 * 문제 종류  : 그래프 -연결요소
 * 작성자     : 박성훈
 * 작성일     : 2017-08-06
 * */
public class Main {
	private static ArrayList<ArrayList<Integer>> a;
	private static int d[];
	private static int ans;
	private static int N;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();// 정점의 개수
		int M = in.nextInt();// 간선의 개수
		a = new ArrayList<>();
		d = new int[N + 1];
		ans = 0;

		for (int i = 0; i < N+1; i++) {
			a.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			a.get(in.nextInt()).add(in.nextInt());
		}

		for (int i = 1; i < N+1; i++) {
			if (d[i] == 0) {
				dfs(i);
				ans++;
			}

		}
		System.out.println(ans);
	}

	public static void dfs(int x) {
		d[x] = 1;
		for (int i = 0; i < a.get(x).size(); i++) {
			int y = a.get(x).get(i);
			if (d[y] == 0) {
				d[y] = 1;
				dfs(y);
			}
		}
	}
}
