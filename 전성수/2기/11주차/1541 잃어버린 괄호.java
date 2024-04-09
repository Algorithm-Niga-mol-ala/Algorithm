import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int length = str.length();

		int ans = 0;
		int st = -1;
		boolean plus = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			char now = str.charAt(i);

			if (now == '+') {
				if (plus) {
					ans += Integer.parseInt(sb.toString());
					sb = new StringBuilder();
				} else {
					ans -= Integer.parseInt(sb.toString());
					sb = new StringBuilder();
				}
			} else if (now == '-') {
				if (plus) {
					ans += Integer.parseInt(sb.toString());
					sb = new StringBuilder();
					plus = false;
				} else {
					ans -= Integer.parseInt(sb.toString());
					sb = new StringBuilder();
				}
			} else {
				if(st==-1 && (int)now==0) {
					continue;
				}else {
					sb.append(now);
				}
			}
		}
		if (plus) {
			ans += Integer.parseInt(sb.toString());
		} else {
			ans -= Integer.parseInt(sb.toString());
		}
		System.out.println(ans);
	}
}
