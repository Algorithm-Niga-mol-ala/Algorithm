import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        /*입력
         * 
         * tc T
         * 버스노선의 개수 N
         * N개의 줄 동안 N번 버스가 다니는 정류장의 범위
         * 버스정류장의 개수 P
         * P개의 줄 동안 카운트 된 값을 출력할 C번의 버스정류장 번호
         * 
         */
         
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt(); //tc
         
        for(int tc = 1; tc <= T; tc++) {
             
            int[] busStop = new int[5001]; //5000개의 버스정류장
             
            int N = sc.nextInt(); //버스 노선의 개수
             
            for(int i = 0; i < N; i++) {
                 
                int start = sc.nextInt(); //N번 버스가 다니는 정류장 범위 시작
                int end = sc.nextInt(); //정류장 범위 끝
                 
                for(int j = start; j <= end; j++) {
                    busStop[j]++;
                } //범위 안에서 값을 하나씩 늘려줌
            }//N개의 버스가 다니는 정류장 카운팅
             
            int P = sc.nextInt(); //값을 출력할 버스 정류장의 개수
             
             
            System.out.print("#" + tc + " ");
            for(int i = 0; i < P; i++) {
                int num = sc.nextInt(); //값을 볼 버스정류장 번호
                System.out.print(busStop[num] + " ");
            }
                        System.out.println();
             
        } //tc
         
    }//main
 
}
