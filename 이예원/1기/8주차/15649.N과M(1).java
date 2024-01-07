
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] arr; //자연수 담을 배열
	static boolean[] check; //방문처리 배열
	static int[] res; //결과 담을 배열
	
	
	public static void main(String[] args) throws IOException {
		// 자연수 N과 M이 주어졌을 때 , 길이가 M인 수열을 모두 구하기
		// 1~N까지의 자연수 중에서 중복 없이 M개를 고른 수열
		// 오름차순으로 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		check = new boolean[N]; //사용했는지 확인할 배열
		res = new int[M]; //생성된 수열 담아줄 배열
		
		//1~N까지의 자연수 배열에 저장하기
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		perm(0);
		
	}//main


	static void perm(int depth) {
		
		//기저 조건
		//res배열에 M길이 만큼 수가 담겼을 때
		if(depth == M) {
			for(int i : res) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		//재귀
		//재귀 깊이가 M이 안됐을 때? res배열에 모든 수가 차지 않았을 ㄸㅐ
		
		for(int i = 0; i < N; i++) {
			
			//방문체크 돼있으면
			if(check[i]) continue;
			//그게 아니라면
			
			check[i] = true; //내가 지금 서있는 곳 방문체크
			
			res[depth] = i+1; //내가 서있는 곳의 수 넣기
			
			perm(depth+1); //한칸 더 들어가
			
			check[i] = false; //갔다오면 방문체크해제
		}
		
	}//perm
	
	
}
