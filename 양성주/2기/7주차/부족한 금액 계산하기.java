class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long res = 0;
        for(int i=1;i<=count;i++){
            res += price*i;
        }
        if(res <= money){
            answer = 0;
        }else{
            answer = res - money;
        }
        return answer;
    }
}
