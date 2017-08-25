package psh_2745;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/2745
 * 문제 종류  : 진법 변환 - 수학
 * 작성자     : 박성훈
 * 작성일     : 2017-08-17
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String b = in.next();
		int n = in.nextInt();
		int result = 0;
		
		for (int i=b.length(); i > 0; i--) {
			int temp = b.charAt(i-1);
			if ('0' <= temp && temp <= '9') {
				temp = temp - '0';
			} else {
				temp =  temp - 'A' + 10;
			}
			result += (int) (temp * Math.pow(n, b.length()-i));
		}
		System.out.println(result);
	}
}
