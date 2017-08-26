package psh_1201;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/1201
 * 문제 종류  : NMK - 그리디 알고리즘
 * 작성자     : 박성훈
 * 작성일     : 2017-08-23
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int[] basicArray = new int[501];
		ArrayList<ArrayList<Integer>> kGroupArrayList = new ArrayList<>();
		for (int i = 1; i < n+1; i++) {
			basicArray[i] = i;
		}

		for (int i = 1; i < m + 1; i++) {
			kGroupArrayList.add(new ArrayList<>());
		}

		if (m + k - 1 > n || (m * k) < n) {
			System.out.println(-1);
		} else {
			int temp = n;
			for (int i = m-1; i >= 0; i--) {
				for (int j = 1; j < k+1; j++) {
					if (n - j >= i) {
						kGroupArrayList.get(i).add(basicArray[temp--]);
					}
				}
				n -= kGroupArrayList.get(i).size();
			}
			
			if (temp == 1) {
				kGroupArrayList.get(0).add(basicArray[temp]);
			}
		}
		
		for (int i=0; i < m; i++) {
			for (int j : kGroupArrayList.get(i)) {
				System.out.print(j + " ");
			}
		}
	}
}
