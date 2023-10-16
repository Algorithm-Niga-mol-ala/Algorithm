
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		HashMap<String, Integer> map = new HashMap<>();

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			map.put(input, i);
		} // 터널 진입

		int[] out = new int[N];

		// 터널 빠져나온 순서대로 value값 저장하기
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			out[i] = map.get(input);
		}

		// 나중에 들어가면 value 값이 큼.
		// 기준 차 보다 나중에 빠져나온 차의 value보다 크다면 추월한 것
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (out[i] > out[j]) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);

	}// main

}
