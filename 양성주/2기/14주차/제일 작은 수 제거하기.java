class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length == 1){
        int[] zero = {-1};
            return zero;
        } 
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == minIndex){
                continue;
            }
            answer[index++]=arr[i];
        }
        
        return answer;
    }
}
