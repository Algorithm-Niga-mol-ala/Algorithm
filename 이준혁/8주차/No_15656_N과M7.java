import java.util.Arrays;
import java.util.Scanner;

public class No_15656_N과M7 {
	
	static int N, M;
	static int[] arr;
	static int[] res;
	
	static void nm7(int idx) {
		// 기저
		if ( idx == M ) {
			for ( int i : res ) {
				System.out.print(i+" ");
			} System.out.println();
			return;
		}
		
		// 재귀
		for (int i=0; i<N; i++) {
			res[idx] = arr[i];
			nm7(idx+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		res = new int[M];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		nm7(0);
		
	}
}
