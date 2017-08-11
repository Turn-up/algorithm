package psh_11655;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/11655
 * 문제 종류  : ROT13
 * 작성자     : 박성훈
 * 작성일     : 2017-08-11
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		ArrayList<String> s = new ArrayList<>();
		String line = in.nextLine();
		String s[] = line.split(" ");
		
 		for (int i=0; i<s.length; i++) {
			int cnt = s[i].length();
			for (int j=0; j<cnt; j++) {
				char a = s[i].charAt(j);
				int smallHalf = ('a' + 'z') / 2;
				int largeHalf = ('A' + 'Z') / 2;
				
				if ((a >= 'a' && a <= smallHalf)
						|| (a >= 'A' && a <= largeHalf)) {
					a = (char)(a + 13);
				} else if ((a > smallHalf && a <= 'z') 
						|| (a > largeHalf && a <= 'Z')) {
					a = (char)(a - 13);
				}
				System.out.print(a);
			}
			System.out.print(" ");
		}
	}
}
