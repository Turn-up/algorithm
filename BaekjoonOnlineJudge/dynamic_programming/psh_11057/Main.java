package psh_11057;

import java.util.Scanner;

/** 
 * ����
 * ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �� ��, ������ ���� ���Ƶ� ������������ ģ��.
 * ���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.
 * ���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
 * 
 * �Է�
 * ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
 * 
 * ���
 * ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.*/
public class Main {
	private static Scanner in;
	private final static int mod = 10007;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		
		long d[][] = new long[1001][10];
		
 		for (int i = 2; i < 1001; i++) {
 			for (int j = 0; j < 10; j++) {
 				d[1][j] = 1;
 				for (int k = 0; k <= j; k++) {
 	 				d[i][j] += d[i-1][k]; 
 	 				d[i][j] %= mod;
 				}
 			}
 		}
 		long result = 0;
 		for (int i = 0; i < 10; i++) {
 			result += d[n][i];
 		}
 		System.out.println(result % mod);
	}
}
