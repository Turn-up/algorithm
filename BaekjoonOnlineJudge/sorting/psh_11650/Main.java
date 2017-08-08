package psh_11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
 * 문제        : https://www.acmicpc.net/problem/11650
 * 문제 종류  : 좌표정렬하기 - 정렬
 * 작성자     : 박성훈
 * 작성일     : 2017-08-08
 * */
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Coordinate [] coordinate = new Coordinate[n];
		
		for (int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			coordinate[i] = new Coordinate(x, y);
		}
		
		Arrays.sort(coordinate, new ComparatorMyCoordinateSort());
		for (int i=0; i<n; i++) {
			System.out.println(coordinate[i].x + " " + coordinate[i].y);
		}
	}
	static class Coordinate{
		int x;
		int y;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static class ComparatorMyCoordinateSort implements Comparator<Coordinate> {
		@Override
		public int compare(Coordinate o1, Coordinate o2) {
			if (o1.x > o2.x) {
				return 1;
			} else if (o1.x == o2.x) {
				if (o1.y > o2.y) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		}
	}
}