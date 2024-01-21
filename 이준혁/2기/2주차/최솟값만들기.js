function solution(A,B){
    let result = 0;
    
    // 작은 수 * 큰 수의 합이 최솟값이 된다.
    // 그러므로 A는 오름차순, B는 내림차순 정렬한다.
    A.sort((a,b) => (a-b)); 
    B.sort((a,b) => (b-a));
    
    for (let i = 0; i < A.length; i++) { // 배열의 길이만큼
        result += A[i] * B[i]; // 그 두 값을 곱한걸 모두 더해준다.
    }

    return result;
}
