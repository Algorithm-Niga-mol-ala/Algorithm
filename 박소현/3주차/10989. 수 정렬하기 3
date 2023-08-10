import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 그냥 sysout하면 시간초과 뜸 ^^
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

    // 선택정렬 했더니 시간초과 뜸 ^^
    
		// 카운팅 정렬
		// 1. 입력값 중 최댓값 구하기
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		int[] cnt = new int[max + 1]; // 0~max까지 담을 배열 생성

		// 2. 개수 카운팅하기
		for (int i = 0; i < arr.length; i++) {
			int idx = arr[i];
			cnt[arr[i]]++;
		}

		// 3. 누적합 구하기
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}

		// 4. 원본배열 뒤에서부터 순회하면서 정렬된 배열에 저장하기
		int[] sort = new int[N];
		for (int i = N - 1; i >= 0; i--) {
			sort[cnt[arr[i]] - 1] = arr[i];
			cnt[arr[i]]--;
		}

		for (int i = 0; i < sort.length; i++) {
			sb.append(sort[i] + "\n");
		}
		System.out.println(sb);
		br.close();
	}
}
