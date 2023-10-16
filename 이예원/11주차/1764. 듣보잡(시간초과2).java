import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_1764_듣보잡 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		ArrayList<String> cantSee = new ArrayList<>();
		ArrayList<String> cantHear = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			cantHear.add(br.readLine());
		}

		for (int i = 0; i < M; i++) {
			cantSee.add(br.readLine());
		}

		// N의 값(듣도 못한 사람)이 더 작다면
		if (N < M) {

			for (String str : cantSee) {

				boolean isEquals = false;

				for (String str2 : cantHear) {

					if (str.equals(str2)) {
						isEquals = true;
					}

				}

				if (isEquals)
					res.add(str);

			}

		} else {

			for (String str : cantHear) {

				boolean isEquals = false;

				for (String str2 : cantSee) {

					if (str.equals(str2)) {
						isEquals = true;
					}

				}

				if (isEquals)
					res.add(str);

			}

		}
		Collections.sort(res);

		System.out.println(res.size());

		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}

	}// main
}
