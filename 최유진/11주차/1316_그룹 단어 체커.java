package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bj_1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            String[] str = sc.next().split("");
            ArrayList<String> list = new ArrayList<>();

            boolean isGroupWord = true;
            String checking = str[0];

            for(int j = 1; j < str.length; j++) {
                if(!checking.equals(str[j])) { //지금까지 체크하고 있던 문자와 다르다면,

                    if(list.contains(str[j])) { //리스트에 있는 문자라면. 
                        isGroupWord = false; //그룹 단어가 아니다.
                        break;
                    } 

                    list.add(checking); //체크하고 있던 문자를 리스트에 넣고,
                    checking = str[j]; //checking을 새로운 문자로 업데이트해준다.
                }
            }

            if(isGroupWord) cnt++;

        }

        System.out.println(cnt);

    }

}
