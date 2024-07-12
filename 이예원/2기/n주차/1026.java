
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String score1 = br.readLine();
        String score2 = br.readLine();

        String[] box1 = score1.split(" ");
        String[] box2 = score2.split(" ");

        int[] newbox1 = new int[N];
        int[] newbox2 = new int[N];

        for (int i = 0; i < N; i++) {
            newbox1[i] = Integer.parseInt(box1[i]);
            newbox2[i] = Integer.parseInt(box2[i]);
        }

        Arrays.sort(newbox1);
        Arrays.sort(newbox2);

        int res = 0;

        for (int i = 0; i < N; i++) {
            int mul = newbox1[i] * newbox2[N - 1 - i];
            res += mul;
        }

        System.out.println(res);

    } //main
} //class
