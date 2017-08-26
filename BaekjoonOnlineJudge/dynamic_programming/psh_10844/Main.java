package psh_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제        : https://www.acmicpc.net/problem/10844
 * 문제 종류  : 쉬운 계단 수 - dp
 * 작성자     : 박성훈
 * 작성일     : 2017-08-15
 * */
public class Main {
	public static final int MOD = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long dp[][] = new long [n+1][10];
		
		for (int i=1; i<=9; i++){
			dp[1][i] = 1;
		}
		
		for (int i=2; i<=n; i++){
			dp[i][0] = dp[i-1][1] % MOD;
			for (int j=1; j<=8; j++) {
				dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % MOD;
			}
			dp[i][9] = dp[i-1][8]% MOD ;
		}
		long ans = 0;
		for (long i : dp[n]){
			ans = (ans + i)  % MOD;
		}
		System.out.println(ans);
	}
}
