package psh_2293;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/2293
 * 문제 종류  : 동전1
 * 작성자     : 박성훈
 * 작성일     : 2017-09-14
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 1 <= n <= 100
		int k = in.nextInt(); // 1 <= k <= 10,000
		int d[][] = new int[n+1][k+1];
		int nType[] = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			nType[i] = in.nextInt();
			d[nType[i]][i] = nType[i];
		}
		Arrays.sort(nType);
		
		for (int i=1; i <= n; i++ ) {
			for (int y=nType[i]; y<=k; y += nType[i] ) {
				
			}
		}
	}
}
