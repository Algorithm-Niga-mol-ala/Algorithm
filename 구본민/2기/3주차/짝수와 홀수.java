class Solution {
    public String solution(int num) {
        String answer = "";
        num = Math.abs(num);
        if(num%2==1) answer = "Odd";
        else answer = "Even";
        return answer;
    }
}
