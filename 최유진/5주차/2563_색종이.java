package algo;

import java.util.Scanner;

public class bj2563 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

    //검색의 힘을 빌려 문제 푸는 방식을 참고했습니다. (살짝 보고 다시 돌아와서 품)
    //100이라는 도화지 너비를 설정해주었으므로 해당 격자판을 2차원 배열로 만듭니다.
		int[][] map = new int[100][100];
		
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

      //좌표 입력을 받으면 +10, +10에 해당하는 만큼 2차원 배열 값을 +1 시킵니다.
			for(int j = n; j < n+10; j++) {
				for(int k = m; k < m+10; k++) {
					map[j][k]++;
				}
			}
		}

    //2차원 배열에서 중복되는 값은 2이상이 될 것이므로, 1이상이면 sum에 1을 더해주도록 조건을 걸었습니다.
		int sum = 0;
		for(int[] line: map) {
			for(int i = 0; i < 100; i++) {
				if(line[i] >= 1) {
					sum++;
				}
			}
		}
    //저는 int형 2차원 배열로 했더니 line[i]>=1 같은 조건을 걸어주어야 했습니다.
    //구글 검색한 글을 보니 boolean 형태 배열을 만들어 true로 바꾸는 방식을 선택했더라구요
    //그러면 조건을 따로 걸어주지 않아도 돼 좋은 방법이라는 생각이 들었습니다!
    
		System.out.println(sum);

	}

}
