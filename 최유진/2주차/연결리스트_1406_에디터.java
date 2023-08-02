package bj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj1406 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		String str = br.readLine();
		
		//left에 입력된 값 집어 넣기.
		for(int i = 0; i < str.length(); i++) {
			left.push(str.charAt(i));
		}
		
		//String으로 받아 int로 변환.
		int cmdNum = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < cmdNum; j++) {
			String cmd = br.readLine();
			switch(cmd.charAt(0)) {
				case 'L' :
					if(!left.isEmpty())
						right.add(left.pop());
						break;
				case 'D' :
					if(!right.isEmpty())
						left.add(right.pop());
					break;
				case 'B' :
					if(!left.isEmpty())
						left.pop();
					break;
				case 'P' :
					left.add(cmd.charAt(2));
					break;
			}
		}
		
		//왼쪽에 있는 값들을 오른쪽에 다 넣어주고,
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		//오른쪽에 있는 값들을 위에서부터 빼서 출력.
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
