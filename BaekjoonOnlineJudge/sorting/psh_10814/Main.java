package psh_10814;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 문제        : https://www.acmicpc.net/problem/10814
 * 문제 종류 : 나이순 정렬
 * 작성자     : 박성훈
 * 작성일     : 2017-08-07
 * */
public class Main {

	private static int size;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		TreeSet<MemberInfo> memberInfoTS = new TreeSet<>();
		
		for (int i = 0; i < size; i++) {
			memberInfoTS.add(new MemberInfo(in.nextInt(),i, in.next()));
		}

		for (MemberInfo i : memberInfoTS)
			System.out.println(i.age + " " + i.name);

	}

	static class MemberInfo implements Comparable<MemberInfo>{
		int age = 0;
		int number = 0;
		String name = "";
	
		public MemberInfo(int age, int number, String name) {
			this.age = age;
			this.number = number;
			this.name = name;
		}
		
		@Override
		public int compareTo(MemberInfo m) {
			if (age > m.age) return 1;
			else if (age == m.age) {
				if (number > m.number)
					return 1;
				else
					return -1;
			}
			else 
				return -1;
		}
		
	}
}
