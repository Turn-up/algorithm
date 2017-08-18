package psh_2609;
/*
 * 문제       : https://www.acmicpc.net/problem/2609
 * 문제 종류  : 최대공약수 최소공배수 - math
 * 작성자     : 박성훈
 * 작성일     : 2017-08-16
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		int saveValue1 = v1;
		int saveValue2 = v2;
		
		while (v2 > 0) {
			int temp = v1;
			v1 = v2;
			v2 = temp % v2;
		}
		System.out.println(v1);
		System.out.println(saveValue1 * saveValue2 / v1);
	}
}
