package psh_2193;
/*
 * 문제       : https://www.acmicpc.net/problem/2193
 * 문제 종류  : 이친수 - dp
 * 작성자     : 박성훈
 * 작성일     : 2017-08-01
 * */
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		int n = in.nextInt();
		long[][] d = new long[91][2];
		d[1][0] = 0;
		d[1][1] = 1;

		for (int i = 2; i < n + 1; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					d[i][j] = d[i - 1][1] + d[i - 1][0];
				} else if (j == 1) {
					d[i][j] = d[i - 1][0];
				}
			}
		}
		System.out.println(d[n][0] + d[n][1]);
	}

}
