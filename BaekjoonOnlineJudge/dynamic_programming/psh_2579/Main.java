package psh_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static BufferedReader br;
	private static int size;
	private static int n[];
	private static long d[][];
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		n = new int[size+1];
		d = new long[size+1][3];

		for (int i = 1; i <= size; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		d[1][1] = n[1];

		d[2][1] = n[2];
		d[2][2] = d[1][1] + n[2];
		
		for (int i = 3; i <= size; i++) {
			for (int j = 1; j < 3; j++) {
				d[i][j] = d[i-j][3-j]+ n[i];
			}
		}
		
		System.out.println(max(d[size][1], d[size][2]));
		
	}
	
	public static long max (long value1, long value2) {
		return value1 > value2 ? value1: value2;
	}
}
