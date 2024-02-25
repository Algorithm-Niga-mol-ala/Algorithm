class Solution {
    public int solution(int n) {
        // 재귀 : 시간초과 무조건 남 -> 메모이제이션 用
        // (a+b)modQ = (amodQ+bmodQ)modQ
        long[] fibo = new long[100001];
        fibo[0]=0L;
        fibo[1]=1L;
        for(int i=2; i<n+1; i++) {
            fibo[i]=(fibo[i-1]%1234567+fibo[i-2]%1234567)%1234567;
        }
        return (int) fibo[n];
    }
}
