
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static StringBuilder sb;
	//조건을 만족할 때마다 sb에 넣어주기 위해 static으로 선언
	
	static int[] nums;
	//골라진 숫자열을 담는 배열
	
	static ArrayList<Integer> tmp;
	//랜덤하게 나온 숫자의 조합을 담아야해서 size가 변할 수 있는 list에 담음
	
	static boolean[] visited;
	//빙문을 확인앟는 배열
	
	static int k,N;
	// k (6 < k < 13), N은 입력의 크기
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		while (true) {//몇개의 입력이 주어질지 모르니까 while
			String[] str = br.readLine().split(" ");

			if (str[0].equals("0"))//탈출 조건
				break;
			
			N = str.length;
			
			nums = new int[N];
			
			visited = new boolean[N];
			
			k = Integer.parseInt(str[0]);
			// 숫자의 개수

			for (int i = 0; i < k; i++) {
				nums[i] = Integer.parseInt(str[i + 1]);
			} // nums에 값 담기
			
			lotto(0);
			sb.append("\n");
			//입력 1회분의 실행이 끝나면 엔터
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	static void lotto(int depth) {
		
		if (depth == k) {
			
			tmp = new ArrayList<Integer>();
			//골라진 숫자를 담기 위한 list
			
			for (int i = 0; i < k; i++) {
				if (visited[i]) {
					tmp.add(nums[i]);
				}//골라진 숫자를 넣음
			}
			if (tmp.size() == 6) {//그것이 6개일 때만 sb에 올림
				for (int i = 0; i < 6; i++) {
					sb.append(tmp.get(i)).append(" ");
				}
				sb.append("\n");//한 번 끝나면 엔터
			}
			return;
		}
		
		//조합만들기
		visited[depth] = true;
		lotto(depth + 1);
		visited[depth] = false;
		lotto(depth + 1);

	}

}
