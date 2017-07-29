package psh_1406;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	
	final static String L = "L"; //Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
	final static String D = "D"; //Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
	final static String B = "B"; //Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
	final static String P = "P";
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer baseString = new StringBuffer(); // �Է� ���� ó�� ���ڿ�
		baseString.append(in.nextLine());
		int n = in.nextInt(); // n���� ����� ����
		String orderValue; //����� ����
		
		Stack<Character> leftStack = new Stack<>(); //Ŀ�� ���� ����
		Stack<Character> rightStack = new Stack<>(); //Ŀ�� ������ ����
			
		int baseCount = baseString.length();
 
		for (int j = 0; j < baseCount; j++) {
			leftStack.push(baseString.charAt(j)); //���ʽ��ÿ� �Է� ���� ���ڿ� push
		}
		
		for (int i = 0; i < n; i++) {
			orderValue = in.next();
			if (orderValue.equals(L)){
				if (!leftStack.isEmpty()) 
					rightStack.push(leftStack.pop());
			} else if (orderValue.equals(D)) {
				if (!rightStack.isEmpty())
					leftStack.push(rightStack.pop());
			} else if (orderValue.equals(B)){
				if (!leftStack.isEmpty())
					leftStack.pop();
			} else if (orderValue.equals(P)){
				String inputValue = in.next();
				leftStack.push(inputValue.charAt(0));
			}
		}
		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		while (!rightStack.isEmpty()) {
			System.out.print(rightStack.pop());
		}
	}
}
 