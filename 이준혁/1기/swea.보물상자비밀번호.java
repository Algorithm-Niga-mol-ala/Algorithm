import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution
{
	public static void main(String args[])
	{
		// 한 면에는 N/4개만큼의 숫자가 들어간다.
		// 즉, 그 횟수만큼 사이클이 반복되면 같은 숫자가 나온다.
		// ex) N=12인 경우 12/4=3이므로 3사이클이 돌면 같은 숫자들만 나온다.
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for (int tc=1; tc<=T; tc++) {
			ArrayList<String> list = new ArrayList<String>();
			List<Integer> res = new ArrayList<>();

			int N = sc.nextInt();
			int K = sc.nextInt();
			int cyc = N/4;
			
			String str = sc.next();
			
			for (int i=0; i<N; i++) {
				String tmp = String.valueOf(str.charAt(i));
				list.add(tmp);
			}
		
			for (int a=0; a<cyc; a++) {
				String as = "";
				int cnt = 1;
				
				for (int i=0; i<N; i++) {
					if ( cnt < cyc ) {
						as += list.get(i);
						cnt++;
					} else if ( cnt == cyc ) {
						as += list.get(i);
						res.add(Integer.parseInt(as, 16));
						cnt = 1;
						as = "";
					}
				}
				list.add(list.remove(0));
			}
			
			res = res.stream().distinct().collect(Collectors.toList());
			
			Collections.sort(res, Collections.reverseOrder());
			
			System.out.println("#"+tc+" "+res.get(K-1));
		} // tc 종료부	
	}
}
