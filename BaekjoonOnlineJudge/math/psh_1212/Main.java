package psh_1212;

import java.util.Scanner;

public class Main {
	/**
	 * 
	 * https://www.acmicpc.net/problem/1212
	 * 8진수 2진수
	 */
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String eightNumber = in.next();
		StringBuffer sbTwoNumber = new StringBuffer();
		StringBuffer sbReverse = new StringBuffer();
		
		int temp = 0;
		
		for (int i = 0; i < eightNumber.length(); i++) {
			temp = Integer.valueOf(eightNumber.charAt(i));
			sbReverse.delete(0, sbReverse.length());
			for (int j = 0; j < 3; j++) {
				sbReverse.append(temp%2);
				if (temp == 1)
					sbReverse.append(1);
				else
					temp /= 2; 
			}
			sbTwoNumber.append(sbReverse.reverse());
		}
		if (sbTwoNumber.charAt(0) == '0') {
			sbTwoNumber.deleteCharAt(0);
			if (sbTwoNumber.charAt(0) == '0'){
				sbTwoNumber.deleteCharAt(1);
			}
		}
		System.out.println(sbTwoNumber.toString());
	}
}
