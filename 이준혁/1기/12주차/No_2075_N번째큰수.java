import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class No_2075_N번째큰수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

    // 우선순위큐 선언, Collections.reverseOrder()를 쓰면 내림차순으로 우선순위를 줄 수 있다.
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i=0; i<N*N; i++) { // N*N개 입력받기
			pq.add(sc.nextInt());
		}
		
		for (int i=0; i<N; i++) {
			if (i==N-1) { // N번째에 해당하는 경우
				System.out.println(pq.remove()); // 그 내용을 출력
			} else {
				pq.remove(); // N번째 전까지는 꺼내주자
			}
		}

    /* 같은 방식이라고 생각되지만 int 선언이 많아서일까 시간초과가 발생했다!
    int cnt = N*N;
		
		while (cnt > 0) {
			pq.add(sc.nextInt());
			cnt--;
		}
		
		for (int i=0; i<N; i++) {
			int res = pq.remove();
			if (i==N-1) {
				System.out.println(res);
			}
		}
    */
    
	}
}
