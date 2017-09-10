package psh_2667;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * ����       : https://www.acmicpc.net/problem/2667
 * ���� ����  : ������ȣ -�׷���
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-09
 * */
public class Main1 {
	static int a[][]; // ���� ��
	static int d[][]; // ���� ��
	static ArrayList<Integer> ans;
	static int dx[] = {0, 0, 1, -1};
	static int dy[] = {1, -1, 0, 0};
	static int N;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt(); // ������ ũ��
		a = new int[N + 1][N + 1];
		d = new int[N + 1][N + 1];
		ans = new ArrayList<>();
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			char[] temp = in.next().toCharArray();
			for (int j = 1; j <= N; j++) {
				a[i][j] = temp[j-1] -'0';
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (a[i][j] == 1 && d[i][j] == 0) {
					ans.add(bfs(i, j, ++cnt));
				}
			}
		}
		Collections.sort(ans);
		System.out.println(ans.size());
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static int bfs(int x, int y, int cnt) {		
		int result = 1;
		Queue<PairXY> q = new LinkedList<>();
		q.add(new PairXY(x, y));
		d[x][y] = cnt;

		while (!q.isEmpty()) {
			PairXY xy = q.remove();
			x = xy.x;
			y = xy.y;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (1 <= nx && nx <= N 
						&& 1 <= ny && ny <= N) {
					if (a[nx][ny] == 1 && d[nx][ny] == 0) {
						d[nx][ny] = cnt;
						result++;
						q.add(new PairXY(nx, ny));
					}
				}
			}
		}
		return result;
	}

	static class PairXY {
		int x;
		int y;

		public PairXY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
