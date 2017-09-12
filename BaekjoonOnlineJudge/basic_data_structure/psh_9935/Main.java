package psh_9935;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String value = in.next();
		String bombValue = in.next();
		
		//시간 초과
//		while (value.contains(bombValue)) {
//			value = value.replaceAll(bombValue, "");
//		}
//		if (value.length() == 0)
//			value = "FRULA";
//		System.out.println(value);
		
//		for (char a : bombValue.toCharArray()) {
//			bombStack.push(a);
//		}
//		for (char a : value.toCharArray()) {
//			valueStack.push(a);
//		}
		int bombLength = bombValue.length();
		for (int i=0; i < value.length()-bombValue.length(); i++) {
			while(value.substring(i, i + bombLength).equals(bombValue)) {
				value = value.replace(bombValue, "");
				i++;
			};
		}
		value = value.replace(bombValue, "");
		if (value.length() == 0)
			value = "FRULA";
		System.out.println(value);
		
	}
}
