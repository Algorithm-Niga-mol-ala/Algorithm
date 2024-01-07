//import java.util.Arrays;
import java.util.Scanner;

public class No_15649_N과M1 {
	
	static int N;
	static int M;
	static int[] arr;
	static boolean[] bol;
	
	static void nm(int idx) {
		
//		System.out.println(Arrays.toString(bol));

		//기저파트
		if (idx==M) {
			for (int i : arr) {
				System.out.print(i+" ");
			} System.out.println();
			return;
		}
		
		//재귀파트
		for (int i=0; i<N; i++) {
			if (!bol[i]) {
				bol[i] = true;
				arr[idx] = i+1;
				nm(idx+1);
				bol[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		bol = new boolean[N];
		
		nm(0);
	}
}
