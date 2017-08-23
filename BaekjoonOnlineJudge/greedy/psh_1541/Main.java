package psh_1541;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * 문제       : https://www.acmicpc.net/problem/1541
 * 문제 종류  : 잃어버린 괄호 - 그리디 알고리즘
 * 작성자     : 박성훈
 * 작성일     : 2017-08-23
 * */
public class Main {

	private static Queue<String> stackOperator, stackString;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		stackOperator = new LinkedList<>();
		stackString = new LinkedList<>();

		String inputValue = in.next();
		int j = 0;
		for (int i = 0; i < inputValue.length(); i++) {
			char temp = inputValue.charAt(i);
			if (temp == '+' || temp == '-') {
				stackString.offer(inputValue.substring(j, i));
				stackOperator.offer(inputValue.substring(i, i + 1));
				j = i + 1;
			}
		}
		stackString.offer(inputValue.substring(j)); // 마지막 값을 담기 위해서
		int result = Integer.parseInt(stackString.poll());
		while (!stackOperator.isEmpty()) {
			if (stackOperator.peek().equals("-")) {
				do {
					stackOperator.remove();
					result -= Integer.parseInt(stackString.poll());
				}while(!stackOperator.isEmpty() && !stackOperator.peek().equals("-"));
			}  else {
				stackOperator.remove();
				result += Integer.parseInt(stackString.poll());				
			}
		}
		System.out.println(result);
	}
}
