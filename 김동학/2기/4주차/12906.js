function solution(arr)
{
    var answer = [];
    answer.push(arr[0]);
    for(let i = 1; i<arr.length; i++){
        const temp = answer.pop(answer.length-1);
        if(temp === arr[i])
            answer.push(temp);
        else {
            answer.push(temp);
            answer.push(arr[i]);
        }
            
    }

    return answer;
}
