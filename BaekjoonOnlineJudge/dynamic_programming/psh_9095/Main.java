package psh_9095;

import java.util.Scanner;

/**
 *  ���� 4�� 1, 2, 3�� �������� ��Ÿ���� ����� �� 7������ �ִ�.
 *  1+1+1+1 ,1+1+2 ,1+2+1, 2+1+1, 2+2, 1+3, 3+1
 *  ���� n�� �־����� ��, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 *  ù�� �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 *  �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.
 *  
 *  �� �׽�Ʈ ���̽�����, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 * */
public class Main {
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt(); // �׽�Ʈ ���̽�

		int[] d = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for (int i = 4; i < 12; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		for (int i = 0; i < t; i++) {
			System.out.println(d[in.nextInt()]);
		}
	}
}
