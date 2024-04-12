function solution(cards1, cards2, goal) {
    let answer = '';

    // 1)
    for(let i=0; i< goal.length; i++) {
        // 2)
        if(cards1[0] == goal[i]) {
            cards1.shift();
            continue
        }
        // 2)
        else if(cards2[0] == goal[i]) {
            cards2.shift();
            continue
        }
        // 3)
        else {
            return "No"
        }
    }

    return "Yes"
}
