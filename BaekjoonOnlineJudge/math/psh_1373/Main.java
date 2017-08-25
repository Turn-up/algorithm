package psh_1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����       : https://www.acmicpc.net/problem/1373
 * ���� ����  : 2���� 8���� - ����
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-17
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
