import java.util.Scanner;

public class No_10994_별찍기19 {
	// 규칙 N*4-3개가 테두리에 있다.
	
	static int N;
	static String[][] stars;
	static int max;

	static void star(int n, int r, int max) {
		
		if (n==0) {
			return;
		}
		
		for (int i=r; i<max; i++) {
			stars[r][i] = "*";
			stars[i][r] = "*";
			stars[max-1][i] = "*";
			stars[i][max-1] = "*";
		}
		
		star(n-1, r+2, max-2);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		max = N*4-3;

		stars = new String[max][max];
		
		for (int i=0; i<max; i++) {
			for (int j=0; j<max; j++) {
				stars[i][j] = " ";
			}
		}

		
		star(N, 0, max);
		
		for (int i=0; i<max; i++) {
			for (int j=0; j<max; j++) {
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
	}

}
