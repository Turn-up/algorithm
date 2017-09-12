package psh_2167;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/2167
 * 문제 종류  : 2차원 배열의 합
 * 작성자     : 박성훈
 * 작성일     : 2017-09-11
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int twoArray[][] = new int[n+1][m+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				twoArray[i][j] =in.nextInt();
			}
		}
		int k = in.nextInt();
		int result = 0;
		for (int z=0; z<k; z++) {
			result = 0;
			int i = in.nextInt();
			int j = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			for (int u=i; u<=x; u++) {
				for (int v=j; v<=y; v++) {
					result += twoArray[u][v]; 
				}
			}
			System.out.println(result);
		}
	}
}
