
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//첫째줄에 좌석 수
		//둘째줄에 좌석의 정보
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String seat = sc.next(); 
		
		int cnt = 1; // 맨 오른쪽에 무조건 홀더가 있으니까 카운트 1로 시작

    //알파벳들은 왼쪽에 컵홀더를 달고 나온다고 가정, 뒤에 나오는 L빼고
		for(int i = 0; i < N; i++) {
			
			if(seat.charAt(i) == 'S') { //String을 하나씩 빼서 비교하면서 S가 나오면 cnt++
				cnt++; 
				
			}else { //L이 나오면 cnt++ 하고 다음 L에는 홀더가 없으니까 i++
				cnt++;
				i++;
			}
		}
		
		if(cnt > N) { //사람수보다 컵홀더 수가 많으면 모든 사람이 컵홀더 사용 가능
			System.out.println(N); 
		}else {
			System.out.println(cnt);
		}
		

	}

}
