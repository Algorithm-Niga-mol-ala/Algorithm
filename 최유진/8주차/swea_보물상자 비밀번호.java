package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_5658 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			HashSet<Integer> set = new HashSet<>(); // 중복 제거 위해 hashset사용. 10진수로 변환 후 set에 넣기.

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int L = N / 4; // 한 변의 길이.

			String str = br.readLine();

			for (int i = 0; i <= N - L; i++) {
				set.add(Integer.parseInt(str.substring(i, i + L), 16));
			} // 잘랐을 때 기본 인덱스 안에 들어오는 부분.

			for (int i = N - L + 1; i < N; i++) {
				String password = str.substring(i, N) + str.substring(0, L - N + i);
				set.add(Integer.parseInt(password, 16));
			} // 잘랐을 때 기본 인덱스에서 벗어나는 부분.

			ArrayList<Integer> list = new ArrayList<>(set);
			Collections.sort(list, Collections.reverseOrder());

			bw.write("#" + tc + " " + Integer.toString(list.get(K - 1)) + "\n");
		}

		bw.close();

	}

}
