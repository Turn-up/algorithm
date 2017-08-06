package psh_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 문제        : https://www.acmicpc.net/problem/10989
 * 문제 종류 : 정렬
 * 작성자     : 박성훈
 * 작성일     : 2017-08-03
 * */
public class Main {

	private static int size; // N개
	private static int data[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		data = new int[size];

		for (int i = 0; i < size; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}

		quickSort(data, 0, data.length - 1);

		for (int d : data) {
			System.out.println(d);
		}
	}

	public static void quickSort(int d[], int l, int r) {
		int left = l;
		int right = r;
		int pivot = d[(l + r) / 2];

		do {
			while (d[left] < pivot)
				left++;
			while (d[right] > pivot)
				right--;

			if (left <= right) {
				int temp = d[left];
				d[left] = d[right];
				d[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		if (l < right)
			quickSort(d, l, right);
		if (r > left)
			quickSort(d, left, r);
	}
}
