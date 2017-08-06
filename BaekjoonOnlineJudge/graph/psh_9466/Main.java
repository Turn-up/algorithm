package psh_9466;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제        : https://www.acmicpc.net/problem/9466
 * 문제 종류 : 그래프 - 텀프로젝트
 * 작성자     : 박성훈
 * 작성일     : 2017-08-04
 * */
public class Main {

	static Scanner in;
	static int a[]; // 학생 번호를 저장
	static int d[]; // 방문 정보
	static int s[]; // 같은 사이클인지 비교하기 위해서

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		a = new int[100001];
		d = new int[100001];
		s = new int[100001];
	  	 
		for (int j=0; j<t; j++) { //테스트 케이스만큼 실행
			int n = in.nextInt();
	        for (int i=1; i<=n; i++) {
	        	a[i] = in.nextInt(); //선택된 학생들의 번호 저장
	            d[i] = 0; 
	            s[i] = 0;
	        }
	    	int ans=0; // 케이스마다 출력해주기 때문에 1번의 케이스 실행 후에 초기화
	    	for (int i=1; i<=n; i++) { //모든 정점이 하나의 정점과 연결되있기에 n번 반복
	            if (d[i] == 0) { //방문한적이 없는 경우 다음 정점 탐색
	                ans += dfs(i, 1, i); 
	            }
	        }
			System.out.println(n - ans); //전체 학생수 - 팀을 이룬 학생수
		}
	}

	public static int dfs(int x, int cnt, int step) { //탐색 정점, 탐색 횟수, 사이클 판별
	    if (d[x] != 0) { //방문한적이 있을때
	        if (step != s[x]) { //같은 사이클이 아닌경우 -> 이미 다른 사이클에서 방문을 했다는 뜻
	            return 0;
	        }
	        return cnt-d[x]; //루프의 경우 값을 뺴야하기때문에 ex) 1-> 3-> 3
	    }
	    d[x] = cnt;
	    s[x] = step;
	    return dfs(a[x], cnt+1, step);
	}
	
	/**
	 * 실행 흐름 -> 처음 dfs 호출하는 부분 부터 보시면됩니다.
	 * 1이 시작이기 때문에 dfs(1, 1, 1)호출
	 * d[1] = 1  
	 * s[1] = 1
	 * 
	 * dfs(3, 2, 1) 호출  a[1] = 3이기떄문에
	 * d[3] = 2;
	 * s[3] = 1;
	 * 
	 * dfs(3, 3, 1) 호출 a[3] = 3이기때문에
	 * d[3] = 2 이기에 d[x] != 0 조건을 만족한다
	 * s[3] = 1이기에 step != s[x] 조건을 만족하지 않는다
	 * 
	 * d[3] = 2이기때문에 return 3 - 2; 
	 * 1을 리턴한다 -> a[3] 학생만 팀을 이루는 경우를 반환한 것이다 
	 * 
	 * 이런식으로 사이클을 찾으면 답이 됩니다.
  	 * */
}
