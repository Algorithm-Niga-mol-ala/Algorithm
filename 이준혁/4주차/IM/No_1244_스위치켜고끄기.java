import java.util.Scanner;

public class No_1244_스위치켜고끄기 {

	public static void main(String[] args) {
		// 1부터 연속적으로 번호가 붙어있는 스위치들
		// 1은 켜짐 , 0은 꺼짐
		// 남학생은 스위치 번호가 자기가 받은 수의 배수이면 스위치의 상태를 바꾼다
		// 여학생은 받은 수와 같은 번호 스위치 중심으로 좌우가 대칭, 가장 많은 스위치 포함하는 구간, 모두 바꿈, (홀수)
		
		// 첫째 줄 스위치 개수
		// 둘째 줄 스위치 상태
		// 셋째 줄 학생수
		// 넷째 줄 성별 (남자 1 여자2) , 받은 수
		
		Scanner sc = new Scanner(System.in);
		
		int switNum = sc.nextInt(); // 스위치의 개수
		
		int[] switStat = new int[switNum]; // 스위치의 상태 1차원 배열로 받음
		
		for (int i=0; i<switNum; i++) {
			switStat[i] = sc.nextInt(); // 스위치의 상태 ( 1, 0 ) 값들을 배열에 받아준다.
		}
		
		int stuNum = sc.nextInt(); // 학생들의 수
		
		for (int i=0; i<stuNum; i++) {
			int gender = sc.nextInt(); // 성별 ( 남자1, 여자2 )
			int stuSwitNum = sc.nextInt(); // 각 학생이 받은 번호
			
			// 남자일 때,
			if ( gender == 1) {
				// 배수들의 스위치 변경
				
				int cnt = 1; // 배수 초기값 ( cnt를 높여서 배수를 조절 )
				int r = stuSwitNum * cnt; // 배수를 만들어준다. 바깥에서 정의한 이유는 while문의 조건에서 쓰고싶어서
				
				while ( r <= switNum ) { // 저장된 배수의 값이 스위치의 개수보다 적을 때까지 ( r이 스위치 배열의 크기를 넘으면 배열이 터진다 )
					
					r = stuSwitNum * cnt; // 다시 재할당 한 이유는 cnt의 값은 루프를 돌며 증가되었지만, 위에 r에서는 cnt가 담기지 못하기에 배수가 적용된 값을 사용하고 싶었다.

          // r-1인 이유는 인덱스는 실제 위치보다 하나 작기에
					if ( r-1 < switNum ) { // 인덱스 터지는 거 방지
            // 1, 0을 바꿔주는 스왑
						if ( switStat[r-1] == 1 ) { 
							switStat[r-1] = 0;
						} else if ( switStat[r-1] == 0 ) {
							switStat[r-1] = 1;
						}
					}
					cnt++; // 배수 증가
				}
				
			} else if ( gender == 2 ) { // 여자일 때,
				// 좌우 탐색하여 같은거 안나올때까지
				
				// 본인부터 1, 0 스왑 진행
				if ( switStat[stuSwitNum-1] == 1 ) {
					switStat[stuSwitNum-1] = 0;
				} else if ( switStat[stuSwitNum-1] == 0 ) {
					switStat[stuSwitNum-1] = 1;
				}
				
				int left = 1; // 왼쪽 방향 카운터
				int right = 1; // 오른쪽 방향 카운터
				
				// 좌 우 같으면 반복 ( 함수명을 잘못지어서 외계어같다 )
        // 첫 번째 조건 : 본인 항에서 left를 뺀 값 ( 인덱스 -1 ) 이 0보다 크거나 같을 때 ( 인덱스 터짐 방지 )
        // 두 번째 조건 : 본인 항에서 rigth를 더한 값 ( 인덱스 -1 ) 이 스위치 배열의 크기보다 작을 때 ( 인덱스 터짐 방지 )
        // 세 번째 조건 : 본인의 항에서 left를 빼고, rigth를 더한 값 ( 인덱스 -1 )이 같을 때
				while ( stuSwitNum-left-1 >=0 && stuSwitNum+right-1 < switNum && switStat[stuSwitNum-left-1] == switStat[stuSwitNum+right-1] ) {

          // 결국 왼쪽 스왑 진행하라는 뜻
					if ( switStat[stuSwitNum-left-1] == 1 ) {
						switStat[stuSwitNum-left-1] = 0;
					} else if ( switStat[stuSwitNum-left-1] == 0 ) {
						switStat[stuSwitNum-left-1] = 1;
					} else {
						break;
					}

          // 결국 오른쪽 스왑하라는 뜻
					if ( switStat[stuSwitNum+right-1] == 1 ) {
						switStat[stuSwitNum+right-1] = 0;
					} else if ( switStat[stuSwitNum+right-1] == 0 ) {
						switStat[stuSwitNum+right-1] = 1;
					} else {
						break;
					}

          // 반복문 돌 때마다 왼쪽 오른쪽으로 한 칸씩 이동하여 검사 진행
					left++;
					right++;
				}
			}
		}
    
		int enter = 0; // enter를 카운터로 받아서 개행해주기 위해 선언

    // 출력문
		for (int j=0; j<switNum; j++) {
			System.out.print(switStat[j]+" "); 
			enter++; // 출력되는 하나마다 enter 카운터 증가
			if ( enter % 20 == 0 ) { // 20개씩만 출력하기를 원했으므로 enter가 20의 배수일 때,
				System.out.println(); // 개행
			}
		}
	}
}
