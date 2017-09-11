package psh_2178;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class PairXY {
		int x;
		int y;

		public PairXY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void bfs(boolean check[][], int data[][], int x, int y) {
		Queue<PairXY> q = new LinkedList<>();
		q.add(new PairXY(x, y));
		check[x][y] = true;
		while (!q.isEmpty()) {
			int xPoint = q.peek().x;
			int yPoint = q.remove().y;
			int nowData = data[xPoint][yPoint];
			if (nowData != 0) {
				if (xPoint + 1 < data.length && data[xPoint + 1][yPoint] != 0 && check[xPoint + 1][yPoint] == false) {
					q.add(new PairXY(xPoint + 1, yPoint));
					data[xPoint + 1][yPoint] += nowData;
					check[xPoint + 1][yPoint] = true;
				}
				if (xPoint - 1 >= 0 && data[xPoint - 1][yPoint] != 0 && check[xPoint - 1][yPoint] == false) {
					q.add(new PairXY(xPoint - 1, yPoint));
					data[xPoint - 1][yPoint] += nowData;
					check[xPoint - 1][yPoint] = true;
				}
				if (yPoint + 1 < data[xPoint].length && data[xPoint][yPoint + 1] != 0
						&& check[xPoint][yPoint + 1] == false) {
					q.add(new PairXY(xPoint, yPoint + 1));
					data[xPoint][yPoint + 1] += nowData;
					check[xPoint][yPoint + 1] = true;
				}
				if (yPoint - 1 >= 0 && data[xPoint][yPoint - 1] != 0 && check[xPoint][yPoint - 1] == false) {
					q.add(new PairXY(xPoint, yPoint - 1));
					data[xPoint][yPoint - 1] += nowData;
					check[xPoint][yPoint - 1] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean check[][] = new boolean[n][m];
		int data[][] = new int[n][m];
		// ArrayList <PairXY> pairXYList = new ArrayList<>();
		String value;

		for (int i = 0; i < n; i++) {
			value = in.next();
			for (int j = 0; j < m; j++) {
				data[i][j] = value.charAt(j) - '0';
				// pairXYList.add(new PairXY(i,j));
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!check[i][j] && data[i][j] != 0) {
					bfs(check, data, i, j);
				}
			}
		}
		System.out.println(data[n - 1][m - 1]);

	}
}
