package psh_1978;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/1978
 * 문제 종류  : 소수 찾기
 * 작성자     : 박성훈
 * 작성일     : 2017-08-17
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int s[] = new int[1001];
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		for (int i=1; i <1001; i++) {
			s[i] = i;
		}
		for (int i=2; i <1001; i++) {
			if (s[i] != 0) {
				for (int j=i*i; j < 1001; j +=i) {
					s[j] = 0;
				}
			}
		}
		int result = 0;
		for (int num : a) {
			if (s[num] != 0 && s[num] != 1)
				result++;
		}
		System.out.println(result);
	}
}
