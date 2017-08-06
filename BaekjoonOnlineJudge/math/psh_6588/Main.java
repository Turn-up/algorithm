package math.psh_6588;

import java.util.Scanner;
/*
 * https://www.acmicpc.net/problem/6588
 * 골드바흐의 추측 - 수학
 * 2017-08-02
 * 박성훈
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int testCase = in.nextInt();
		int primeNumber[] = new int[1000001];

		for (int i = 2; i < 1000000; i++) {
			primeNumber[i] = i;
		}

		// 소수 구하기
		for (int i = 2; i < 1000000; i++) {
			if (primeNumber[i] != 0) {
				for (int j = i + i; j < 1000000; j += i) {
					primeNumber[j] = 0;
				}
			}
		}

		while (testCase != 0) {
			boolean caseExsist = false;
			int aIndex = 0;
			int bIndex = 0;

			for (int i = 3; i <= testCase / 2; i += 2) {
				if (primeNumber[i] != 0 && primeNumber[testCase - i] != 0) {
					aIndex = i;
					bIndex = testCase - i;
					caseExsist = true;
					break;
				}
			}
			if (caseExsist)
				System.out.println(testCase + " = " + primeNumber[aIndex] + " + " + primeNumber[bIndex]);
			else
				System.out.println("Goldbach's conjecture is wrong.");
			testCase = in.nextInt();
		}
	}
}
