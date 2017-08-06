package graph.psh_9466;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/9466
 * ���� ���� : �׷��� - ��������Ʈ
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-04
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
		
		for (int j = 0; j < t; j++) { //t�� �����ϱ� ���ؼ�
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
