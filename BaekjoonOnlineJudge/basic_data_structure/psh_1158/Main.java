package psh_1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for (int j = 1; j <= n; j++){
			queue.offer(j);
		}
		System.out.print("<");
		for (int i = 0; i < n-1 ; i++){
			for (int k = 0; k < m-1; k++) {
				queue.offer(queue.poll());
			}
			System.out.print(queue.poll() + ", ");
		}
		System.out.print(queue.poll() +">");
	}

}
