package psh_11651;

import java.util.Scanner;
/*
 * 문제        : https://www.acmicpc.net/problem/11651
 * 문제 종류 : 좌표문제
 * 작성자     : 박성훈
 * 작성일     : 2017-08-03
 * 풀이 여부 : 실패
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int comma[][] = new int[N][N];
		int y[] = new int[N];
		int x[] = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				comma[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			y[i] = comma[i][1];
		}
		quick(y, 0, y.length-1);
		
		for (int j : y) {
			System.out.println(j);
		}
	}

	public static void quick (int d[], int l, int r){
		int left = l;
		int right =r;
		int pivot = d[(l+r) / 2];
		
		do{
			while (d[left] < pivot) left++;
			while (d[right] > pivot) right--;
			
			if (left <= right) {
				int temp = d[left];
				d[left] = d[right];
				d[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		
		if (l < right) quick(d, l, right);
		if (r > left) quick(d, left, r);
	}
}
