package psh_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * 문제        : https://www.acmicpc.net/problem/2178
 * 문제 종류  : 미로찾기 - 그래프
 * 작성자     : 박성훈
 * 작성일     : 2017-08-09
 * */
public class Main {

	private static int N;
	private static int M;
	private static int a[][];
	private static int d[][];
	private static int dx[] = { 0, 0, 1, -1 };
	private static int dy[] = { 1, -1, 0, 0 };
	
	private static void bfs(int x, int y) {
		Queue<PairXY> q = new LinkedList<>();
		q.add(new PairXY(x, y));
		d[1][1] = 1;
		
		while (!q.isEmpty()) {
			PairXY xy = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = xy.x + dx[i];
				int ny = xy.y + dy[i];
				
				if (1 <= nx && nx <= N && 1 <= ny && ny <= M) {
					if (a[nx][ny] == 1 && d[nx][ny] == 0){
						q.add(new PairXY(nx, ny));
						d[nx][ny] = d[xy.x][xy.y] + 1;
					}
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		a = new int[N + 1][M + 1];
		d = new int[N + 1][M + 1];
		
		for (int i = 1; i <= N; i++) {
			char[] temp = in.next().toCharArray();
			for (int j = 1; j <= M; j++) {
				a[i][j] = temp[j - 1] - '0';
			}
		}

		bfs(1,1);
		System.out.println(d[N][M]);
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
