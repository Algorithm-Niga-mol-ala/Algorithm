import java.util.*;

/*
 *  두 배열의 길이가 동일
 *  두 배열에서 하나씩 idx를 뽑아서 곱하고, 나머지 idx들도 곱헤서 누적합을 뽑는데
 *  누적합이 최솟값이어야 함
 *  둘 다 정렬을 시키고 하나는 최솟값을, 하나는 최댓값을 뽑아가며 곱해서 누적합을 구하면
 *  최솟값을 뽑을 수 있음
 */
class 최솟값만들기
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);	// 배열 오름차순 정렬
        Arrays.sort(B); // 배열 오름차순 정렬
        
        for(int i = 0; i < A.length; i++) {
            answer += (A[i] * B[A.length - i - 1]);	//제일 작은 값 * 제일 큰 값 으로 누적합 진행
        }
        
        return answer;
    }
}