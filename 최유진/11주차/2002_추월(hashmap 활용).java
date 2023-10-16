import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		HashMap<String, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			hashmap.put(br.readLine(), i);
		} //기존 순서를 hashmap에 저장해둔다. 

		String[] afterTunnel = new String[N];
		for (int i = 0; i < N; i++) {
			afterTunnel[i] = br.readLine();
		} //터널에서 나올 때 순서는 arr에 저장해둔다.

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int originOrder = hashmap.get(afterTunnel[i]); //이 차의 원래 순서
			for(int j = i+1; j < N; j++) {
				if(originOrder > hashmap.get(afterTunnel[j])) { //뒤의 값을 보는데
					//이 차의 원래 순서보다 작은 애들이 뒤에 있다면? 얘가 추월한거임.
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
