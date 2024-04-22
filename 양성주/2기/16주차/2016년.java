class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int days = b-1;
        for(int i=1;i<a;i++){
            if(i==2){
                days += 29;
            }else if(i==4||i==6||i==9||i==11){
                days += 30;
            }else{
                days += 31;
            }
        }
        answer = week[days%7];
        return answer;
    }
}
