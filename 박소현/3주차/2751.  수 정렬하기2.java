import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 그냥 sysout하면 시간초과 뜸
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; // 입력받은 수들 넣어줄 배열 생성

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		} // 입력받기 & 입력받은 수들 배열에 넣어줌

		// 선택정렬 -> 시간초과^^

		// 카운팅정렬
		// 1. 최댓값 구하기
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		// 2. 개수 카운팅
		int[] cnt = new int[2000001]; // 절댓값 1000000의 수들을 담는 배열 생성
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				cnt[1000000 - Math.abs(arr[i])]++;
			} else
				cnt[arr[i] + 1000000]++;
		}

		// 3. 누적합 구하기
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}

		// 4. 원본배열 뒤에서부터 순회하여 정렬된 배열에 저장
		int[] sort = new int[N]; // 정렬된 배열 생성
		for (int i = N - 1; i >= 0; i--) {
			if (arr[i] < 0) {
				sort[cnt[1000000 - Math.abs(arr[i])] - 1] = arr[i];
				cnt[Math.abs(arr[i])]--;
			} else
				sort[cnt[arr[i] + 1000000] - 1] = arr[i];
			cnt[arr[i] + 1000000]--;
		}

		for (int i = 0; i < sort.length; i++) {
			sb.append(sort[i] + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}
