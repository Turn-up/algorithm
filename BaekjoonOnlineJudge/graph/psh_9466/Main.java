package psh_9466;

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
	static 	ArrayList<ArrayList<Integer>> a;
	static int cnt = 0;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		a = inputStudentArray(in.nextInt());;
		dfs(a.get(0).get(0));
		System.out.println( cnt);
	}
	
	/**
	 * 학생수에 따른 해당 번호를 입력
	 * @param int n (학생수) 
	 * */
	public static ArrayList<ArrayList<Integer>> inputStudentArray(int n){
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	
		for (int i = 0; i < n; i++) {
			a.add(new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
			a.get(i).add(in.nextInt());
		}
		return a;
	}
	
	public static void dfs(int x) {
		check[x] = true;		
		for (int i = 0; i < x; i++) {
			int y = a.get(x).get(i);
			if (check[y] == false) {
				dfs(y);
			}else 
				cnt++;
		}
	}
}
