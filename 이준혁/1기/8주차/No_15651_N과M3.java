import java.util.Scanner;

public class No_15651_N과M3 {
	// 스캐너로 풀면 시간초과 발생
	// 출력이 너무 긴가 싶으니 StringBuilder부터 
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int M;
	static int arr[];

	
	static void nm3(int idx) {
		// 기저
		if (idx == M) {
			for ( int i : arr ) {
				sb.append(i).append(" ");
			} sb.append("\n");
			return;
		}
		
		// 재귀
		for (int i=0; i<N; i++) {
			arr[idx] = i+1;
			nm3(idx+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		nm3(0);
		System.out.println(sb);
	}
}
