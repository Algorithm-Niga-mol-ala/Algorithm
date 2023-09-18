import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int[] arr = new int[L];
		for(int i = 0; i < L; i++) {
			arr[i] = sc.nextInt();
		}
		int N = sc.nextInt(); //N을 포함하는 좋은 구간의 개수를 출력해야 한다.
		int cnt = 0;
		
		int st = 0; //st < N < ed를 찾기 위해 변수 설정
		int ed = 0;
		
		boolean isSame = false;
		
		Arrays.sort(arr); //일단 정렬
		
		for(int i = 0; i < N; i++) {
			if(N == arr[i]) { //N이 어느 요소랑 같으면 cnt는 0.
				isSame = true;
				break;
			}

			if(N < arr[i]) { 
				ed = arr[i];
				break;
			}
			st = arr[i];  //st < N < ed를 만족하는 값을 찾았다!

		}
		
		if(!isSame) { //N이 어느 요소랑 일치하지 않는다는 보장 하에,
			for(int i = 0; i < N - st - 1; i++) { 
        //st+1 ~ N, st+1 ~ N+1, ..............st+1 ~ ed-1
        //st+2 ~ N, st+2 ~ N+1, ..st+2 ~ ed-1
        //st+3 ~ N, st+3 ~ N+1, ..
        //...
        //N-1 ~ N, .. N-1 ~ ed-1
				cnt += ed - N;
			}

			cnt += ed - N - 1; //N ~ N+1, N ~ N+2, N ~ N+3, ... N ~ ed-1
		}
		
		System.out.println(cnt);

	}

}
