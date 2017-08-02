package fail_psh_9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * https://www.acmicpc.net/problem/9465 스티커 dp
 * 
 */
public class Main {

	private static Scanner in;
	private static int testCase;
	private static int size;
	private static int n[][];
	private static int d[][];

	public static void main(String[] args) throws IOException {
		in = new Scanner(System.in);
		testCase = in.nextInt();
		size = in.nextInt();
		n = new int[3][size + 1];
		d = new int[3][size + 1];
		
		for (int i = 1; i < size + 1; i++) {
			for (int j = 1; j < size + 1; j++) {
				n[i][j] = in.nextInt();
			}
		}

		for (int i = 2; i < size + 1; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					d[i][j] = intValueCompare(d[i - 1][1], d[i - 1][0]);
			}
		}

	}

	/* 비교 출력 */
	public static int intValueCompare(int value1, int value2) {
		return value1 > value2 ? value1 : value2;
	}
}
