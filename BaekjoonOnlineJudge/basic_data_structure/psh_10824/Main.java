package psh_10824;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/10824
 * 문제 종류  : 네 수 - 자료구조
 * 작성자     : 박성훈
 * 작성일     : 2017-08-
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer value1 = new StringBuffer();
		value1.append(in.next());
		value1.append(in.next());
		
		long a = Long.parseLong(value1.toString());
		
		StringBuffer value2 = new StringBuffer();
		value2.append(in.next());
		value2.append(in.next());
		
		long b = Long.parseLong(value2.toString());
		
		System.out.println(a+b);
	}
}
