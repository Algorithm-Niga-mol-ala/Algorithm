function solution(arr) {
  let answer = [];

  answer[0] = arr[0]; // 초기값은 하나 넣어줘서 인덱스 관리
  for (let i = 1; i < arr.length; i++) { // arr 길이만큼
    if (answer[answer.length - 1] !== arr[i]) { // answer의 마지막 값은 배열의 길이-1로 계산
      answer.push(arr[i]); // 다른 값이 나온 경우에만 push
    }
  }

  return answer;
}
