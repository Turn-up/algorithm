package psh_1406;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	
	final static String L = "L"; //커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
	final static String D = "D"; //커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
	final static String B = "B"; //커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
	final static String P = "P";
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer baseString = new StringBuffer(); // 입력 받을 처음 문자열
		baseString.append(in.nextLine());
		int n = in.nextInt(); // n번의 명려을 수행
		String orderValue; //명령의 종류
		
		Stack<Character> leftStack = new Stack<>(); //커서 왼쪽 스택
		Stack<Character> rightStack = new Stack<>(); //커서 오른쪽 스택
			
		int baseCount = baseString.length();
 
		for (int j = 0; j < baseCount; j++) {
			leftStack.push(baseString.charAt(j)); //왼쪽스택에 입력 받은 문자열 push
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
 