package psh_1912;

import java.io.IOException;
import java.util.Scanner;
/**
 *  dp 문제
 *  https://www.acmicpc.net/problem/1912
 * */
public class Main {
	
	private static Scanner in;
	private static int size;
	private static long d[];
	private static int n[];
	
	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);
		size = in.nextInt();
		d = new long[size];
		n = new int[size];
		
		//임의의 수열 셋팅
		for (int i = 0; i <size; i++) {
			n[i] = in.nextInt();
		}
		d[0] = n[0];

		for (int i = 1; i < size; i++) {
			d[i] = n[i];
		
			if (d[i-1] > 0) {
				d[i] += d[i-1]; 
			}
		}
		long result = d[0];
		for (long i : d) {
			if (result < i) {
				result = i;
			}
		}
		System.out.println(result);
	}
}
