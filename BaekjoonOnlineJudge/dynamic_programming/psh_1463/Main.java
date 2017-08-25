package psh_1463;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/1463
 * 문제 종류  : 1로 만들기 - dp
 * 작성자     : 박성훈
 * 작성일     : 2017-07-31
 * */
public class Main {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		String n = in.next();
		int count = n.length();
		int d = 0;
		int result = 0;
		
		for (int i = 0; i < count; i++) {
			d = n.charAt(i);
			if (count == 1) {
				result++;
				continue;
			}
			
			if (d <= '6' && n.charAt(i - 1) <= '2') {
				result++;
			} 
			result++;
		}
		
		System.out.println(result%1000000);
	}
}
