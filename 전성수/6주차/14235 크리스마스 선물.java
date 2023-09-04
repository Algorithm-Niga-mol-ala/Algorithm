import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	// 아이들과 거점지를 방문한 횟수 (1≤n≤5,000)
	
	// 다음 n 줄에는 a 가 들어오고 그 다음 a개의 숫자(1≤a≤100)
	
	// 거점지에서 a개의 선물을 충전하는 것이고. 숫자들은 선물의 가치
	
	// 만약 a가 0이면 거점지가 아니라 아이임
	
	// 선물의 가치는 100,000보다 작은 양의 정수
	
	// a가 100까지니까 한번의 입력에 100개의 숫자가 들어올 수 있고 이거 5000번까지 가능하니까 최대 500,000개의 숫자가 배열에 들어가니까 n^2의 정렬을 이용하면 시간초과
       
	// 내림차순으로 만들어서 출력해주는 문제
  
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		// 아이들과 거점지를 방문한 횟수

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}//내림차순으로 

		});
		
		
		int cnt = 0; // 산타가 가지고 있는 선물의 개수
		
		for (int i = 0; i < n; i++) {//a 받기
			String[] a_str = br.readLine().split(" ");
			int a = Integer.parseInt(a_str[0]);
      
			switch (a) {
          //a 가 0인 경우
			case 0:
				if (pq.isEmpty()) {
					sb.append(String.valueOf(-1)).append("\n");
					break;
				}
				sb.append(pq.poll()).append("\n");
				break;

          //a 가 0이 아닌 모든 경우
			default:
				int idx = 1;
          
				while (idx<a_str.length) {//a의 길이가 입력마다 바뀌므로 범위에 신경써야함
					pq.add(Integer.parseInt(a_str[idx++]));
					cnt++;
				}
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
