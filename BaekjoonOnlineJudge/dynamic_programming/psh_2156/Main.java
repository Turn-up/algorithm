package psh_2156;

import java.util.Scanner;
/*
 * 문제        : https://www.acmicpc.net/problem/2156
 * 문제 종류  : 포도주 시식 - dp 
 * 작성자     : 박성훈
 * 작성일     : 2017-08-14
 * */
public class Main {

	public static long maxValue(long v1, long v2, long v3) {
		long temp = v1 > v2 ? v1 : v2;
		long result = temp > v3 ? temp : v3;

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int a[] = new int[size + 1];
		long d[][] = new long[size+1][3];
		for (int i = 1; i <= size; i++) {

			a[i] = in.nextInt();
		}

		d[1][0] = 0;
		d[1][1] = a[1];
		d[1][2] = 0;

		for (int i = 2; i <= size; i++) {
			d[i][0] = maxValue(d[i - 1][2], d[i - 1][1], d[i - 1][0]);
			d[i][1] = d[i - 1][0] + a[i];
			d[i][2] = d[i - 1][1] + a[i];

		}
		System.out.println(maxValue(d[size][2], d[size][1], d[size][0]));
	}
}
