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
		
		
		System.out.println(d[size]);
		
	}
	
	public static long max (long value1, long value2) {
		return value1 > value2 ? value1: value2;
	}
}
