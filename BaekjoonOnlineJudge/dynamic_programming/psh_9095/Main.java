package psh_9095;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/9095
 * 문제 종류  : 1,2,3 조합 - dp
 * 작성자     : 박성훈
 * 작성일     : 2017-08-01
 * */
public class Main {
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt(); // 테스트 케이스

		int[] d = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for (int i = 4; i < 12; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		for (int i = 0; i < t; i++) {
			System.out.println(d[in.nextInt()]);
		}
	}
}
