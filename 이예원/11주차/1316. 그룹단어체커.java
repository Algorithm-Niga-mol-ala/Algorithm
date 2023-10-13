import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_1316_그룹단어체커 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int res = 0; // 결과

		for (int tc = 0; tc < N; tc++) {

			int originCnt = 1; // 원래단어체크
			int sortCnt = 1; // 정렬단어체크

			String word = br.readLine();

			int len = word.length();

			char[] originWord = new char[len];
			char[] sortWord = new char[len];

			for (int i = 0; i < len; i++) {
				originWord[i] = word.charAt(i);
				sortWord[i] = word.charAt(i);
			} // 배열에 저장

			Arrays.sort(sortWord); // 정렬

			// 정렬된 문자열에서 문자 개수 카운드
			for (int i = 1; i < len; i++) {

				if (sortWord[i] != sortWord[i - 1]) // 내 앞에 있는 단어와 내가 다르면
					sortCnt++;

			}

			for (int i = 1; i < len; i++) {
				if (originWord[i] != originWord[i - 1])
					originCnt++;
			}

			if (sortCnt == originCnt)
				res++;
		} // tc
		System.out.println(res);
	}
}
