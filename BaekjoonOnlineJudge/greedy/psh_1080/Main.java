package psh_1080;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/1080
 * 문제 종류  : 행렬 - greedy
 * 작성자     : 박성훈
 * 작성일     : 2017-08-29
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		int ans = 0;
		for (int i = 0; i < n * 2; i++) {
			String v = in.next(); // 입력으로 주어진 값
			for (int j = 0; j < m; j++) {
				if (i < n)
					a[i][j] = (v.charAt(j) - '0');
				else
					b[i - n][j] = (v.charAt(j) - '0');
			}
		}
		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < m - 2; j++) {
				if (a[i][j] != b[i][j]) {
					for (int k = i; k < i + 3; k++) {
						for (int v = j; v < j + 3; v++) {
							a[k][v] = (a[k][v] + 1) % 2;
						}
					}
					ans++;
				}
			}
		}
		
	    for (int i=0; i<n; i++) {
	        for (int j=0; j<m; j++) {
	            if (a[i][j] != b[i][j]) {
	                ans = -1;
	            }
	        }
	    }
		
//		if (n < 3 || m < 3) {
//			ans = -1;
//		} else {
//			for (int j = 0; j < n - 2; j++) {
//				for (int i = m - 2; i < m; i++) {
//					if (a[j][i] != b[j][i]) {
//						ans = -1;
//					}
//				}
//			}
//			
//			for (int i = n - 2; i < n; i++) {
//				for (int j = 0; j < m; j++) {
//					if (a[i][j] != b[i][j]) {
//						ans = -1;
//					}
//				}
//			}
//		}
		System.out.println(ans);
	}
}
