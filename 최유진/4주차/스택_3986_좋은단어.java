package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class bj3986 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Stack<String> st = new Stack<>();
		int answer = 0;
		
		for(int tc = 0; tc < N; tc++) {

			String[] strArr = br.readLine().split("");
			
			for(int i = 0; i < strArr.length; i++) {
				if(strArr[i].equals("A")) {
          //스택의 가장 위에 짝이 있다면 pop해서 없애주기!
					if(!st.isEmpty() && st.peek().equals("A")) {
						st.pop();
					} else {
						st.push(strArr[i]);
					}
				} else {
					if(!st.isEmpty() && st.peek().equals("B")) {
						st.pop();
					} else {
						st.push(strArr[i]);
					}
				}	
			}

      //모든 요소가 짝지어 나갔다면? (isEmpty()가 true라면?) answer에 +1
			if(st.isEmpty()) {
				answer++;
			}
			
			st.clear();
			
		}
			
		bw.write(Integer.toString(answer));
		bw.close();

	}

}
