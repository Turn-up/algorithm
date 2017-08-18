package psh_1934;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/1934
 * 문제 종류  : 최소공배수 -수학
 * 작성자     : 박성훈
 * 작성일     : 2017-08-16
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		for (int i=0; i<testCase; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();
			int originV1 = v1;
			int originV2 = v2;
			
			while (v2 > 0) {
				int temp = v1;
				v1 = v2;
				v2 = temp % v1;
			}
			System.out.println(originV1 * originV2 / v1);
		}
	}
}
