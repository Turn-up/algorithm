package psh_2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 문제        : https://www.acmicpc.net/problem/2011
 * 문제 종류  : 암호코드
 * 작성자     : 박성훈
 * 작성일     : 2017-08-15
 * */
public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();

		int d[] = new int[value.length() + 1];
		int a[] = new int[value.length() + 1];

		d[0] = 1;

		for (int i = 0; i < value.length(); i++) {
			a[i+1] = value.charAt(i) - '0';
		}

		for (int i = 1; i <= value.length(); i++) {
			if (a[i] > 0)
				d[i] = (d[i] + d[i - 1]) % 1000000;

			int x = a[i - 1] * 10 + a[i];
			
			if (x <= 26 && x >= 10) {
				d[i] = (d[i] + d[i - 2]) % 1000000;
			}
		}
		System.out.println(d[value.length()] % 1000000);
	}
}
