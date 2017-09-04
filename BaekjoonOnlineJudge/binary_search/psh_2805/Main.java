package psh_2805;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/2805
 * 문제 종류  : 나무 자르기 - 이분탐색
 * 작성자     : 박성훈
 * 작성일     : 2017-08-31
 * */
public class Main {

//	public static void quickSort(int l, int r, long data[]) {
//		int left = l;
//		int right = r;
//		long pivot = data[(l + r) / 2];
//
//		do {
//			while (data[left] < pivot)
//				left++;
//			while (data[right] > pivot)
//				right--;
//			if (left <= right) {
//				long temp = data[left];
//				data[left] = data[right];
//				data[right] = temp;
//				left++;
//				right--;
//			}
//		} while (left <= right);
//
//		if (l < right)
//			quickSort(l, right, data);
//		if (r > left)
//			quickSort(left, r, data);
//	}

	public static boolean check(long[] a, long mid, long m) {
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i]-mid >0) {
				sum += a[i]-mid; 
			}
		}
		return sum >= m;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// 나무 개수
		long m = in.nextLong();// 필요한 높이
		long a[] = new long[n];
		long l = 0;
		long r = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
			r = Math.max(r, a[i]);
		}

//		int sum = 0;
//		int result = 0;
//		for (int i = array[0]; i <= array[array.length - 1]; i++) {
//			sum = 0;
//			for (int v : array) {
//				if (v > i) {
//					sum += (v - i);
//				}
//			}
//			if (sum == m) {
//				result = i;
//				break;
//			}
//		}
//		quickSort(0, array.length - 1, array);
		long ans = 0;
		while (l <= r) {
			long mid = (l+r) /2;
			if (check(a, mid, m)) {
				ans = Math.max(ans, mid);
				l = mid +1;
			} else {
				r = mid -1;
			}
		}
		 System.out.println(ans);
	}
}
