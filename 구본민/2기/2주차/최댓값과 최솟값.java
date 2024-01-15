import java.util.*;

// 알고리즘 문제
// 왕주석 사이가 programmers에 적히는 코드
///////////////////////////////////////////////////////
class Solution {
    public String solution(String s) {                   //문자열 s에 빈칸이 있는 숫자들이 입력
        String answer = "";                              //리턴될 정답은 문자열
        String[] arrNum = s.split(" ");                  //빈칸인 것을 빼고 정수만 배열에 저장
        int num = 0;                                     //정수 num
        int min = Integer.MAX_VALUE;                     //최솟값 정수 min은 정수 중 가장 큰 값으로 대입
        int max = Integer.MIN_VALUE;                     //최댓값 정수 max는 정수 중 가장 작은 값으로 대입
//        System.out.println(Arrays.toString(arrNum));
        for(int i=0;i< arrNum.length;i++){               //arrNum 배열 길이만큼 반복문 돌리기
            num = Integer.parseInt(arrNum[i]);           //해당 인덱스에 있는 문자열 요소를 숫자로 바꿔서 대입
            if(min > num) min = num;                     //비교 후 최솟값 갱신
            if(max < num) max = num;                     //비교 후 최댓값 갱신
        }
//        System.out.println(min+"   "+max);

        answer = String.valueOf(min+" "+max);            //문자열 answer에 정수형을 문자열로 바꿔 대입
        return answer;
    }
}
/////////////////////////////////////////////////////////


//Main 클래스에서 Solution클래스 선언해주기
public class Main {
    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴

        s.solution("1 2 3 4");                          //"1 2 3 4" 입력되면 "1 4"로 출력됨
    }
}
