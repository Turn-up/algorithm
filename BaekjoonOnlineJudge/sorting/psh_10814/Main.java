package psh_10814;

import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/10814
 * ���� ���� : ���̼� ����
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-07
 * */
public class Main {
	
	private static int size;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		MemberInfo[] memberInfo = new MemberInfo[size];

		for (int i=0; i<size; i++) {
			memberInfo[i].number = i;
			memberInfo[i].age = in.nextInt();
			memberInfo[i].name = in.next();
		}
	}
	 
	class MemberInfo{
		int age;
		int number;
		String name;
	}
}


