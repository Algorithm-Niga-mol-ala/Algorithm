import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main14425_문자열집합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		// m개의 문자열 중에서 n개의 문자열에 포함되는 것의 개수를 구해야 한다
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

//		List<String> s = new ArrayList<>(); // n개의 문자열 담아줄 리스트 s
		// 리스트 시간은 4700여초, 셋 시간은 300여초
		Set<String> s = new HashSet<>(); // n개의 문자열 담아줄 셋 s

		// 포함되는 문자열만 담아줄 리스트 (중복이어도 개수를 카운팅해야하므로 셋이 아닌 리스트로 설정)
//		[반례]
//		1 3
//		A
//		A
//		A
//		A
		List<String> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			s.add(str); // n개의 문자열 s에 담아주고
		}

		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (s.contains(str))
				ans.add(str); // m개의 문자열 중 s에 담긴 게 있다면 ans에 담아주기
		}

		System.out.println(ans.size()); // 담긴 문자열의 수 카운팅
	}
}
