package psh_1260;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/1260
 * ���� ���� : �׷��� DFS, BFS ����
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-04
 * */
public class Main {
	static ArrayList<ArrayList<Integer>> a;
	static boolean check[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); //����
		int m = in.nextInt(); //����
		int v = in.nextInt(); //���� ����
		check = new boolean[m+1];
		a = new ArrayList<>();
		for (int i = 0; i < m; i++){
			a.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			a.get(in.nextInt()).add(in.nextInt());
		}
		dfs(v);
	}
	
	public static void dfs(int x) {
		check[x] = true;
		System.out.print(x + " ");
		for (int i = 0; i < a.get(x).size(); i++) {
			int y = a.get(x).get(i);			
			if (check[y] == false){
				dfs(y);
			}
		}
	}
	
	public static void bfs (int x) {
		check[x] = true;
		System.out.println(x + " ");
		for (int i = 0; i < a.get(x).size(); i++) {
			
		}
	}
}
