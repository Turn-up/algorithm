package psh_1260;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제        : https://www.acmicpc.net/problem/1260
 * 문제 종류 : 그래프 DFS, BFS 구현
 * 작성자     : 박성훈
 * 작성일     : 2017-08-04
 * */
public class Main {
	static ArrayList<ArrayList<Integer>> a;
	static boolean check[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); //정점
		int m = in.nextInt(); //간선
		int v = in.nextInt(); //시작 정점
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
