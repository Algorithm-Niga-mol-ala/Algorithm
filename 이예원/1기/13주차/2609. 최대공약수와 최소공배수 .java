
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2609_최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {

        /*
        유클리드 호제법
        - 최대 공약수 : 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면, (단 a>b)
        a와 b의 최대공약수는 b와 r의 최대 공약수와 같다. 이 성질에 따라 b를 r로 나눈 나머지를 구하고,
        ... 이 과정을 반복해서 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수

        - 최소 공배수 : a = Gx, b = Gy 일 때 a*b = GGxy이고 G는 두 수의 최대 공약수이며 x와 y는 서로소.
        L = lcm(a,b) = a * b / gcd(a,b)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(gcd(a,b) + "\n" + lcm(a, b));


    }//main

    static int gcd(int a, int b){

        while(b>0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;

    }//gcd

    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
