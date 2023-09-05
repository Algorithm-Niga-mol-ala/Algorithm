package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_24051_알고리즘수업_삽입정렬1 {
    // 삽입정렬로 배열 A를 오름차순 정렬하고
    // 배열 A에 K번째 저장되는 수를 구하기

    // 입력
    // 첫째 줄에 배열 A의 크기 N, 저장횟수 K
    // 다음 줄에 배열 A원소 N개

    // 출력
    // K번째 저장되는 수를 출력, 저장 횟수가 K보다 작으면 -1 출력

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열의 크기
        int K = sc.nextInt(); // 저장 횟수

        int[] A = new int[N]; // 배열 A생성

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        } // 배열 원소 값 입력

        // 삽입정렬 구현

        int cnt = 0;
        int newItem = 0;

        for (int i = 1; i < N; i++) {
            // 맨 첫번째 요소는 정렬 완, 두번째 요소부터 비교

            newItem = A[i]; // 이번에 정렬할 값
            // 정렬할 데이터들을 밀어버리고 넣으니까 변수에 저장해두ㄱㅣ

            int j;
            for (j = i - 1; j >= 0 && newItem < A[j]; j--) {
                A[j + 1] = A[j];
                cnt++;
            } // 넣을 위치 찾고 뒤로 미는 작업까지

            A[j + 1] = newItem;

        } // 삽입정렬 구현
        if (cnt == K) {
            System.out.println(newItem);
        } else if(cnt < K) {
            System.out.println(-1);
        }

    }// main

}
