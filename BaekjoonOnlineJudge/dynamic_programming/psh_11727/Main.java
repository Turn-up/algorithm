package psh_11727;

import java.util.Scanner;
/**
 * 2��n ���簢���� 2��1�� 2��2 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 * 
 * ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 2 x N
		
		int d[] = new int[n+2];
		d[1] = 1;
		d[2] = 3;

		for (int i = 3; i <= n; i++) {
			d[i] = (d[i-1] + 2*d[i-2]) % 10007;
		}
		
		System.out.println(d[n]);
	}
}
