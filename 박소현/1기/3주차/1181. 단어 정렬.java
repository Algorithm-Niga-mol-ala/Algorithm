import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// string 배열 생성
		String[] sArr = new String[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// stringtokenizer은 왜 for문 안에 써야할까?? 안쓰면 계속 NoSuchElementException 떠
			sArr[i] = st.nextToken(); // 입력받은 문자열 토큰화하여 배열에 넣기
		}

		// 정렬하기
		Arrays.sort(sArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) { // 길이가 같으면
					return o1.compareTo(o2); // 사전순 정렬
				} else { // 길이가 다르면
					return o1.length() - o2.length(); // 반환값에 따라 교환 or 유지
				}
			}
		});

		// 중복 없이 출력
		for (int i = 0; i < N - 1; i++) {
			if (sArr[i].equals(sArr[i + 1])) // ==는 주소값 비교이므로 중복값 제거 안됨. equals로 내용 비교!
				continue;
			System.out.println(sArr[i]);
		}
        System.out.println(sArr[N - 1]);
	}
}
