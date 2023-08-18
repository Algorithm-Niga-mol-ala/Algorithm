package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class bj2161 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}

    //사이즈가 하나 남을 때까지
		while(q.size() != 1) {
			sb.append(q.poll() +" ");
			int moveNum = q.poll();
			q.add(moveNum);
		}

    //마지막 남은 것까지 sb에 넣어주기
		sb.append(q.poll());
		
		bw.write(sb.toString());
		bw.close();

	}

}
