import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		String [] arr_str = br.readLine().split(" ",0);
		
		int [] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(arr_str[i]);
		}
		Arrays.sort(arr);
		long ans = 3_000_000_000L;
		int save_i = 0;
		int save_st = 0;
		int save_ed = 0;
		for(int i=0; i<N-2; i++) {
			
			int st = i+1;
			int ed = N-1;
			while(st<ed) {
				long sum = (long)arr[st]+arr[ed] + arr[i];
				//캐스팅 잘하기
				if(sum ==0) {
					System.out.println(arr[i]+" "+arr[st]+" "+arr[ed]);
					System.exit(0);
				}
				
				if(Math.abs(sum)<Math.abs(ans)) {
					ans = sum;
					save_i = arr[i];
					save_st = arr[st];
					save_ed = arr[ed];
				}
				
				if(sum<0) {
					st++;
				}else {
					ed--;
				}
				
			}
		}
		
		System.out.println(save_i+" "+save_st+" "+save_ed);
		
	}
}
