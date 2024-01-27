
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
            int mid = s.length()/2;
            answer = s.substring(mid-1, mid+1);
        }else{
            int mid = s.length()/2;
            answer = s.substring(mid,mid+1);
        }
        return answer;
    }
}
