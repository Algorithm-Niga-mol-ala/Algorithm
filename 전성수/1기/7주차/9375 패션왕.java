
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static int N;
	static StringBuilder sb;
	static HashMap<String, Integer> wear;
	//의상수 N. 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<T; tc++) {
			//T만큼의 반복
			N = Integer.parseInt(br.readLine());
			wear = new HashMap<String, Integer>();
			//같은 타입의 옷을 저장할 컬랙션
			
			for(int i=0; i<N; i++) {
				String [] str = br.readLine().split(" ");
				
				if(wear.containsKey(str[1])) {//같은 타입의 옷이 있다묜 value를 1올려서 넣음
					wear.put(str[1], wear.get(str[1])+1);
				}else {
					wear.put(str[1], 1);
				}
			}
			int ans=1;
			for (String key : wear.keySet()) {
				//key에 대해서 그 value+1한 값들을 곱하고 마지막에 1을 빼면 
				//중복없이 나올 수 있는 조합의 수
				//3c1 * 2c1 -1 
				//입거나 안입거나의 경우
				ans*=(wear.get(key)+1);
			}
			
			sb.append(String.valueOf(ans-1)).append("\n");
			
		}
	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	

}
