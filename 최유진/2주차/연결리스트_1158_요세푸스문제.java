import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class bj1158 {
	
	//https://st-lab.tistory.com/197
	
	//queue의 특징 : FIFO
	//Engueue 큐 맨 뒤에 데이터 추가
	//Dequeue 큐 맨 앞쪽 데이터 삭제  

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		//입력받은 문자열을 분리 
		String[] inputArr = br.readLine().split(" ");
		int num = Integer.parseInt(inputArr[0]);
		int order = Integer.parseInt(inputArr[1]);
		
		Queue<Integer> queue = new LinkedList<>();
		
		//num이 7일 때, queue = [1, 2, 3, 4, 5, 6, 7]
		for (int i = 1; i < num+1; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		//queue가 비어있을 때까지 반복 
		while(!queue.isEmpty()) {
			for(int i = 0; i < order - 1; i++) {
				//가장 앞 쪽의 값을 꺼내서 
				int value = queue.poll();
				//뒤에다가 넣는다.
				queue.offer(value);
			}
			
			sb.append(queue.poll());
			//마지막에는 , 가 들어가지 않아야 한다.
			if (!queue.isEmpty()) {
				sb.append(", ");
			}

		}
		sb.append(">");
		
		bw.write(sb.toString());
		bw.close();
	}

}
