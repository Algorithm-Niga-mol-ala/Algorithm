function solution(n, words) {
    // [x, y]가 결과라고 볼 때, x에 걸린 사람의 번호, y에 몇 번째인지
    for (let i = 1; i < words.length; i++) {

        // 끝 단어와 시작 단어가 달라 끝말잇기가 되지 않는 경우
        if (words[i - 1].charAt(words[i - 1].length - 1) !== words[i].charAt(0)) {
            return [(i % n) + 1, Math.floor(i / n) + 1];
        }

        // 단어가 중복된 경우
        if (words.indexOf(words[i]) !== i) {
            return [(i % n) + 1, Math.floor(i / n) + 1];
        }
    }

    return [0, 0];
}
