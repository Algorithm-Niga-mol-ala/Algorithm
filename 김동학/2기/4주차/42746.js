function solution(numbers) {
    var answer = '';
    // 각 원소의 가장큰자리수 값만 비교해서 정렬하면 되는거아닌가 + 같은경우 9, 9000 이면 9가 더 앞으로와야됨.
    // 91, 92면? 92가 앞으로와야됨. 즉 우선순위 = 가장앞자리가 큰거 > 길이가 짧은거 > 다음자리수가 큰거.
    numbers.sort((a, b) => {
        const res = 0;
        const lena = 10 ** (a.toString().length - 1);
        const lenb = 10 ** (b.toString().length - 1);
        if(a%lena > b%lenb)
            res = 1;
        else if(a%lena < b%lenb)
            res = -1;
        else {
            if(lena < lenb)
                res = 1;
            else if(lena > lenb)
                res = -1;
            else { // 길이마저 같다면 다음자리수를 비교. -> 반복
                
            }
        }
            

        return res;
    }).forEach((element) => {answer += element.toString()})
    return answer;
}
