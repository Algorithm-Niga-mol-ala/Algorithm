function solution(ingredient) {
    var answer = 0;
    let flag = 0;
    for (let i = 0; i <ingredient.length; i++){  
        if(i+3 < ingredient.length && ingredient[i] === 1 && ingredient[i+1] === 2 && ingredient[i+2] ===3 && ingredient[i+3] === 1){
                ingredient.splice(i,4);
                answer++;
                i -= 4; // 최대 4개전까지만 인덱스를 앞으로 당기면 된다. 
        }
    }
    return answer;
}
