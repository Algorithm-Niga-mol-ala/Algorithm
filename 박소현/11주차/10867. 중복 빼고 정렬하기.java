import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main10867_중복빼고정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 중복된 값은 제외해야 하므로
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			s.add(Integer.parseInt(st.nextToken()));
		}

		// set은 정렬하려면 list로 변환 후 정렬
		List<Integer> list = new ArrayList<Integer>(s);

		// comparator 연습하려고 직접 써봄
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int c : list)
			sb.append(c).append(" ");
		System.out.println(sb);

	}
}
