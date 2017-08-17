package psh_1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제       : https://www.acmicpc.net/problem/1373
 * 문제 종류  : 2진수 8진수 - 수학
 * 작성자     : 박성훈
 * 작성일     : 2017-08-17
 * */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stringNumber = br.readLine();
		int length = stringNumber.length();
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < length; i += 3) {
			int temp = 0;
			for (int j = i; j < i+3; j++) {
				if (j < length) {
					temp += (stringNumber.charAt(length-j-1) - '0') * Math.pow(2, j-i);
				}
			}
			result.append(temp);
		}
		System.out.println(result.reverse());
	}
}
