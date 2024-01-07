import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10828_스택 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 명령의 개수
		
		Stack<Integer> st = new Stack<>();
		for(int i =0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			String order = str[0];
			int num = 0;
			if (str.length==2) {
				num = Integer.parseInt(str[1]);
			}
			// empty:비었으면 1 아니면 0
			switch(order) {
			case "push":
				st.add(num);
				break;
			case "pop":
				if (st.isEmpty()) System.out.println(-1);
				else System.out.println(st.pop());
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if (st.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "top":
				if (st.isEmpty()) System.out.println(-1);
				else System.out.println(st.peek());
				break;
			} // switch
		}
		
	} // main
}
