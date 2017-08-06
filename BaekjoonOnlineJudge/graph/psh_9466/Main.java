package graph.psh_9466;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제        : https://www.acmicpc.net/problem/9466
 * 문제 종류 : 그래프 - 텀프로젝트
 * 작성자     : 박성훈
 * 작성일     : 2017-08-04
 * */
public class Main {

	static Scanner in;
	static boolean check[];
	static int answer = 0;
	static int a[];

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		int n = in.nextInt();
		check = new boolean[n + 1];
		
		for (int j = 0; j < t; j++) { //t번 실행하기 위해서
			for (int i = 1; i < n; i++) {  
				if (check[i] == false) {
					answer++;
				}
			}
			System.out.println(n - answer);
		}
	}

	public static void dfs(int x, int firstNumber) {
		if (check[x])
			return;

		check[x] = true;
	}
}
