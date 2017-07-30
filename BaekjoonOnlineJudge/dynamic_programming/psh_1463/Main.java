package psh_1463;

import java.util.Scanner;

/**
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다. X가 3으로 나누어 떨어지면, 3으로 나눈다. X가 2로 나누어 떨어지면,
 * 2로 나눈다. 1을 뺀다.정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의
 * 최소값을 출력하시오.
 * 
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 자연수 N이 주어진다.
 * 
 * 첫째 줄에 연산을 하는 횟수의 최소값을 출력한다.
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
