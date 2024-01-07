import java.util.Scanner;
import java.util.Stack;

public class No_17608_막대기 {

	public static void main(String[] args) {
		// 예전에 조건문으로만 풀었는데 스택을 활용해보자.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>(); // 스택 선언
		
		for (int i=0; i<N; i++) {
			int h = sc.nextInt(); // 입력을 받은 것을
			stack.push(h); // stack에 push해준다.
		}
		
		int max = stack.peek(); // 최대값 정의를 위해 peek으로 초기값 넣어줌
		int res = 1; // 보이는 막대 수 정의 (처음에 정의한 peek가 한개 보이므로 1)
		
		for (int i=0; i<N; i++) {
			int use = stack.pop(); // pop한 값을 use에 넣어줘서
			if ( max < use ) { // 비교하여 max보다 크면
				max = use; // 최대값 변경
				res++; // 보이니까 1개 추가
			}
		}	
		System.out.println(res);
	}
}
