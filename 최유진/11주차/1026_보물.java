import java.util.Arrays;
import java.util.Scanner;

public class bj_1026 {
	static int N, ans;
	static int[] A, B, newA;
	static boolean[] visited;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		B = new int[N];
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);

		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += A[i] * B[N-i-1]; //A의 가장 큰 것 - B의 가장 작은 것을 순서대로 곱해야 가장 작은 수가 나온다. 
		}

		System.out.println(sum);

	}


}
