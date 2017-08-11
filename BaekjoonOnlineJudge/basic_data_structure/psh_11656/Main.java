package psh_11656;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 문제       : https://www.acmicpc.net/problem/11656
 * 문제 종류  : 접미사 배열 - 자료구조
 * 작성자     : 박성훈
 * 작성일     : 2017-08-11
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String value = in.next();
		ArrayList<String> values = new ArrayList<>();
		int cnt = value.length();

		for (int i=0; i<cnt; i++) {
			values.add(value.substring(i));
		}

		values.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int cnt = o1.length() > o2.length()? o2.length(): o1.length();
				for (int i=0; i<cnt; i++) {
					if (o1.charAt(i) > o2.charAt(i))
						return 1;
					else if (o1.charAt(i) < o2.charAt(i))
						return -1;
					else
						continue;
				}
				if (o1.length() == cnt) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		for (String i : values) {
			System.out.println(i);
		}
	}
}
