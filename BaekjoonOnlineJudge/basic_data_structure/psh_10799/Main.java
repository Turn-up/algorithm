package psh_10799;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String bracket = in.nextLine();// ��ȣ
		Stack<Integer> bracketStack = new Stack<>(); //���� ���
		int result = 0; //��� ���
 
		int count = bracket.length(); // ���ڿ� ����
		
		for (int i = 0; i < count; i++) {
			if (bracket.charAt(i) == '(') { // ���� ��ȣ�� ��� ���ÿ� �׾��ش� 
				bracketStack.push(i); // �ݴ� ��ȣ�� ���� ��ȣ������ ������ �˱����� i�� ���� �־��ش�
			} else { //�ݴ� ��ȣ�� ���
				int pop = bracketStack.pop(); //pop
				if (i - pop == 1) { // ���̰� 1�ϰ��� (,)�� �ٷ� ������ �ִ°��
					result += bracketStack.size();
				} else if (i - pop > 1) { //�׷��� ������쿡�� �ϳ��� �߰����ش�
					result += 1;
				}
			}
		}
 
		System.out.println(result);
	}
}
