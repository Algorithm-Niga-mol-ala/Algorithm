import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815_숫자카드 {
	static int N, M;
	static int[] card, search, flag;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
		card = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken()); // 카드 번호
		}

		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		search = new int[M]; // 숫자카드인지 아닌지 검사할 배열 - 정렬
		for (int i = 0; i < M; i++) {
			search[i] = Integer.parseInt(st.nextToken());
		}

		// search배열의 값이 card에 있는지 확인할 것 -> card를 정렬해줌
		Arrays.sort(card);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			if (binarySearch(search[i]))
				sb.append(1);
			else
				sb.append(0);
			sb.append(" ");
		}

		System.out.println(sb.toString());
		br.close();
	} // main

	public static boolean binarySearch(int key) {
		int st = 0;
		int ed = card.length - 1;
		while (st <= ed) {
			int mid = (st + ed) / 2;
			if (key == card[mid])
				return true;
			else if (key < card[mid])
				ed = mid - 1;
			else
				st = mid + 1;
		}
		return false;

	}
}
