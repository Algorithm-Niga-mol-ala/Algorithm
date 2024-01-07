import java.util.Scanner;

// !! 백준 제출할 때는 Main으로 바꾸기
public class No_13300_방배정 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드 입력을 위한 스캐너

		int stn = sc.nextInt(); // 첫째줄의 총 학생수 입력받기

		int rs = sc.nextInt(); // 첫째줄 방에 들어갈 수 있는 인원 수 입력받기

		int starr[] = new int[12]; // 12칸의 배열을 선언해 학생들을 분류
		
		for (int i = 0; i < stn; i++) { // 학생들을 starr 배열에 의해 학년과 성별로 분류한다.
			int gender = sc.nextInt(); // 성별 입력받기 ( 0이면 여자, 1이면 남자 )
			int grade = sc.nextInt(); // 학년 입력받기 ( 1~6학년 )

			switch (grade) { // switch문의 case는 학년으로 나눔
			case 1:
				if (gender == 0) { // 학년에서 gender의 값으로 성별을 나눔
					starr[0]++;
					break;
				} else if (gender == 1) {
					starr[6]++;
					break;
				}
			case 2:
				if (gender == 0) {
					starr[1]++;
					break;
				} else if (gender == 1) {
					starr[7]++;
					break;
				}
			case 3:
				if (gender == 0) {
					starr[2]++;
					break;
				} else if (gender == 1) {
					starr[8]++;
					break;
				}
			case 4:
				if (gender == 0) {
					starr[3]++;
					break;
				} else if (gender == 1) {
					starr[9]++;
					break;
				}
			case 5:
				if (gender == 0) {
					starr[4]++;
					break;
				} else if (gender == 1) {
					starr[10]++;
					break;
				}
			case 6:
				if (gender == 0) {
					starr[5]++;
					break;
				} else if (gender == 1) {
					starr[11]++;
					break;
				}
			default:
				System.out.println("오류");
				break;
			}
		}
		
		int res = 0; // 총 필요한 방의 수 res 정의
		
		for (int i=0; i<12; i++) { // 12칸의 배열에서 몇개의 방에 담을 것인가
			if (starr[i] != 0) { // 학생이 0명인 경우에는 방이 필요없으므로 조건문 실행 x
				if((starr[i] % rs)==0) { // 분류한 인원 수를 방 인원으로 나눈 나머지가 0이면 방 칸과 딱 맞는 인원이므로
					res += (starr[i] / rs); // 총 원 / 입실가능수를 res에 더한다.
				} else {
					res += (starr[i]/ rs)+1; // 그렇지 않을 경우, 방이 한 칸 더 필요하므로 1을 추가로 더해준다.
				}
			}
		}
		System.out.println(res); // 결과값 출력
	}
}
