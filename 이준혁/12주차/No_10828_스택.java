import java.util.Scanner;
import java.util.Stack;

public class No_10828_스택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			String comm = sc.next();
			
			// st.push(x)는 x를 스택에 넣어준다.
			if (comm.equals("push")) {
				st.push(sc.nextInt());
			} 
			
			// st.pop()은 스택의 가장 위에 있는 수를 꺼낸다.
			// 비어있는 경우에는 오류 발생하므로 조건문으로 걸러줌
			else if (comm.equals("pop")) {
				if (!st.isEmpty()) {
					sb.append(st.pop()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} 
			
			// st.size()는 스택의 사이즈를 알려준다.
			else if (comm.equals("size")) {
				sb.append(st.size()+"\n");
			} 
			
			// st.isEmpty()는 비어있는지를 확인해준다.
			// 비어있으면 true, 차있다면 false
			else if (comm.equals("empty")) {
				if (st.isEmpty()) {
					sb.append(1+"\n");
				} else {
					sb.append(0+"\n");
				}
			} 
			
			// 가장 위의 수를 꺼내지 않고 출력해주는 건 st.peek()
			else if (comm.equals("top")) {
				if (!st.isEmpty()) {
					sb.append(st.peek()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			}
		}
		System.out.println(sb);
	}
}
