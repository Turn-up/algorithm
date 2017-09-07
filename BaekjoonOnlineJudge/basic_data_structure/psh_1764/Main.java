package psh_1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * ����       : https://www.acmicpc.net/problem/1764
 * ���� ����  : �躸�� - �ڷᱸ��
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-09-07
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		ArrayList<String> noPerson = new ArrayList<>();
		
		Set<String> hashSet = new HashSet<>(); 
		
		for (int i=0; i<N+M; i++) {
			String value = in.next();
			if(!hashSet.add(value)) {
				noPerson.add(value);
			}
		}
		System.out.println(noPerson.size());
		Collections.sort(noPerson);
		for (String temp : noPerson) {
			System.out.println(temp);
		}
	}
}
