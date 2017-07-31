package psh_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ��� ������ dp
 * 
 * https://www.acmicpc.net/problem/2579
 * 
 * */
public class Main {

	private static BufferedReader br;
	private static int size;
	private static int n[];
	private static long d[][];
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine()); //������
		n = new int[size+1]; //��� �� ����
		d = new long[size+1][3]; // dp ��� ����

		/*��ܰ� �ʱ�ȭ ����*/
		for (int i = 1; i <= size; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		/*����� ���� �ּ� ����*/
		d[1][1] = n[1];
		d[1][2] = n[1];

		d[2][1] = n[2];
		d[2][2] = d[1][1] + n[2];
		
		for (int i = 3; i <= size; i++) { //������ ���
			for (int j = 2; j > 0; j--) { //���° ���� ������
				if ( j == 2)
					d[i][2] = longValueCompare(d[i-1][1], d[i-2][2])+ n[i]; //2��°�� ������ ��
				else 
					d[i][1] = d[i-2][2]+ n[i]; //1��°�� ������ ��
			}
		}
		
		System.out.println(longValueCompare(d[size][1], d[size][2]));
		
	}
	/*�� ���*/
	public static long longValueCompare (long value1, long value2) {
		return value1 > value2 ? value1: value2;
	}
}
