package psh_11047;

import java.util.Scanner;

/*
 * ����       : https://www.acmicpc.net/problem/11047
 * ���� ����  : ����0 - greedy
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-26
 * */
public class Main {

	/*
	 * ��� ������ ������ �ƴҼ��� �ִٴ°� �߿��� ����
	 * ex ) �Ž����� �� 12��
	 * ȭ�� ���� 
	 * 1, 4, 5
	 * ������ �� �� �ִ� ū ������ �ָ� 5 5 1 1�� �Ǵµ�
	 * 4�� 4 4 4 = 12���� �ִ°� �� ���� ���̵ȴ�. 
	 * */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // ȭ�� ���� ����
		int k = in.nextInt(); //�� ��
		int money_kinds[] = new int[n]; //ȭ�� ����
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
