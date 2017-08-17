package psh_11724;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * 문제       : https://www.acmicpc.net/problem/2146
 * 문제 종류  : 다리 만들기 - 그래프
 * 작성자     : 박성훈
 * 작성일     : 2017-08-10
 * */
class PairXY {
	int x;
	int y;

	PairXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	private static int N;
	private static int a[][];
	private static int distance[][];
	private static int land[][];
	private static int dx[] = { 0, 0, 1, -1 };
	private static int dy[] = { 1, -1, 0, 0 };
	private static int cnt;
	

	public static void bfs(int i, int j, int cnt) {
		Queue<PairXY> q = new LinkedList<>();
		q.add(new PairXY(i, j));
		land[i][j] = cnt;
		

		/** 그룹 만들기 */
		while (!q.isEmpty()) {
			PairXY xy = q.remove();
			for (int k = 0; k < 4; k++) {
				int nx = xy.x + dx[k];
				int ny = xy.y + dy[k];
				
				if (0 <= nx && nx < N && 0 <= ny && ny < N) {
					if (a[nx][ny] == 1 && land[nx][ny] == 0) {
						q.add(new PairXY(nx, ny));
						land[nx][ny] = cnt;
					}
				}
			}
		}
		
		long a = Long.valueOf("100");
	}

	public static void broadBfs() {
		Queue<PairXY> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				distance[i][j] = -1;
				if (a[i][j] == 1) {
					distance[i][j] = 0;
					q.add(new PairXY(i, j));
				}
			}
		}
		while (!q.isEmpty()) {
			PairXY xy = q.remove();
			for (int k = 0; k < 4; k++) {
				int nx = xy.x + dx[k];
				int ny = xy.y + dy[k];

				if (0 <= nx && nx < N && 0 <= ny && ny < N) {
					if (distance[nx][ny] == -1) {
						q.add(new PairXY(nx, ny));
						distance[nx][ny] = distance[xy.x][xy.y] + 1;
						land[nx][ny] = land[xy.x][xy.y];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		a = new int[N][N];
		distance = new int[N][N];
		land = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (land[i][j] == 0 && a[i][j] == 1) {
					bfs(i, j, ++cnt);
				}
			}
		}
		broadBfs();
		
		int ans = -1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					if (0 <= x && x < N && 0 <= y && y < N) {
						if (land[i][j] != land[x][y] ) {
							int temp = distance[i][j] + distance[x][y];
							if (ans == -1 || ans > temp )
								ans = temp;
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
