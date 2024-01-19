function solution(n) {
    // JadenCase는 모든 단어의 첫 문자가 대문자
    // 그 외에는 소문자
    // 첫문자 알파벳 아닐 때는 소문자로
    let result = '';

    // toLowerCase로 모든 문자를 소문자로 변경
    result = n.toLowerCase();

    // String type의 경우 replace()를 이용해 문자열을 변경할 수 있다.
    // 정규식 /[a-z]/는 소문자를 특정한다
    // \b는 문자의 시작부분을 정의
    // g는 정규표현식의 플래그로, 일치하는 패턴을 모두 변환
    // toUpperCase()를 이용하여 해당되는 모든 문자를 대문자로 변경
    
    result = result.replace(/\b[a-z]/g, char => char.toUpperCase());

    return result;
}
