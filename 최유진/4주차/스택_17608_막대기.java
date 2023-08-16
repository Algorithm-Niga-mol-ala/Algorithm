package algo; 

import java.util.Scanner;
import java.util.Stack;

public class bj17608 {

	public static void main(String[] args) {
		//스택x와 같은 풀이법. 근데 메모리랑 시간 둘 다 스택을 사용한 코드가 더 많이 나왔다.
    //스택 연습하는 거에 의의를 두면 될듯
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<>();
        
		for(int i = 0; i < N; i++) {
			st.push(sc.nextInt());
		}
		
		int max = 0;
		int answer = 0;
    //마지막 원소부터 max값과 비교해주며 업데이트해준다.
		while (!st.empty()) {
			if (st.peek() > max) {
        //max보다 크면 오른쪽에서 봤을 때 보이므로 answer++;
				answer++;
				max = st.peek();
			}
			st.pop();
		}
		
		System.out.println(answer);

	}

}
