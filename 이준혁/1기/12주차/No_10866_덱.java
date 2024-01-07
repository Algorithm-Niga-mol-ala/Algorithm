import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class No_10866_덱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Deque<Integer> dq = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<N; i++) {
			String tmp = sc.next();
			
			if (tmp.equals("push_front")) {
				int ntmp = sc.nextInt();
				dq.addFirst(ntmp);
			} else if (tmp.equals("push_back")) {
				int ntmp = sc.nextInt();
				dq.addLast(ntmp);
			} else if (tmp.equals("pop_front")) {
				if (!dq.isEmpty()) {
					sb.append(dq.removeFirst()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} else if (tmp.equals("pop_back")) {
				if (!dq.isEmpty()) {
					sb.append(dq.removeLast()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} else if (tmp.equals("size")) {
				sb.append(dq.size()+"\n");
			} else if (tmp.equals("empty")) {
				if (!dq.isEmpty()) {
					sb.append(0+"\n");
				} else {
					sb.append(1+"\n");
				}
			} else if (tmp.equals("front")) {
				if (!dq.isEmpty()) {
					sb.append(dq.getFirst()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} else if (tmp.equals("back")) {
				if (!dq.isEmpty()) {
					sb.append(dq.getLast()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			}
		}
		System.out.println(sb);
	}
}
