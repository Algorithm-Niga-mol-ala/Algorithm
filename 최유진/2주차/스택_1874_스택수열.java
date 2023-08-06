package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj1874_copy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Stack에 peek 메서드는 최근에 추가된 데이터를 조회한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> st = new Stack<>();
		Stack<Integer> result = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		int lastPushNum = 0;
		
		// N = 8
		int N = Integer.parseInt(br.readLine());
		
		// result는 만들어야 되는 배열 
		// result = [4, 3, 6, 8, 7, 5, 2, 1]
		for(int i = 1; i < N + 1; i++) {
			int num = Integer.parseInt(br.readLine());
			result.push(num);
		}

		// result를 i = 0 ~ 7 까지 돌아가면서 st에 값이 있는지 체크한다.
check: 	for(int i = 0; i < N; i++) {
			
				// check중인 result 요소를 checkNum이라고 부르겠다.
				int checkNum = result.get(i);
			
	            while (true) {
	            	// st가 비어있지 않고 st에 마지막 추가된 요소가 checkNum이랑 같으면 
	            	// pop 해준다.
	                if (!st.isEmpty() && st.peek() == checkNum) {
	                    sb.append("-\n");
	                    st.pop();
	                    // result다음 요소를 확인하기 위해 break.
	                    break;
	                    
	                //checkNum이 마지막에 push된 숫자보다 작으면 for문 완전히 나가서 NO 리턴.
	                } else if (lastPushNum >= checkNum) {
	                        sb.setLength(0);
	                        sb.append("NO");
	                        break check;
	                }
	                
	                // pop도 안했고, NO도 안했다면 push 하나씩 키워가며 반복.
	                 st.push(++lastPushNum);
	                 sb.append("+\n");
	           }
	    }
	
		
		bw.write(sb.toString());
		bw.close();		
	}
}
