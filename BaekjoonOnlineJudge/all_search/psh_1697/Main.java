package psh_1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/1697
 * 문제 종류  : 숨바꼭질
 * 작성자     : 박성훈
 * 작성일     : 2017-09-05
 * */
public class Main {
	
	public static int checkDistance(int start, int k, Queue<Integer> q, boolean check[]) {
		q.add(start);
		check[start] = true;
		int result = 0;
		boolean flag = false;
		while (!q.isEmpty()) {
			int x =q.peek();
			int size = q.size();
			for (int i=0; i<size; i++) {
				x = q.remove();
				if (x-1 > 0 && check[x-1] == false) {
					q.add(x - 1);
					check[x - 1] = true;
				}
				if (x+1 < check.length && check[x+1] == false) {
					q.add(x + 1);
					check[x + 1] = true;
				}
				if (x*2< check.length && check[x*2] == false ) {	
					q.add(x * 2);
					check[x * 2] = true;
				}
				if (x == k) {
					flag = true;
				}
			}
			if (flag) {
				break;
			}
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		boolean check[] = new boolean[200001];
		int x = in.nextInt();
		int k = in.nextInt();
		System.out.println(checkDistance(x, k, q, check));
	}
}
