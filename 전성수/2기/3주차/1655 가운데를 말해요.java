package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		//N 줄에 걸쳐 정수가 주어짐
		
		int N = Integer.parseInt(br.readLine());
		
		//정수의 개수 N !~100,000 , 10,000,000 건 이하
		//정수 -10,000 10,000
		PriorityQueue<Integer> min = new PriorityQueue<>((o1,o2)->o2-o1) ;  //작은 애들이 들어가는 최대힙
		PriorityQueue<Integer> max = new PriorityQueue<>();		
		min.add(Integer.parseInt(br.readLine()));//큰 애들이 들어가는 최소힘
		sb.append(min.peek()).append("\n");
		int min_cnt =1;
		int max_cnt =0;
		for(int i=1; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(min.peek()>num) {
				min.add(num);
				min_cnt++;
			}else {
				max.add(num);
				max_cnt++;
			}
			if(min_cnt-max_cnt==2) {
				max.add(min.poll());
				min_cnt--;
				max_cnt++;
				
			}else if(max_cnt-min_cnt==1) {
				min.add(max.poll());
				min_cnt++;
				max_cnt--;
			}
			sb.append(min.peek()).append("\n");
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
