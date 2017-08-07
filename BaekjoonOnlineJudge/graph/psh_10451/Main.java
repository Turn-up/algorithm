package psh_10451;

import java.util.Scanner;
/*
 * 문제        : https://www.acmicpc.net/problem/10451
 * 문제 종류  : 순열 사이클 -그래프
 * 작성자     : 박성훈
 * 작성일     : 2017-
 * */
public class Main {

	static boolean check[];
	static int[] a;
	static int ans;
	
	public static void dfs(int x) {
		check[x] = true;
		int y = a[x];
		if (check[y]== false) {
			dfs(y);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		for (int i=0; i < size; i++) {
			int n = in.nextInt();
			check = new boolean[n+1];
			a = new int[n+1];
			ans = 0;
			for (int j=1; j <= n; j++) {
				a[j] = in.nextInt();
				check[j] = false;
			}
			
			for (int k=1; k <= n; k++) {
				if(check[k] == false) {
					dfs(k);
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
