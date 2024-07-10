import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] check = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int no = sc.nextInt();

            check[no - 1] = true;

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 30; i++) {
            if (!check[i]) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);

    }

}
