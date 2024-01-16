import java.util.*;

public class Solution {
    public int solution(int n) {
        //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        //정수형 n의 범위 : 100,000,000 이하의 자연수
        //정답이 담길 answer에 선언 및 대입
        int answer = 0;
        String numStr = String.valueOf(n);          //정수형 n을 문자열로 만들고 numStr에 대입
        String[] num = numStr.split("");            //문자열 numStr을 한글자씩 잘라서 num 문자열 배열에 대입
        for(int i=0;i<num.length;i++){              //num 배열 길이 만큼 반복문 진행
            answer += Integer.parseInt(num[i]);     //answer에 하나씩 정수형으로 돌려서 더해주기
        }
        return answer;
    }
}
