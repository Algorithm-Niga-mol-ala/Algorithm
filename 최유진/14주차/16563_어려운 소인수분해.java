import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// https://velog.io/@alswndit/%EB%B0%B1%EC%A4%80-16563%EB%B2%88-%EC%96%B4%EB%A0%A4%EC%9A%B4-%EC%86%8C%EC%9D%B8%EC%88%98%EB%B6%84%ED%95%B4-G4
		// 에라토스테네스의 체
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] minFactor = new int[5000001];
		
		for(int i = 2; i <= 5000000; i++) {
			minFactor[i] = i;
		}
		
		for(int i = 2; i * i <= 5000000; i++) {
			if(minFactor[i] == i) { //i가 소수라면
				for(int j = i * i; j <= 5000000; j+= i ) { // 그 다음 큰 배수부터 전부 해당 소수로 표시
					if(minFactor[j] == j) { //아직 업데이트가 안 된 애라면. 
						minFactor[j] = i;
					}
				}
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			while( n > 1 ) {
				sb.append(minFactor[n] + " ");
				n /= minFactor[n]; //n이 가지고 있는 최소의 소수로 나눠줘.
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
