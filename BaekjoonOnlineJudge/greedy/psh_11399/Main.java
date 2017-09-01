package psh_11399;

import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/11399
 * 문제 종류  : ATM - greedy
 * 작성자     : 박성훈
 * 작성일     : 2017-08-26
 * */
public class Main {

	public static void quick(int l, int r, int d[]) {
		int left = l;
		int right = r;
		int pivot = d[(l + r) / 2];

		do {
			while (d[left] < pivot) left++;
			while (d[right] > pivot) right--;
			if (left <= right) {
				int temp = d[left];
				d[left] = d[right];
				d[right] = temp;
				left++;
				right--;
			}
			
		}while (left <= right);
		
		if (l< right) quick(l, right, d);
		if (left< r) quick(left, r, d);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p[] = new int[n];
		for (int i= 0; i<n; i++) {
			p[i] = in.nextInt();
		}
		quick(0, p.length-1, p);
		for (int i = 1; i < n; i++) {
			p[i] += p[i-1];
		}
		int answer = 0;
		for (int i: p) {
			answer += i; 
		}
		System.out.println(answer);
	}
}
