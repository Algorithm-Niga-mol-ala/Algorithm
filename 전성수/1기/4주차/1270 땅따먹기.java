import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String [] args) throws IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N;i++) {
			//N번의 반복
			
			String [] land = br.readLine().split(" ");
			//split 보다 StringTokenizer 가 속도가 더 빠르다고 한다.
			//그런데 split은 ""char단위로 자르기가 되는데 StringTokenizer는 그게 안되니까 상황에 맞게 쓰면 좋을듯
			String ans = "SYJKGW";
			//기본값
			
			int pop = Integer.parseInt(land[0]);
			//land[0] 은 땅 위에 있는 군인의 수
			
			HashMap<String, Integer> soldier = new HashMap<>(); 
			//만들 때 크기지정을 안 해 줘도 되고 안의 값이 검색되는 collection이 필요함
			
			
			
			for(int p=1; p<land.length ; p++) {
				if(soldier.containsKey(land[p])) {
					int amount = soldier.get(land[p]);
					soldier.put(land[p], ++amount);
					
					continue;//인구수를 늘리고 continue
					
				}//soldier에서 key가 land[p]인 군인이 이미 있다면 인구수를 늘려서 다시 넣음
				soldier.put(land[p], 1);
				
			}
			
			for (String s : soldier.keySet()) {
				if(soldier.get(s)>pop/2) {
					ans=s;
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
//4936ms 걸림
//bw의 경우

//4576ms 걸림
//StringBuilder의 경우
