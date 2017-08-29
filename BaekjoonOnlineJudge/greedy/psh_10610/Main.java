package psh_10610;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/10610
 * 문제 종류  : 30 - greedy
 * 작성자     : 박성훈
 * 작성일     : 2017-08-29
 * */
public class Main {
	
	private static void mergeSort(int arr[]) {
		int size = arr.length;
		
		if (size == 1) {
			return;
		}
		
		int tempArr1[] = new int[size/2 + size%2];
		int tempArr2[] = new int[size/2];
		
		for (int i=0; i<size; i++) {
			if (i < (size / 2 + size%2)) {
				tempArr1[i] = arr[i];
			} else {
				tempArr2[i - (size / 2 + size%2)] = arr[i];
			}
		}
		mergeSort(tempArr1);
		mergeSort(tempArr2);
		
		merge(tempArr1, tempArr2, arr);
	}
	
	private static void merge(int a[], int b[], int arr[]) {
		int iA =0; //a 배열의 길이 담기 
		int iB =0; //b 배열의 길이 담기
		int iArr = 0; //c 배열의 길이 담기
		while(iA < a.length) {
			if (iB < b.length) {
				if (a[iA] < b[iB]) {
					arr[iArr] = a[iA];
					iA++;
				} else {
					arr[iArr] = b[iB];
					iB++;
				}
			} else {
				arr[iArr] = a[iA];
				iA++;
			}
			iArr++;
		}
		while (iB <b.length) {
			arr[iArr] = b[iB];
			iB++;
			iArr++;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		
		boolean flag = false;
		int sum = n.charAt(0);
		StringBuffer answer = new StringBuffer();
		for (int i=1; i<n.length(); i++) {
			sum += n.charAt(i) - '0';
			if (n.charAt(i) == '0' ) {
				flag = true;
			}
		}
		
		if (flag && sum % 3 == 0) {
			int [] arr = new int[n.length()];
			for (int i = 0; i<n.length() ;i++) {
				arr[i] = n.charAt(i) - '0';
			}
			
			mergeSort(arr);
			for (int i=arr.length-1; i >= 0 ;i--) {
				System.out.print(arr[i]);
			}
		} else {
			answer.append("-1");
		}
		System.out.println(answer.toString());
	}
}
