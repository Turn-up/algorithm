package psh_1759;

import java.util.Arrays;
import java.util.Scanner;
/*
 * ����       : https://www.acmicpc.net/problem/1759
 * ���� ����  : ��ȣ����� - ����Ž��
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-09-04
 * */
public class Main {

	public static void dfs(int totalCount, int totalPwLength, int alphaLength, int nowPwLength, String d[],
			String[] result) {
		if (nowPwLength == 0) {
			boolean collectionCheck = false;
			boolean consonantCheck1  = false;
			boolean consonantCheck2 = false;
			
			for (String temp : result) {
				char v = temp.charAt(0);
				if ('a' == v || 'e' == v || 'i' == v || 'o' == v || 'u' == v) {
					collectionCheck = true;
				}else {
					if (consonantCheck1) {
						consonantCheck2 = true;
					}
					consonantCheck1 = true;
				}
			}
			
			
			if (collectionCheck && consonantCheck2) {
				for (String temp : result) {
					System.out.print(temp);
				}
				System.out.println("");
			}
			return;
		} else {
			for (int i = alphaLength; i >= nowPwLength; i--) {
				result[totalPwLength - nowPwLength] = d[totalCount - i];
				dfs(totalCount, totalPwLength, i - 1, nowPwLength - 1, d, result);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt(); // ��ȣ ����
		int C = in.nextInt(); // ���ĺ� ����
		in.nextLine();
		String value = in.nextLine();
		String values[] = value.split(" ");
		String prints[] = new String[L];
		
		Arrays.sort(values);
		for (int i = 0; i < values.length; i++) {
			if (C - i >= L) {
				prints[0] = values[i];
				dfs(C, L, C - i - 1, L-1, values, prints);
			}
		}
	}
}
