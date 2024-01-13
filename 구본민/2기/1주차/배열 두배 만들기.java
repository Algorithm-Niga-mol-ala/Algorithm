class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; //answer 배열을 numbers 배열의 길이만큼 생성
        for(int i=0;i<numbers.length;i++){      //길이만큼 반복 돌리기
            answer[i] = 2*numbers[i];           //배열 요소들을 두 배로 만들자
        }
        return answer;
    }
}
