package algo;

import java.util.Scanner;

public class bj_11729 {
	
	//https://st-lab.tistory.com/96 참고
	//하노이탑 시뮬레이터 : https://www.mathsisfun.com/games/towerofhanoi.html
	
	public static int N;
	public static StringBuilder sb = new StringBuilder();
	public static int cnt;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		hanoi(N, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(sb);
	}
	
	//hanoi -> N개를 from에서부터 to로 옮긴다. (mid는 보조기둥이다)
	public static void hanoi(int N, int from, int mid, int to) {
		cnt++;
		if(N == 1) { //이동해야할 원판이 1개가 되면
			sb.append(from + " " + to + "\n"); //이동했다는 것을 출력
			return; //리턴
		}
	
		// STEP 1 : N-1개를 A에서 보조기둥으로 이동
		hanoi(N-1, from, to, mid);
		//start 지점의 가장 아래 있는 큰 원판이 목표 기둥으로 제일 먼저 가야하기 때문에, 
		//가장 아래 있는 큰 원판을 제외한 그 위에 있는 N-1개의 원판을 보조 기둥(mid)으로 옮긴다.

		
		// STEP 2 : 1개를 A에서 목표 기둥으로 이동 
		sb.append(from + " " + to + "\n");	
		// 스텝1이 끝났다는 것은 N-1개의 원판이 모두 보조기둥으로 이동했음을 의미한다.
		// 이제 가장 큰 원판이 있는 from에서 to로 옮겨준다.

		
		// STEP 3 : N-1개를 보조기둥에서 C로 이동
		hanoi(N-1, mid, from, to);
		// 보조기둥으로 옮겨주었던 N-1개의 원판을 to지점으로 옮긴다.)

	}

}
