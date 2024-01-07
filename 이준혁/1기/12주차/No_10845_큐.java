import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_10845_큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int ntmp = 0;
		
		for (int i=0; i<N; i++) {
			String tmp = sc.next();
			
			if (tmp.equals("push")) {
				ntmp = sc.nextInt();
				q.add(ntmp);
			} else if (tmp.equals("pop")) {
				if (!q.isEmpty()) {
					sb.append(q.remove()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} else if (tmp.equals("size")) {
				sb.append(q.size()+"\n");
			} else if (tmp.equals("empty")) {
				if (!q.isEmpty()) {
					sb.append(0+"\n");
				} else {
					sb.append(1+"\n");
				}
			} else if (tmp.equals("front")) {
				if (!q.isEmpty()) {
					sb.append(q.peek()+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} else if (tmp.equals("back")) {
				if (!q.isEmpty()) {
					sb.append(ntmp+"\n");
				} else {
					sb.append(-1+"\n");
				}
			} 
		}
		System.out.println(sb);
	}
}
