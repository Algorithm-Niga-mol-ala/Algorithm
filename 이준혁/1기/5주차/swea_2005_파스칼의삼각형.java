import java.util.Scanner;

public class 파스칼의삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					
					arr[i][0] = 1;
					
					if ( i == j ) {
						arr[i][j] = 1;
					}
					
					if ( i >0 && j>0 &&  arr[i-1][j-1] > 0 && arr[i-1][j] > 0) {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					}
				
				}
			}
			
			System.out.println("#"+tc);
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					
					if ( arr[i][j] !=0 ) {
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
