
public class flag에따라다른값반환하기 {

}

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(flag) {			// true 면 a+b
            answer = a+b;
        } else {			// false 면 a-b
            answer = a-b;
        }
        return answer;
    }
}