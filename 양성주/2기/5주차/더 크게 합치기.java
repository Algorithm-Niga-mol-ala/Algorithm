class Solution {
    public int solution(int a, int b) {
        String sa = a+""+b;
        String sb = b+""+a;
        
        int answer = 0;
        
        if(Integer.parseInt(sa)>Integer.parseInt(sb)){
            answer = Integer.parseInt(sa);
        }else answer = Integer.parseInt(sb);
        
        return answer;
    }
}
