package psh_9466;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����        : https://www.acmicpc.net/problem/9466
 * ���� ���� : �׷��� - ��������Ʈ
 * �ۼ���     : �ڼ���
 * �ۼ���     : 2017-08-04
 * */
public class Main {

	static Scanner in;
	static int a[]; // �л� ��ȣ�� ����
	static int d[]; // �湮 ����
	static int s[]; // ���� ����Ŭ���� ���ϱ� ���ؼ�

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		a = new int[100001];
		d = new int[100001];
		s = new int[100001];
	  	 
		for (int j=0; j<t; j++) { //�׽�Ʈ ���̽���ŭ ����
			int n = in.nextInt();
	        for (int i=1; i<=n; i++) {
	        	a[i] = in.nextInt(); //���õ� �л����� ��ȣ ����
	            d[i] = 0; 
	            s[i] = 0;
	        }
	    	int ans=0; // ���̽����� ������ֱ� ������ 1���� ���̽� ���� �Ŀ� �ʱ�ȭ
	    	for (int i=1; i<=n; i++) { //��� ������ �ϳ��� ������ ������ֱ⿡ n�� �ݺ�
	            if (d[i] == 0) { //�湮������ ���� ��� ���� ���� Ž��
	                ans += dfs(i, 1, i); 
	            }
	        }
			System.out.println(n - ans); //��ü �л��� - ���� �̷� �л���
		}
	}

	public static int dfs(int x, int cnt, int step) { //Ž�� ����, Ž�� Ƚ��, ����Ŭ �Ǻ�
	    if (d[x] != 0) { //�湮������ ������
	        if (step != s[x]) { //���� ����Ŭ�� �ƴѰ�� -> �̹� �ٸ� ����Ŭ���� �湮�� �ߴٴ� ��
	            return 0;
	        }
	        return cnt-d[x]; //������ ��� ���� �����ϱ⶧���� ex) 1-> 3-> 3
	    }
	    d[x] = cnt;
	    s[x] = step;
	    return dfs(a[x], cnt+1, step);
	}
	
	/**
	 * ���� �帧 -> ó�� dfs ȣ���ϴ� �κ� ���� ���ø�˴ϴ�.
	 * 1�� �����̱� ������ dfs(1, 1, 1)ȣ��
	 * d[1] = 1  
	 * s[1] = 1
	 * 
	 * dfs(3, 2, 1) ȣ��  a[1] = 3�̱⋚����
	 * d[3] = 2;
	 * s[3] = 1;
	 * 
	 * dfs(3, 3, 1) ȣ�� a[3] = 3�̱⶧����
	 * d[3] = 2 �̱⿡ d[x] != 0 ������ �����Ѵ�
	 * s[3] = 1�̱⿡ step != s[x] ������ �������� �ʴ´�
	 * 
	 * d[3] = 2�̱⶧���� return 3 - 2; 
	 * 1�� �����Ѵ� -> a[3] �л��� ���� �̷�� ��츦 ��ȯ�� ���̴� 
	 * 
	 * �̷������� ����Ŭ�� ã���� ���� �˴ϴ�.
  	 * */
}
