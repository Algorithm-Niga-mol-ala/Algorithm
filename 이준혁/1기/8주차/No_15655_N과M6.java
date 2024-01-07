import java.util.Arrays;
import java.util.Scanner;

public class No_15655_N과M6 {
	
	static int N, M;
	static int[] arr;
	static int[] res;
	static boolean[] visit;
	
	static void nm6(int idx, int st) {
		// 기저
		if (idx == M) {
			for (int i : res) {
				System.out.print(i+" ");
			} System.out.println();
			return;
		}
		
		// 재귀
		for (int i=st; i<N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				res[idx] = arr[i];
				nm6(idx+1, i);
				visit[i] = false;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		res = new int[M];
		visit = new boolean[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		nm6(0, 0);
	}
}
