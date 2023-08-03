package java0801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj5397 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		int testCaseNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCaseNum; i++ ) {
			String cmd = br.readLine();

			for(int j = 0; j < cmd.length(); j++) {
				switch(cmd.charAt(j)) {
				case '<' :
					if(!left.isEmpty())
						right.push(left.pop());
					break;
				case '-' :
					if(!left.isEmpty())
						left.pop();
					break;
				case '>' :
					if(!right.isEmpty())
						left.push(right.pop());
					break;
        //이 외의 문자가 들어오면 해당 문자를 left에 push.
				default : 
					left.push(cmd.charAt(j));
					break;
				}
			}
			
			while(!left.isEmpty()) {
				right.push(left.pop());
			}
			
			while(!right.isEmpty()) {
				bw.write(right.pop());
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		

	}

}
