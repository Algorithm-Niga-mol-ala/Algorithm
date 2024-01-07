import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
		/*
		 * 아스키 코드 값을 이용하여 풀어봤습니다.
		 * 65~90가 'A' ~ 'Z' 이고
		 * 97~122가 'a' ~ 'z' 인 것을 참고하여
		 * -90 을 했을 때에 0보다 작거나 같으면, 대문자이기 때문에 +32 를 해주어 소문자로
		 * 아닐 경우엔 -32 를 해주어 대문자로 바꿔줬습니다.
		 */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] arr = new char[str.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
            
            if(arr[i] - 90 <= 0) {
                arr[i] += 32;
            } else {
                arr[i] -= 32;
            }
            System.out.print(arr[i]);
        }
    }
}