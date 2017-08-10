package psh_9461;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/9461
 * 문제 종류  : 파도반 수열 - dp
 * 작성자     : 박성훈
 * 작성일     : 2017-08-01
 * */
public class Main {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		int T = in.nextInt();// 테스트 케이
		long[] d = new long[101];
		d[0] = 0;
		d[1] = 1;
		d[2] = 1;
		d[3] = 1;
		d[4] = d[1] + d[3];

		for (int i = 5; i < 101; i++) {
			d[i] = d[i - 1] + d[i - 5];
		}
		for (int i = 0; i < T; i++) {
			System.out.println(d[in.nextInt()]);
		}
	}
}
