package psh_11052;

import java.util.Scanner;

public class Main {
	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			p[i] = in.nextInt();
		}
		
		int[] d = new int[n+1];
		d[1] = p[1];
		d[2] = p[2];
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (d[i] > d[i-j]+p[j]) {
					d[i] = d[i-j] + p[j];
				}
			}
		}
		
		System.out.println(d[n]);
	}
}
