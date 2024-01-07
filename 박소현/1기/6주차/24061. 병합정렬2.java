import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main24061_병합정렬2 {
	static int left, right, idx;
	static int L, R;
	static int[] arr, sarr;
	static int cnt = 0;
	static int K;

	public static void MergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			MergeSort(arr, left, mid);
			MergeSort(arr, mid + 1, right);
			Merge(arr, left, mid, right);
		}
	} // mergesort

	public static void Merge(int[] arr, int left, int mid, int right) {
		L = left;
		R = mid + 1;
		idx = left;

		while (L <= mid && R <= right) {
			if (cnt == K) // K번째 정렬한 수열을 출력해야 하므로. 반복문 안에 넣어줘야 반복문을 뚫고 나올 수 있음!!!!!!!
				break;
			if (arr[L] >= arr[R])
				sarr[idx++] = arr[R++];
			else
				sarr[idx++] = arr[L++];
			cnt++;
//			System.out.println(cnt + "!" + Arrays.toString(sarr));
		}

		if (L <= mid) {
			for (int i = L; i <= mid; i++) {
				if (cnt == K) // K번째 정렬한 수열을 출력해야 하므로. 반복문 안에 넣어줘야 반복문을 뚫고 나올 수 있음!!!!!!!
				break;
					break;
				sarr[idx++] = arr[i];
				cnt++;
//				System.out.println(cnt + "@" + Arrays.toString(sarr));
			}
		} else if (R <= right) {
			for (int i = R; i <= right; i++) {
				if (cnt == K) // K번째 정렬한 수열을 출력해야 하므로. 반복문 안에 넣어줘야 반복문을 뚫고 나올 수 있음!!!!!!!
				break;
					break;
				sarr[idx++] = arr[i];
				cnt++;
//				System.out.println(cnt + "#" + Arrays.toString(sarr));
			}
		}
		for (int i = left; i <= right; i++) {
			arr[i] = sarr[i];
		}
	} // merge

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N];
		sarr = new int[N];

		String[] str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
			sarr[i] = Integer.parseInt(str[i]); // 이렇게 해야 정렬되는 과정이 다 보임. 안 그러면 정렬되고 있는 숫자 외에는 초기화값인 0으로 보임
		}

		MergeSort(arr, 0, arr.length - 1);

		if (cnt == K) {
			for (int i = 0; i < N; i++) {
				sb.append(arr[i]);
				if (i != N - 1)
					sb.append(" ");
			}
		} else if (cnt < K)
			sb.append(-1);

		bw.write(sb.toString());

		br.close();
		bw.close();
	}// main
}
