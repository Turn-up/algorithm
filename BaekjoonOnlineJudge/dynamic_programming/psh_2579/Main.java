package psh_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 계단 오르기 dp
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
		size = Integer.parseInt(br.readLine()); //사이즈
		n = new int[size+1]; //계단 값 저장
		d = new long[size+1][3]; // dp 계산 저장

		/*계단값 초기화 진행*/
		for (int i = 1; i <= size; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		/*계산을 위한 최소 정의*/
		d[1][1] = n[1];
		d[1][2] = n[1];

		d[2][1] = n[2];
		d[2][2] = d[1][1] + n[2];
		
		for (int i = 3; i <= size; i++) { //각각의 계단
			for (int j = 2; j > 0; j--) { //몇번째 밟은 것인지
				if ( j == 2)
					d[i][2] = longValueCompare(d[i-1][1], d[i-2][2])+ n[i]; //2번째에 밟혔을 때
				else 
					d[i][1] = d[i-2][2]+ n[i]; //1번째로 밟혔을 때
			}
		}
		
		System.out.println(longValueCompare(d[size][1], d[size][2]));
		
	}
	/*비교 출력*/
	public static long longValueCompare (long value1, long value2) {
		return value1 > value2 ? value1: value2;
	}
}
