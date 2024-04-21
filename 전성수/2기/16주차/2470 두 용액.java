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
		
		int st = 0;
		int ed = N-1;
		int ans = Integer.MAX_VALUE;
		int save_st=0;
		int save_ed=0;
		while(st<ed) {
			int sum = arr[st] + arr[ed];
			
			if(sum == 0) {
				System.out.println(arr[st]+" "+arr[ed]);
				System.exit(0);
			}
			if(Math.abs(sum)<Math.abs(ans)) {
				ans = sum;
				save_st = arr[st];
				save_ed = arr[ed];
			}
			
			if(sum<0) {
				st++;
			}else {
				ed--;
			}
			
		}
		System.out.println(save_st+" "+save_ed);
	}
}
