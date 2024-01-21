function solution(name, yearning, photo) {
    var answer = [];
    let tmp = 0;
    for(let i = 0; i<photo.length; i++){
        answer[i] = 0;
        for(let j = 0; j<photo[i].length; j++){
            tmp = name.indexOf(photo[i][j]);
            if(tmp != -1)
                answer[i] += yearning[tmp];
        }
    }
    return answer;
}
