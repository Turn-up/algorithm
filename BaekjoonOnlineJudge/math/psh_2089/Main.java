package psh_2089;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/2089
 * 문제 종류  : -2진수
 * 작성자     : 박성훈
 * 작성일     : 2017-08-17
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = in.nextInt();
		if (n != 0) {
			while (n != 1) {
				if (n > 0) {
					sb.append(n % 2);
					n = -(n / 2);
				} else if (n < 0) {
					sb.append(-(n % 2));
					if (n % 2 == 0)
						n = -(n / 2);
					else
						n = -(n / 2) + 1;
				}
			}

			sb.append(1);
			System.out.println(sb.reverse());
		} else if (n == 0) {
			System.out.println(0);
		}
		
	}
}
