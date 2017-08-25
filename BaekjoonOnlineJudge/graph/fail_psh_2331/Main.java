package fail_psh_2331;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/2331
 * ���� ����  : �ݺ����� - �׷��� 
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-07
 * */
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String p = in.next();
		ArrayList<Integer> d = new ArrayList<>();
		d.add(MyStringToInteger(p));
		
		System.out.println(a);
		
		while(true) {
			d.add(MyStringToInteger(in.next()));
			
			in.next();
		}
		
	}
	
	public static int MyStringToInteger(String value) {
		int count = value.length();
		int result = 0;
		for (int i=0; i<count; i++) {
			result += (int)(value.charAt(i)-'0') * (int)(value.charAt(i)-'0'); 
		}
		return result;
	}
}
