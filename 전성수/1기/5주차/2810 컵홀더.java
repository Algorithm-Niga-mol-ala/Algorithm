

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		String[] seats = br.readLine().split("");
		
		int cnt =1; // 마지막 자리 오른쪽은 항상 컵홀더가 있으니까
		
		
		for(int i=0; i<N; i++) {// 각자리 왼쪽의 컵홀더가 있는지
			if(seats[i].equals("L")){//L은 연속으론 나오니까 L 하나가 있으면 다음거 볼 필요가 없음
				i++;
				cnt++;
			}else {//S면 컵홀더수 올리기
				cnt++;
				
			}
			
			
			
		}
		if(cnt>N) cnt=N;//사람수보다 컵홀더가 많을 경우
		
		
		sb.append(String.valueOf(cnt));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}
