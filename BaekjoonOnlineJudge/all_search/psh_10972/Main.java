package psh_10972;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void permutationRoof(int a[]) {
	
		int x = 0; // 최대값
		int y = 0; // 최대값
		for (int i=2; i<a.length; i++) {
			if (a[i] > a[i-1] && x < i) {
				x = i;
			}
		}
		if (x == 0) {
            System.out.println(-1);
			return;
		}
		for (int i = x; i <a.length; i++) {
			if (a[x-1] < a[i] && y < i) {
				y = i;
			}
		}
		int temp = a[y];
		a[y] = a[x-1];
		a[x-1] = temp;
		
		Arrays.sort(a, x, a.length);
        for (int i=1; i<a.length ; i++ ) {
			System.out.print(a[i] +" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			a[i] = in.nextInt();
		}
		permutationRoof(a);
	}
}
