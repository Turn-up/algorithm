package fial_psh_11054;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11054 가장 긴 바이토닉 수열 dp 
 * 2017-08-01
 * 박성훈
 */
public class Main {

	private static Scanner in;
	private static int n; // 사이즈
	private static int a[]; // 수열
	private static int d[]; // dp
	private static int maxIndex;
	private static int maxValue;
	private static int largeResult;
	private static int smallResult;
	private static int result;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n + 1];
		d = new int[n + 1];
		result = 0;
		maxIndex = 0;
		maxValue = 0;

		// 수열 초기화
		for (int i = 1; i < n + 1; i++) {
			a[i] = in.nextInt();
		}

		for (int temp : a) {
			if (temp > maxValue) {
				maxValue = temp;
			}
		}
		d[1] = 1;

		for (int m = 1; m < n + 1; m++) {
			largeResult = 0;
			smallResult = 0;
			intArrayReset(d);
			
			if (a[m] == maxValue) {
				for (int i = 2; i <= m; i++) {
					for (int j = i; j > 1; j--) {
						if (a[i] > a[j - 1] && d[j - 1] >= d[i]) {
							d[i] = d[j - 1] + 1;
							if (largeResult < d[i]) {
								largeResult = d[i];
							}
						}
					}
				}
				d[m] = 1;
				for (int i = m + 1; i < n + 1; i++) {
					for (int j = i - 1; j >= m; j--) {
						if (a[j] > a[i] && d[i] <= d[j]) {
							d[i] = d[j] + 1;
							if (smallResult < d[i]) {
								smallResult = d[i];
							}
						}
					}
				}
			}
			if (result < (largeResult + smallResult - 1)) {
				result = largeResult + smallResult - 1;
			}
		}
		if (largeResult == 0) {
			System.out.println(smallResult);
		} else if (smallResult == 0) {
			System.out.println(largeResult);
		} else if (n == 1){
			System.out.println(1);
		} else 
			System.out.println(result);
	}
	
	public static void intArrayReset(int[] array){
		int size = array.length;
		for (int i = 1; i < size; i++) {
			array[i] = 1;
		}
	}
}
