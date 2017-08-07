package psh_11724;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * ����        : https://www.acmicpc.net/problem/11724
 * ���� ����  : �׷��� -������
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-06
 * */
public class Main {
	private static ArrayList<ArrayList<Integer>> a;
	private static int d[];
	private static int ans;
	
	public static void dfs(int x) {
		d[x] = 1;
		for (int i = 0; i < a.get(x).size(); i++) {
			int y = a.get(x).get(i);
			if (d[y] == 0) {
				dfs(y);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();// ������ ����
		int M = in.nextInt();// ������ ����
		a = new ArrayList<ArrayList<Integer>>(N+1);
		d = new int[N + 1];
		ans = 0;

		for (int i = 0; i < N+1; i++) {
			a.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int t1 = in.nextInt();
			int t2 = in.nextInt();
			a.get(t1).add(t2);
            a.get(t2).add(t1);
		}

		for (int i = 1; i <= N; i++) {
			if (d[i] == 0) {
				dfs(i);
				ans++;
			}

		}
		System.out.println(ans);
	}
}
