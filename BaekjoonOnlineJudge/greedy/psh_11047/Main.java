package psh_11047;

import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/11047
 * 문제 종류  : 동전0 - greedy
 * 작성자     : 박성훈
 * 작성일     : 2017-08-26
 * */
public class Main {

	/*
	 * 배수 조건이 없으면 아닐수도 있다는게 중요한 문제
	 * ex ) 거슬러줄 돈 12원
	 * 화폐 단위 
	 * 1, 4, 5
	 * 무작정 줄 수 있는 큰 돈부터 주면 5 5 1 1이 되는데
	 * 4로 4 4 4 = 12원을 주는게 더 적은 값이된다. 
	 * */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 화페 종류 개수
		int k = in.nextInt(); //줄 돈
		int money_kinds[] = new int[n]; //화폐 종류
		int answer = 0;
		for (int i=0; i<n; i++) {
			money_kinds[i] = in.nextInt();
		}
		while(k > 0) {
			if(k>=money_kinds[n-1]) {
				k -= money_kinds[n-1];
				answer++;
			} else {
				n--;
			}
		}
		System.out.println(answer);
	}
}
