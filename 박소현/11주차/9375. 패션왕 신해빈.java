import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main9375_패션왕신해빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String cloth = st.nextToken();
				String kind = st.nextToken();
				// 1.
				if (map.containsKey(kind))
					map.put(kind, map.get(kind) + 1);
				else
					map.put(kind, 1);
				// 2.
//				map.put(kind, map.getOrDefault(kind, 0) + 1);

			}

			// 옷을 안 입은 경우도 고려 -> +1해준 value값을 곱해줘야 함
			int ans = 1;
			for (int value : map.values()) {
				ans *= value + 1;
			}

			// 아무 것도 안 입는 경우도 있으므로 총 경우의 수에서 -1
			System.out.println(ans - 1);

		} // tc

	} // main
}
