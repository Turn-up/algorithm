package psh_1463;

import java.util.Scanner;

/**
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�. X�� 3���� ������ ��������, 3���� ������. X�� 2�� ������ ��������,
 * 2�� ������. 1�� ����.���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ����
 * �ּҰ��� ����Ͻÿ�.
 * 
 * ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� �ڿ��� N�� �־�����.
 * 
 * ù° �ٿ� ������ �ϴ� Ƚ���� �ּҰ��� ����Ѵ�.
 */
public class Main {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		String n = in.next();
		int count = n.length();
		int d = 0;
		int result = 0;
		
		for (int i = 0; i < count; i++) {
			d = n.charAt(i);
			if (count == 1) {
				result++;
				continue;
			}
			
			if (d <= '6' && n.charAt(i - 1) <= '2') {
				result++;
			} 
			result++;
		}
		
		System.out.println(result%1000000);
	}
}
