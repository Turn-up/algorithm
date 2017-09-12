package psh_1149;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/1149
 * 문제 종류  : rgb 집 -dp
 * 작성자     : 박성훈
 * 작성일     : 2017-09-11
 * */
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rgbHouse[][] = new int[n][3];
		int dp[][] = new int[n][3];
		for (int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				rgbHouse[i][j] = in.nextInt();
			}
		}
		dp [0][0] = rgbHouse[0][0];
		dp [0][1] = rgbHouse[0][1];
		dp [0][2] = rgbHouse[0][2];
		
		for (int i=1; i<n; i++) {
			dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]) + rgbHouse[i][0];
			dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]) + rgbHouse[i][1];
			dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]) + rgbHouse[i][2];
		}
		
		System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
	}
}
