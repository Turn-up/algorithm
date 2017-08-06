package math.psh_1676;

import java.util.Scanner;

/*
 * 문제        : https://www.acmicpc.net/problem/1676
 * 문제 종류 : 수학
 * 작성자     : 박성훈
 * 작성일     : 2017-08-02
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			if (i % 5 == 0) {
				cnt++;
			}
			if (i % 25 == 0) {
				cnt++;
			}
			if (i % 125 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}