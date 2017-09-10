package psh_2667;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int xLine[] = {0,0,1,-1};
	static int yLine[] = {1,-1,0,0};
	
	static class PairXY {
		int x;
		int y;
		
		public PairXY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static int bfs(int x, int y, int data[][], boolean check[][]){
		int result = 1;
		Queue<PairXY> q = new LinkedList<>();
		q.add(new PairXY(x, y));
		check[x][y] = true;
		while (!q.isEmpty()){
			
			int nowX = q.peek().x;
			int nowY = q.remove().y;
			
			for (int i=0; i<4; i++) {
				int nextX = nowX+xLine[i];
				int nextY = nowY+yLine[i];
				
				if (nextX >= 0 && nextX < data.length &&
						nextY >= 0 && nextY < data[i].length){
					if (data[nextX][nextY] != 0 && check[nextX][nextY] == false) {
						q.add(new PairXY(nextX, nextY));
						check[nextX][nextY] = true;
						result++;
					}
				}
			}
		}
		
		return result ;
	}
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean check[][] = new boolean[n][n];
		int data[][] = new int[n][n];
		int ansCount = 0;
		ArrayList<Integer> dangeeCount = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			String value = in.next();
			int size = value.length();
			for (int j=0; j<size; j++) {
				data[i][j] = value.charAt(j) - '0';
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (check[i][j] == false && data[i][j] != 0) {
					dangeeCount.add(bfs(i,j, data, check));
					ansCount++;
				}
			}
		}
		System.out.println(ansCount);
		Collections.sort(dangeeCount);
		for (int i : dangeeCount) {
			System.out.println(i);
		}
		
	}
}
