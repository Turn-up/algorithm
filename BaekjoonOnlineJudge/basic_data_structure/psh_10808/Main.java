package psh_10808;

import java.util.Scanner;

/*
 * ����       : https://www.acmicpc.net/problem/10808
 * ���� ����  : ���ĺ� ����
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-11
 * */
public class Main {
	static int a[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		a = new int[26];

		int cnt = s.length();
		for (int i = 0; i < cnt; i++) {
			a[(s.charAt(i) - 'a')] += 1;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
