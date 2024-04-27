import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ",0);
		int N =Integer.parseInt(NM[0]);
		int M =Integer.parseInt(NM[1]);
		
		String [] snack_str = br.readLine().split(" ",0);
		int [] snack = new int [M];
		for(int i=0; i<M;i++) {
			snack[i] = Integer.parseInt(snack_str[i]);
		}
		Arrays.sort(snack);
		int left = 1;
		int right = snack[M-1];
		int ans = 0;
		
		while(left<=right) {
			int cnt =0;
			int mid = (left+right)/2;
			
			for(int i=0; i<M;i++) {
				cnt+= snack[i]/mid;
			}
			
			if(cnt<N) {
				right=mid-1;
			}else {
				if(ans<mid) ans = mid;
				left = mid+1;
			}
		}
		System.out.println(ans);
		
	}

}
