package psh_10820;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			String inputValue = in.nextLine();
			char[] stringToChar = inputValue.toCharArray();
			int count = inputValue.length();
			int smallAlpha = 0, largeAlpha = 0, number = 0, empty = 0;
			
			for (int i = 0; i < count; i++) {
				if (stringToChar[i] >= 'A' && stringToChar[i] <='Z')
					largeAlpha++;
				else if (stringToChar[i] >= 'a' && stringToChar[i] <='z')
					smallAlpha++;
				else if (stringToChar[i] >= '0' && stringToChar[i] <='9')
					number++;
				else if (stringToChar[i] == ' ')
					empty++;
			}
			System.out.println(smallAlpha+" "+largeAlpha+" "+number+" "+empty);
		}
	}
}
