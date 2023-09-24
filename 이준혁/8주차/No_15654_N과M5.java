import java.util.Arrays;
import java.util.Scanner;

public class No_15654_N과M5 {

	static int N;
	static int M;
	static int[] arr;
	static int[] res;
	static boolean[] visit;

	static void nm5(int idx) {
		// 기저
		if (idx == M) {
			for (int i : res) {
				System.out.print(i + " ");
			}
			System.out.println();

		} else {
			// 재귀
			for (int i = 0; i < N; i++) {
				if (!visit[i]) {
					visit[i] = true;
					res[idx] = arr[i];
					nm5(idx + 1);
					visit[i] = false;
				}
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

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		nm5(0);

	}
}
