import java.util.Scanner;

public class No_2477_참외밭 {

	public static void main(String[] args) {
		// 참외밭의 면적에서 참외의 개수를 구하는 문제
		// 6번의 이동을 하므로 동서남북 4개의 기본적인 선과 
		// 2개의 잘려나가는 부위의 선이 존재.
		// 즉, 동-서에서 가장 큰 값 x 남-북에서 가장 큰 값에
		// 동-서에서 가장 작은 값 x 남-북에서 가장 작은 값을 빼고
		// 거기에 면적 당 참외 수를 곱해주면 답이 나올 것이다.
		// 1 동, 2 서, 3 남, 4 북 
		
		Scanner sc = new Scanner(System.in);
		
		int rMax = 1;
		int rMin = 500;
		int cMax = 1;
		int cMin = 500;
		
		int kMelon = sc.nextInt();
		
		int[] leng = new int[6];
		
		int tmp12 = 0;
		int tmp34 = 0;
		
		for (int i=0; i<6; i++) {
			int dir = sc.nextInt();
			leng[i] = sc.nextInt();

			if ( dir == 1 || dir == 2 ) {
				if ( leng[i] > rMax ) {
					rMax = leng[i];
					tmp12 = i;
				}
			} else if ( dir == 3 || dir == 4 ) {
				if ( leng[i] > cMax ) {
					cMax = leng[i];
					tmp34 = i;
				}
			}
		}
		
		int maxIdx = Math.max(tmp12, tmp34);
		int minIdx = Math.min(tmp12, tmp34);
		
		if ( maxIdx <=2 ) {
			rMin = leng[maxIdx+2];
			cMin = leng[maxIdx+3];
		} else if ( maxIdx == 3) {
			rMin = leng[0];
			cMin = leng[5];
		} else if ( maxIdx == 5 && minIdx == 0 ) {
			rMin = leng[maxIdx-2];
			cMin = leng[maxIdx-3];
		} else if ( maxIdx >= 4) {
			rMin = leng[maxIdx-3];
			cMin = leng[maxIdx-4];
		}
		
		int res = (rMax*cMax - rMin*cMin) * kMelon;
		
		System.out.println(res);
	}
}
