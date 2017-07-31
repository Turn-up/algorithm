package psh_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static BufferedReader br;
	private static int size;
	private static int n[];
	private static long d[];
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		n = new int[size+1];
		d = new long[size+1];

		for (int i = 1; i <= size; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		d[1] = n[1];
		d[2] = d[1] + n[1];
		d[3] = n[3] + max(n[1] ,n[2]);
		
		for (int i = 4; i <= size; i++) {
			d[i] = max(d[i-2], d[i-3]+n[i-1]);
		}
		
		System.out.println(d[size]);
		
	}
	
	public static long max (long value1, long value2) {
		return value1 > value2 ? value1: value2;
	}
}
