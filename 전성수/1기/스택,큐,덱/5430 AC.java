import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static StringBuilder sb;

	// R뒤집기(순서) D버리기(첫번째수버리기) -> 비어있을 때 쓰면 에러

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		tc : for (int t = 0; t < T; t++) {
			String command = br.readLine();
			
			int N = Integer.parseInt(br.readLine());

			int[] arr = new int[N];

			String[] nums = br.readLine().split(",");
			
			for (int i = 0; i < N; i++) {
				String now = nums[i]; //쉼표를 기준으로 나눈 문자열
				if (i == 0) {
					now = now.substring(1);
				}
				if (i == N - 1) {
					int L = now.length()-1;
					now = now.substring(0, L);
				}
				arr[i] = Integer.parseInt(now);
			}
  //맨앞과 맨뒤에는 [ 와 ] 가 붙어있으니까 잘라서 넣어줌
			int st = 0;
			int ed = N-1;
			boolean reverse = false;
  //시작과 끝, 뒤집었는지 아닌지
			for (int i = 0; i < command.length(); i++) {
				char c = command.charAt(i);
				if (c == 'R') {//뒤집고 boolean 바꾸기
					int tmp = ed;
					ed = st;
					st = tmp;
					if(reverse) {
						reverse= false;
					}else {
						reverse= true;
					}
				
				} else {
					
					if (reverse) {//뒤집혀 있으면 st를 줄여감. 근데 st가 ed보다 작으면 비어있다는거니까 에러
						if(st<ed) {
							sb.append("error").append("\n");
							continue tc;
						}
						st--;
					} else {
						if(st>ed) {
							sb.append("error").append("\n");
							continue tc;
						}
						st++;
					}
				}
			}
			if (reverse) {//비어있다는 거니까 빈 배열 출력
				if(st<ed) {
					sb.append("[]").append("\n");
					continue tc;
				}
			} else {
				if(st>ed) {
					sb.append("[]").append("\n");
					continue tc;
				}
			}
			sb.append("[");
			if(reverse) {
			
				for(int i = st; i>ed; i--) {
					sb.append(arr[i]).append(",");
				}
			}else {
				for(int i = st; i<ed; i++) {
					sb.append(arr[i]).append(",");
				}
			}
			sb.append(arr[ed]).append("]\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
