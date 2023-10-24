import java.util.Scanner;

public class No_3613_JavavsCpp {

	public static void main(String[] args) {
		// 일단 _가 들어간 입력에는 대문자가 들어가면 Error
		// 반대로 대문자가 들어간 입력에는 _가 들어가면 Error
    // 그 외에도 고려해야하는 Error가 많더라..
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.next();

		char[] arr = tmp.toCharArray(); // 아스키코드로 읽어주기 위해 받은 문자열을 char 배열로 잘라준다.
		
		int java = 0; // 0이 아닌 경우, 자바 언어로 바꿔줘야함
		int cpp = 0; // 0이 아닌 경우, c++로 바꿔줘야함
		int err = 0; // 0이 아닌 경우, 오류메세지 출력
		
		for (int i=0; i<arr.length; i++) {
			if (arr[0] >= 65 && arr[0] <=90) { // 첫글자가 대문자인 경우,
				err++;
			} else if (arr[0] == 95 || arr[arr.length-1] == 95) { // _가 처음 혹은 마지막일 때,
				err++;
			}
			
			if (arr[i] >= 65 && arr[i] <=90) { // 대문자일 때(자바),
				cpp++;
			} else if (arr[i] == 95) { // _가 있을 때 (c++)
				java++;
				
				if (i+1 < arr.length) { // 아래의 i+1 인덱스 터지는 것 방지
					if (arr[i] == arr[i+1]) { // _가 두 번 연속 나와 단어구분이 아닐 때
						err++;
					}
				}
			}
		}
		

    // err가 있는 경우, Error!를 우선적으로 출력
    // java가 0이 아니고 cpp이 0인 경우라면 c++ 언어이므로 java언어로 바꿔서 출력
    // cpp이 0이 아니고 java가 0인 경우라면 java 언어이므로 c++언어로 바꿔서 출력
    // java와 cpp 모두 0이라면, 둘 다 공용으로 이용할 수 있는 방식이므로 그대로 출력
    // 이외에 err에 해당하는 내용은 없지만 java와 cpp이 둘 다 0이 아니라던가 하는 파악할 수 없는 경우도 Error!로 출력해준다.
    
		if (err != 0) { // 첫글자가 대문자인 경우,
			System.out.println("Error!");
		} else if (java != 0 && cpp == 0) {
			// _를 삭제하고, _다음 문자를 대문자로 변경
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == 95) {
					if (i+1<arr.length && arr[i+1] != 95)
						arr[i+1] = (char) (arr[i+1]-32);
				} else {
					System.out.print(arr[i]);
				}
			}	
		} else if (java == 0 && cpp != 0) {
			// 대문자 앞에 _를 붙이고, 대문자를 소문자로 변경
			for (int i=0; i<arr.length; i++) {
				if (arr[i] >= 65 && arr[i] <=90) {
					System.out.print("_");
					System.out.print((char)(arr[i]+32));
				} else {
					System.out.print(arr[i]);
				}
			}	
		} else if (java == 0 && cpp == 0) {
			// 그대로 출력
			for (int i=0; i<arr.length; i++) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.println("Error!");
		}
	}
}
