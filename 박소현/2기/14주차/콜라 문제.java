class Solution {
    public int solution(int a, int b, int n) {
        int minusCola = 0;
        int plusCola = 0;
        int remain=0;
        int answer = 0;
        while(n>=a) {
            minusCola = n/a;
            answer+=minusCola*b;
            plusCola = minusCola*b;
            n = n-minusCola*a+plusCola;
        }
        return answer;
    }
}
