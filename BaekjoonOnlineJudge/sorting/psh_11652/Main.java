package psh_11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제        : https://www.acmicpc.net/problem/11652
 * 문제 종류 : 정렬
 * 작성자     : 박성훈
 * 작성일     : 2017-08-03
 * */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		long card[] = new long[size];
		int cnt = 1;
		long value = 0;
		int maxHaveCardCount = 0;
		int maxHaveCardindex = 0;
		
		for (int i = 0; i < size; i++) {
			card[i] = Long.parseLong(br.readLine());
		}
		
		quickSorting(card, 0, card.length - 1);

		value = card[0];
		for (int i = 1; i < size; i++) {
			if (value == card[i]){
				cnt++;
			} else {
				if (cnt > maxHaveCardCount) {
					maxHaveCardCount = cnt;
					maxHaveCardindex = i-1;
				}
				value = card[i];
				cnt = 1;
			}
		}
		if (cnt > maxHaveCardCount){
			System.out.println(card[card.length-1]);
		}else
			System.out.println(card[maxHaveCardindex]);
	}

	public static void quickSorting(long data[], int l, int r) {
		int left = l;
		int right = r;
		long pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				long temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			quickSorting(data, l, right);
		if (r > left)
			quickSorting(data, left, r);
	}
}
