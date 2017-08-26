package psh_1699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제        : https://www.acmicpc.net/problem/1699
 * 문제 종류  : 제곱수의 합
 * 작성자     : 박성훈
 * 작성일     : 2017-08-15
 * */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		dp[1] = 1;
		for (int i=2; i<=N; i++) {
			dp[i] = dp[i-1] + 1;
			for (int j=1; j<=i/2; j++) {
				if (j*j == i){
					dp[i] = 1;
					break;
				}
				if (dp[i] > (dp[i-j] + dp[j])){
					dp[i] = (dp[i-j] + dp[j]);
				}
			}
		}
		
		System.out.println(dp[N]);
	}
}
