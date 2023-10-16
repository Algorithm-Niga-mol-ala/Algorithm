import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2002 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
				
		Queue<String> tunnelIn = new LinkedList<>(); 
		for(int i = 0; i < N; i++) {
			tunnelIn.add(br.readLine());
		}
		Queue<String> tunnelOut = new LinkedList<>(); 
		for(int i = 0; i < N; i++) {
			tunnelOut.add(br.readLine());
		}
		
		int cnt = 0;
		while(!tunnelOut.isEmpty()) {
			String outCar = tunnelOut.poll();
			if(!tunnelIn.peek().equals(outCar)) { //순서대로 들어온 게 아니라는 뜻이니까
				cnt++; //cnt 더해주고,
				tunnelIn.remove(outCar); //in 큐에서 방금 확인한 차 없애렴
			} else { //순서대로 들어온게 맞았따면
				tunnelIn.poll(); // //in에서 제일 위에 있던 차 없애렴
			}
      //위의 if문을 짧게 쓰고싶다면 아래와 같이 써도 맞음. 어차피 방금 확인한 차를 in에서 없애야되는 거니까
      //if(!tunnelIn.peek().equals(outCar)) cnt++; 
			// tunnelIn.remove(outCar);
		}
		System.out.println(cnt);
	}

}
