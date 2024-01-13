
public class 문자열섞기 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("aaaaa", "bbbbb"));
	}
}

/*
 * 2개의 인자가 같은 크기이기 때문에 반복문을 통해 하나씩 넣어주면 되는 문제
 */
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        
        return answer;
    }
}