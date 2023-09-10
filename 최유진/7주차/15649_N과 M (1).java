package algo;

import java.util.Scanner;

public class bj15649 {
	
	public static int N;
	public static int M;
	public static int[] arr;
	public static int[] result;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		result = new int[M];
		visited = new boolean[N];
	
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}

		perm(0);
		System.out.println(sb.toString());
	}
	
	public static void perm(int idx) {
		if(idx == M) {
			for(int num : result) {
				sb.append(num + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			result[idx] = arr[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] = false;
		}
	}

}
---------------------------------------
(번외)
이 방식으로 출력했더니 출력 형식이 잘못되었다면서 실패로 떴다.
방식이 잘못됐나 했더니 println에 " "로 불필요한 공백이 들어갔기 때문이었음..
  
		if(idx == M) {
			for(int num : result) {
				System.out.print(num + " ");
			}
			System.out.println(" ");
			return;
		}

