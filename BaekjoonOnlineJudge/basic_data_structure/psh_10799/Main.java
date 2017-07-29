package psh_10799;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String bracket = in.nextLine();// 괄호
		Stack<Integer> bracketStack = new Stack<>(); //스택 사용
		int result = 0; //결과 출력
 
		int count = bracket.length(); // 문자열 길이
		
		for (int i = 0; i < count; i++) {
			if (bracket.charAt(i) == '(') { // 여는 괄호일 경우 스택에 쌓아준다 
				bracketStack.push(i); // 닫는 괄호와 여는 괄호사이의 간격을 알기위해 i의 값을 넣어준다
			} else { //닫는 괄호일 경우
				int pop = bracketStack.pop(); //pop
				if (i - pop == 1) { // 차이가 1일경우는 (,)가 바로 인접해 있는경우
					result += bracketStack.size();
				} else if (i - pop > 1) { //그렇지 않은경우에는 하나를 추가해준다
					result += 1;
				}
			}
		}
 
		System.out.println(result);
	}
}
