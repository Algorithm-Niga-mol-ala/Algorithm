
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int N,cnt;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		// 원판의 개수

		hanoi(N,1,2,3);
		bw.write(String.valueOf(cnt)+"\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	// A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻
	static void hanoi(int target, int from, int mid, int to) {

		if(target==1) {
			sb.append(from).append(" ").append(to).append("\n");
			cnt++;
			return;
		}
		//hanoi 매서드의 목적은 target 원판이 from에서 to로 가는 것
		//N번째 제일 밑의 원판이 3으로 가는 게 목적
		//그러기 위해서 N번 원판 바로 위의 N-1번 원판이 옆으로 비켜야함
		
		hanoi(target-1,from, to ,mid );
		
		//위가 없어졌으니까 target을 from에서 to로 옮김
		sb.append(from).append(" ").append(to).append("\n");
		cnt++;
		
		//탑을 순서대로 쌓기 위해서 mid 로 옮겨뒀던 N-1번 원판을 to로 옮김 
		hanoi(target-1,mid,from,to);
		
		// hanoi(target-1,from, to ,mid )
		//이미 to로 간 N 번원판은 없다고 생각하고 
		//이제는 N-1의 하노이 탑을 from에서 to로 옮기는게 목적이 됨
		
	}

}
