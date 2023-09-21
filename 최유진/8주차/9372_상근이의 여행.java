package algo;

import java.util.Scanner;

public class bj9372 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
			}
			//최소신장트리의 성질을 이용하면 N개의 노드를 모두 거치려면 N-1개의 간선이 필요합니다.
      //모든 나라가 어떻게든 연결이 되어 있고, 중복 방문이 가능하니 바로 N-1개를 출력해주면 됩니다. 
			System.out.println(N-1);
			
		}

	}

}
