package psh_9613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		for (int i=0; i<testCase; i++) {
			int count = in.nextInt();
			int a[] = new int[count];
			for (int j=0; j<count; j++) {
				a[j] = in.nextInt();
			}
			
		}
	}
	
//	public int gcm(int v1, int v2) {
//		if (v2 == 0)
//			return v1;
//		else {
//			v1 = v2;
//		}
//	}
}
