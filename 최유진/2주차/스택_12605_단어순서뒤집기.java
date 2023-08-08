package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj12605 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			StringBuilder sb = new StringBuilder();
			String[] strArr = br.readLine().split(" ");
			
			//역순으로 stringBuilder에 append (스택 미사용)
			// for(int j = strArr.length-1; j > -1; j--) {
			// 	sb.append(strArr[j] + " ");
			// }
			
			// bw.write("Case #" + i +": " + sb);
			// bw.write("\n");

			//스택 사용
			Stack<String> st = new Stack<>();
			
			for(int j = 0; j < strArr.length; j++) {
				st.push(strArr[j]);
			}
			
			for(int m = 0; m < strArr.length; m++) {
				sb.append(st.pop() + " ");
			}
			
			bw.write("Case #" + i + ": " + sb);
			bw.write("\n");
		}
		
		bw.close();

	}

}
