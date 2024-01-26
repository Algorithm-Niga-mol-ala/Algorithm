function solution(numbers) {
  let result = "";

  let tmp = []; // 임시 배열

  for (let i of numbers) {
    // numbers의 길이만큼 반복
    tmp.push(i.toString()); // 문자열로 바꾸어 저장해준다.
  }

  tmp.sort((a, b) => { // 문자열에서 숫자를 더하면 붙어나오는 글이 되기에
    return b + a - (a + b); // ba - ab같은 형식으로 sort를 진행
  }); // 결과적으로 두 글자에서 가장 큰 값의 형식을 따른다.

  // 만약 가장 큰 값이 0이라면 뒤에도 다 0일 것이므로 0으로 출력
  // 다른 경우에는 tmp에 정렬된 값을 모두 join으로 붙여준다.
  result = tmp[0] == "0" ? "0" : tmp.join("");

  return result;
}
