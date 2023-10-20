import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_11286 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) - Math.abs(o2) == 0) {
					return o1 - o2;
				}
				return Math.abs(o1) - Math.abs(o2);
			}
			
		});
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			if(x == 0) {
				if(pq.isEmpty()) sb.append(0 + "\n");
				else sb.append(pq.poll() + "\n");
			} else {
				pq.add(x);
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
