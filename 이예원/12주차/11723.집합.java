
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= T; tc++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String com = st.nextToken();

			if (com.equals("add")) { // add

				int num = Integer.parseInt(st.nextToken());

				if (!set.contains(num)) {
					set.add(num);
				} else
					continue;

			} else if (com.equals("remove")) {
				int num = Integer.parseInt(st.nextToken());

				if (set.contains(num)) {
					set.remove(num);
				} else
					continue;

			} else if (com.equals("check")) {
				int num = Integer.parseInt(st.nextToken());

				if (set.contains(num)) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}

			} else if (com.equals("toggle")) {
				int num = Integer.parseInt(st.nextToken());

				if (set.contains(num)) {
					set.remove(num);
				} else {
					set.add(num);
				}

			} else if (com.equals("all")) {
				for(int i = 1; i <= 20; i++) {
					set.add(i);
				}

			} else { // empty
				set.clear();
			}

		}
		System.out.println(sb.toString());

	}// main
}
