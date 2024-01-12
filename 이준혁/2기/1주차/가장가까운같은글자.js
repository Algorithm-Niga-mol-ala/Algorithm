function solution(s) {
    let result = []; // 결과값을 저장할 배열
    let tmp = [];
    
    for (let i=0; i<s.length; i++) {
        if (!tmp.includes(s[i])) { // includes -> 문자열이 특정 문자열을 포함하는지 검사, tmp은 if문 검사 이전까지의 저장만 포함하므로 초기에는 값이 없어 true
            result.push(-1); // 앞에 동일 문자가 포함되지 않았으므로 결과값 배열에 -1 추가
            tmp.push(s[i]); // s[i]를 push하여 중복값 위치 저장
        } else if (tmp.includes(s[i])) { // 특정 문자열이 포함되있는 경우에는
            result.push(i-tmp.lastIndexOf(s[i])); // lastindexOf -> 뒤에서부터 s[i]를 포함하는 데이터의 인덱스를 찾기에, i에서 빼주면 가장 가까운 거리 정도를 표시할 수 있따.
            tmp.push(s[i]); // s[i]를 push하여 중복값 위치 저장
        }
    }
    
    return result;
}
