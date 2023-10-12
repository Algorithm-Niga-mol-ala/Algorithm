import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1316_그룹단어체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			String word = br.readLine(); // 단어 입력

			boolean[] visited = new boolean[26]; // 알파벳 방문배열

			// 알파벳 방문처리 & cnt 카운팅 -> 겹치는 게 없다면 word.length만큼 나옴
			// 만약 차이가 난다면? 겹치는 문자가 있었다는 뜻
			// 만약 단어의 현재 인덱스 문자=그 전 인덱스 문자 라면 diff 카운팅
			// cnt+diff=word.length라면 그룹 단어 -> ans 카운팅
			// != -> 연속된 것이 아니라 따로 나왔다는 뜻
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				int k = word.charAt(j) - 'a';
				if (!visited[k]) {
					cnt++;
					visited[k] = true;
				}
			}
			int diff = 0;
			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j) == word.charAt(j - 1))
					diff++;
			}
			if (cnt == word.length())
				ans++;
			else {
				if (diff + cnt == word.length())
					ans++;
			}
		} // for
		System.out.println(ans);
	} // main
}
