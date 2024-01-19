function solution(s) {
    let result = '';
    
    let tmp = s.split(' '); // 공백을 기준으로 잘라서 배열로 만들어준다.
    
    // js는 문자열로 생각하고 유니코드 기준으로 정렬하는 경향이 있다.
    // 아래와 같이 함수를 만들어 리턴하거나
    // tmp.sort((a, b) => a - b) 같은 화살표 함수를 이용
    // a>b라면 양수가, a<b라면 음수가, a==b라면 0이 리턴된다.
    tmp.sort(function (a, b) {
        return a - b;
    });

    result += tmp[0]; // 정렬 이후 가장 작은 값과
    result += ' '; // 공백
    result += tmp[tmp.length - 1]; // 인덱스 마지막 값을 순차적으로 붙여준다.

    return result;
}
