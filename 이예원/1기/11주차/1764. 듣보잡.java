package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		} // 처음에 들어오는 값 set에 저장

		ArrayList<String> res = new ArrayList<>();

		for (int i = 0; i < M; i++) {

			String str = br.readLine();

			if (set.contains(str)) {
				res.add(str);
			} // set이 str을 포함하고있다면 res에 넣기

		}

    //정렬 후 출력
		Collections.sort(res);
		System.out.println(res.size());
		for (String i : res) {
			System.out.println(i);
		}

	}// main
}
