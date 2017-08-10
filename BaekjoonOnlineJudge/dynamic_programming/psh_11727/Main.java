package psh_11727;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/11727
 * 문제 종류  : 2xN 타일링 - dp 
 * 작성자     : 박성훈
 * 작성일     : 2017-07-31
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 2 x N
		
		int d[] = new int[n+2];
		d[1] = 1;
		d[2] = 3;

		for (int i = 3; i <= n; i++) {
			d[i] = (d[i-1] + 2*d[i-2]) % 10007;
		}
		
		System.out.println(d[n]);
	}
}
