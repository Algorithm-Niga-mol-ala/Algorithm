import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[] nums, res;
	static boolean[] check;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		//N개의 자연수 중에서 M개를 고른 수열
		//N개의 자연수가 주어진다
		//입력 - N M / N개의 수 입력(10,000이하)
		//중복 안됨
		
		//N이 10,000이면 수가 크긴 해도 최대 8개 주어지니까 int형 사용해도 될듯?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[N];
		check = new boolean[N];
		res = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		} 
		
		//오름차순으로 입력하지 않으니까 정렬해주기
		Arrays.sort(nums);
		
		perm(0);
		System.out.println(sb);
		
	}//main

	static void perm(int depth) {
		
		//기저
		if(depth == M) {
			for(int i : res) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		//재귀
		
		for(int i = 0; i < N; i++) {
			if(check[i])
				continue;
			
			check[i] = true;
			res[depth] = nums[i];
			perm(depth+1);
			check[i] = false;
			
			
			
		}
		
		
	}//perm
	

}//class

