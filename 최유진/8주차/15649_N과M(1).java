import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
	static int[] arr;
	static boolean[] visited;
	static int[] result;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		visited = new boolean[N];
		result = new int[M];
		
		for(int i = 1; i <= N; i++) {
			arr[i-1] = i;
		} //arr에 1, 2, 3, 4 넣어주기.
		
		perm(0);

	}
	
	public static void perm(int idx) {
		
		if(idx == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i])
				continue;
			
			result[idx] = arr[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] = false;
		}
		
		
		
	}

}
