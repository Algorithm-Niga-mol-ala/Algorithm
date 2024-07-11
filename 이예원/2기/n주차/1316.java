import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int res = 0;

        for(int tc = 1; tc <= N; tc++){

            String word = br.readLine();
            int length = word.length();

            char[] originWord = new char[length];
            char[] sortWord = new char[length];

            int originCnt = 1;
            int sortCnt = 1;

            for(int i = 0; i < length; i++){
                originWord[i] = word.charAt(i);
                sortWord[i] = word.charAt(i);

                if (i>0 && originWord[i-1] != originWord[i]){
                    originCnt++;
                }
            }

            Arrays.sort(sortWord);

            for(int i = 1; i < length; i++){
                if(sortWord[i] != sortWord[i-1]){
                    sortCnt++;
                }
            }

            if(originCnt == sortCnt)
                res++;


        }//tc

        System.out.println(res);

    }//main
}
