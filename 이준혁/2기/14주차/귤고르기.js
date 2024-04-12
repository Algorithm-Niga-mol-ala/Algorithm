function solution(k, tangerine) {
    // 귤 k개민 고를거임
    // 크기별로 분류 (종류가 가장 적게)
    let answer = 0;

    // 배열의 최대값을 정의해서 크기를 정해주기 위해 귤을 오름차순으로 정렬해서 최대값을 구했다.
    // 그런데 지나고 생각해보니 Sort 안하고 Math.max같은걸로 구했어도 되지 않을까 싶긴하다.
    tangerine.sort((a,b) => (a-b));

    let arr = []; // 빈 배열 선언

    arr.length = tangerine[tangerine.length - 1]+1; // 배열 크기 정의 (가장 큰 숫자의 귤보다 1 큰 사이즈 정의하여 1번부터 사용할 수 있게)

    arr.fill(0); // 배열에 0을 모두 넣어준다.

    for (let i = 0; i < tangerine.length; i++) {
        arr[tangerine[i]]++; // 각 귤 크기마다 개수를 카운팅해준다.
    }

    arr.sort((a, b) => (b - a)); // 해당 배열을 내림차순으로 정렬하여 높은 순서대로

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 0) { // 만약 0개인 귤이 있으면 카운팅이 될 필요가 없으므로
            return answer; // 결과를 출력
        }

        k = k - arr[i]; // 전체 귤 개수에서 가장 많은 개수를 가진 귤인 arr[i]를 빼서 남은 필요한 귤 수를 저장
        answer++; // arr[i] 자체는 1개의 귤 종류이기에 귤 종류를 카운트

        if (k <= 0) { // 만약 원하는 k개 이상의 귤을 모두 구했다면
            return answer; // 결과를 출력
        }
    }
    return answer;
}
