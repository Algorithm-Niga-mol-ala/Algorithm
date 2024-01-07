import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main10845_큐 {
	static Queue<Integer> q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 명령의 개수

		q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			String[] qr = br.readLine().split(" ");
			String order = qr[0];
			int num = 0;
			if (qr.length == 2) {
				num = Integer.parseInt(qr[1]);
			}
			// empty:비었으면 1 아니면 0
			switch (order) {
			case "push":
				q.add(num);
				break;
			case "pop":
				if (q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.poll());
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if (q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if (q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.peek());
				break;
			case "back":
				if (q.isEmpty())
					System.out.println(-1);
				else
					rear();
				break;
			} // switch
		}
	} // main

	public static void rear() {
		Queue<Integer> tmp = new LinkedList<>(); // back을 위한 임시큐
		tmp.addAll(q);
		while (tmp.size() != 1) { // 마지막 원소만 제외하고 다 poll
			tmp.poll();
		}
		System.out.println(tmp.poll()); // 마지막 원소 출력
	} // rear
}
