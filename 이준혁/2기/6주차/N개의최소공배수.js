function solution(arr) {
    // 최소공배수니까 gcd를 이용해서 lcm 유도, 여러 개의 gcd로 구성된 문제다?
    // n-1번 인덱스와 n-2번 인덱스를 비교해서 gcd를 구하고
    // a*b/gcd 공식을 통해 lcm, 최소공배수를 구한다.
    // 0번 인덱스까지 이를 반복해 최종적인 최소공배수 구함

    let result = 0;

    const GCD = (a, b) => {
        while(true) {
            const r = a%b;
            if (r===0) return b;
            
            a = b;
            b = r;
        }
    }

    for (let i=arr.length-1; i>=1; i--) {
        let a = arr[i];
        let b = arr[i-1];

        if (result > a) {
            a = result;
        }

        GCD(a, b);

        result = a*b/GCD(a,b);
    }
    
    return result;
}
