import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj_10828 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<String> st = new Stack<>();

		for (int i = 0; i < N; i++) {

			String[] input = br.readLine().split(" ");
			String cmd = input[0];
			String num = "";
			if (input.length > 1) {
				num = input[1];
			}
			switch (cmd) {
			
			case "push":
				st.push(num);
				break;
			case "pop":
				if (st.isEmpty()) sb.append(-1 + "\n");
				else sb.append(st.pop() + "\n");
				break;
			case "size":
				sb.append(st.size() + "\n");
				break;
			case "empty":
				if(st.isEmpty()) sb.append(1 + "\n");
				else sb.append(0 + "\n");
				break;
			case "top":
				if (st.isEmpty()) sb.append(-1 + "\n");
				else sb.append(st.peek() + "\n");
				break;
			}

		}

		bw.write(sb.toString());

		bw.close();
	}

}
