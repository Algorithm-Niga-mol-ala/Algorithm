import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String [] txm = br.readLine().split(" ",0);
		int t = Integer.parseInt(txm[0]);//시간
		int x = Integer.parseInt(txm[1]);//1초에 x개의 금화
		int m = Integer.parseInt(txm[2]);//m 마리 몬스터
		if(m==0) {
			System.out.println(t*x);
			System.exit(0);
		}
		
		
		int min_m =Integer.MAX_VALUE;
		for(int i=0; i<m; i++) {
			String [] ds = br.readLine().split(" ",0);
			int d = Integer.parseInt(ds[0]);
			int s = Integer.parseInt(ds[1]);
			if(d%s==0) {
				min_m = Math.min(min_m, d/s-1);
			}else {
				min_m = Math.min(min_m, d/s);
			}
		}
		
		
		if(min_m==0) {
			System.out.println(0);
			System.exit(0);
		}else if(t>min_m){
			System.out.println(min_m*x + ((t-min_m)/2)*x);
			System.exit(0);
			
		}else {
			System.out.println(t*x);
			System.exit(0);
		}
		
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
