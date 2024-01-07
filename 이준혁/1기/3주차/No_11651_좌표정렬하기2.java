import java.util.Arrays;
import java.util.Scanner;

public class No_11651_좌표정렬하기2 {

	public static void main(String[] args) {
		// 2차원 평면 위의 점 n개가 주어진다.
		// y좌표가 증가하되, y좌표가 같은 경우 x좌표가 증가하는 순서
		// 안정정렬 방식을 택하면 x좌표 -> y좌표순으로 정렬했을 때,
		// 1차키 2차키 모두 정렬된 것을 확인 가능할 것이다.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for (int i=0; i<N; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		
		// 직접 버블정렬 구현 후, 같은 경우 x만 정렬해줬으나 시간초과 
//		for (int i=0; i<N; i++) {
//			for (int j=0; j<N-1; j++) {
//				if ( arr[j][1] > arr[j+1][1] ) {
//					int tmp = arr[j][1];
//					arr[j][1] = arr[j+1][1];
//					arr[j+1][1] = tmp;
//					
//					int tmp2 = arr[j][0];
//					arr[j][0] = arr[j+1][0];
//					arr[j+1][0] = tmp2;
//				}
//				
//				if ( arr[j][1] == arr[j+1][1] ) {
//					if ( arr[j][0] > arr[j+1][0] ) {
//						int tmp = arr[j][0];
//						arr[j][0] = arr[j+1][0];
//						arr[j+1][0] = tmp;
//					}
//				}
//			}
//		}
		
		// compare, 객체 비교를 위한 인터페이스 
		// -> 같은 방식의 람다식을 활용해주면 함수처럼 사용 가능 
		Arrays.sort(arr, (e1, e2) -> {
			if ( e1[0] == e2[0] ) {
				return e1[1] - e2[1];
			} else {
//				System.out.println(e1[0]+" "+e2[0]);
				return e1[0] - e2[0];
			}
		});

		for (int i=0; i<N; i++) {
			System.out.println(arr[i][1]+" "+arr[i][0]);
		}
	}
}
