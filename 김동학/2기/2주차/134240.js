
function solution(food) {
  let answer = "";
  for (let i = 1; i < food.length; i++) {
    answer += i.toString().repeat(food[i]/2);
  }
    let revAnswer = reverse(answer);
    answer += (0).toString();
    answer += revAnswer;
  return answer;
}
function reverse(str){
    return str.split('').reverse().join('');
}
