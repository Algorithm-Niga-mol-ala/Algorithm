import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < num; i++) {
			int writeNum = Integer.parseInt(br.readLine());
			switch(writeNum) {
      //0이 입력되고 스택이 빈 상태가 아니면 제일 뒤에 숫자를 뺀다.
			case 0:
				if(!st.empty())
					st.pop();
				break;
      //그 외의 경우에는 입력된 숫자를 스택에 추가한다.
			default:
				st.push(writeNum);
			}
		}	

    //스택에 있는 값을 하나씩 빼면서 sum에 더한다.
		int sum = 0;		
		while(!st.isEmpty()) {
			sum += st.pop();
		}

    //bw는 string만 출력하므로 형변환 시켜주기.
		bw.write(Integer.toString(sum));
		bw.close();
	}

}
