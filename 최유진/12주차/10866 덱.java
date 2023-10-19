import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class bj_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<String> deque = new ArrayDeque<>();

    //덱의 메서드는 다음과 같습니다.
    //addFirst(), offerFirst(), addLast(), add(), offerLast(), removeFirst(), pollFirst(), removeLast(), pollLast()
    //remove(), poll(), getFirst(), peekFirst(), getLast(), peekLast(), peek(), push(), pop()
    //remove(Object o), contain(Object o), size()
    
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			String cmd = input[0];
			String num = null;
			String n;
			if(input.length == 2) {
				num = input[1];	
			} 

			switch(cmd) {
			case "push_front":
				deque.addFirst(num);
				break;
			case "push_back":
				deque.addLast(num);
				break;
			case "pop_front":
				n = deque.pollFirst();
				if(n == null) sb.append(-1);
				else sb.append(n);
				break;
			case "pop_back":
				n = deque.pollLast();
				if(n == null) sb.append(-1);
				else sb.append(n);
				break;
			case "size":
				sb.append(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) sb.append(1);
				else sb.append(0);
				break;
			case "front":
				n = deque.peekFirst();
				if(n == null) sb.append(-1);
				else sb.append(n);
				break;
			case "back":
				n = deque.peekLast();
				if(n == null) sb.append(-1);
				else sb.append(n);
				break;
			}
			
			if(!cmd.equals("push_back") && !cmd.equals("push_front")) {
				sb.append("\n");
			}
		}
		bw.write(sb.toString());
		bw.close();

	}

}
