package psh_9613;

import java.util.Scanner;

public class Main {
	
	public static int gcm(int v1, int v2) {
		if (v2 == 0)
			return v1;
		else {
			return gcm(v2,v1%v2);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();

		for (int i = 0; i < testCase; i++) {
			int count = in.nextInt();
			int a[] = new int[count];
			int result = 0;
			for (int j = 0; j < count; j++) {
				a[j] = in.nextInt();
			}
			for (int n = 0; n < count; n++) {
				for (int k = n + 1; k < count; k++) {
					result += gcm(a[n], a[k]);
				}
			}
			System.out.println(result);
		}
	}
}
