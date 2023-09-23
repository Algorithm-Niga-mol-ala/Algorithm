import java.util.Scanner;

public class Main {
	
	public static int N, M;
	public static int[] arr;
	public static int[] result;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		for(int i = 1; i <= N; i++) {
			arr[i-1] = i;
		}
		
		result = new int[M];
		
		combination(0, 0);

	}
	
	public static void combination(int idx, int sidx) {
		if(sidx == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println("");
			return;
		}

		
		if(idx == N) 
			return;
		
		result[sidx] = arr[idx];
		combination(idx+1, sidx+1);
		combination(idx+1, sidx);

	}

}
