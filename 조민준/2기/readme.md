**1주차**
---
***int to String***
1. Convert by adding an empty string String str1 = int + "";
2. Integer.toString(int);
3. String.valueOf(int);
4. DecimalFormat

   Ex)
	
 
 	import java.text.DecimalFormat;

	int myNumber = 31415;

	DecimalFormat decimalFormat = new DecimalFormat("#");

	String myNumberAsString = decimalFormat.format(myNumber);

	System.out.println(myNumberAsString);

---

***String to int***
1. Integer.valueOf()
2. Integer.parseInt() << 추천

****why?****
잘못된 정보를 보여줄 수 있음
https://sentry.io/answers/how-do-i-convert-a-string-to-an-int-in-java/ 참조

---

****SQL DATE_FORMAT, 연,월,일 추출****
<br>
날짜 데이터 추출 연도 추출 : YEAR(컬럼명)="####"
<br>
월 추출 : MONTH(컬럼명) = "#"
<br>
일 추출: : DAYOFMONTH(컬럼명) = "#"
<br>
날짜 차이(A 날짜에서 B 날짜를 빼는 것) : DATEDIFF(A,B)
<br>
오늘 날짜 추출 : CURDATE()
<br>
####-##-## 출력 함수 :date_format(날짜, '%Y-%m-%d');
<br>
##-##-## 출력 함수 : date_format(날짜, '%y-%m-%d');
<br>
---

***JOIN 문법***
📌JOIN 5줄 요약
<br><br>
**조인은 두 개의 테이블을 서로 묶어서 하나의 결과를 만들어 내는 것을 말한다.**
- INNER JOIN(내부 조인)은 두 테이블을 조인할 때, 두 테이블에 모두 지정한 열의 데이터가 있어야 한다.
- OUTER JOIN(외부 조인)은 두 테이블을 조인할 때, 1개의 테이블에만 데이터가 있어도 결과가 나온다.
- CROSS JOIN(상호 조인)은 한쪽 테이블의 모든 행과 다른 쪽 테이블의 모든 행을 조인하는 기능이다.
- SELF JOIN(자체 조인)은 자신이 자신과 조인한다는 의미로, 1개의 테이블을 사용한다.
<br>

****Inner Join****
<br>
두 테이블을 연결할 때 가장 많이 사용하는  것이 내부 조인입니다. 그냥 조인이라고 부르면 내부 조인을 의미합니다.
<br>
```
SELECT <열 목록>
FROM <첫 번째 테이블>
    INNER JOIN <두 번째 테이블>
    ON <조인 조건>
[WHERE 검색 조건]

#INNER JOIN을 JOIN이라고만 써도 INNER JOIN으로 인식합니다.
```
<br>

****Outer Join****
<br>
내부 조인은 두 테이블에 모두 데이터가 있어야만 결과가 나오지만, 외부 조인은 한쪽에만 데이터가 있어도 결과가 나옵니다.
<br>
<br>
****Outer Join의 종류****
- LEFT OUTER JOIN: 왼쪽 테이블의 모든 값이 출력되는 조인
- RIGHT OUTER JOIN: 오른쪽 테이블의 모든 값이 출력되는 조인
- FULL OUTER JOIN: 왼쪽 또는 오른쪽 테이블의 모든 값이 출력되는 조인
<br>
```
SELECT <열 목록>
FROM <첫 번째 테이블(LEFT 테이블)>
    <LEFT | RIGHT | FULL> OUTER JOIN <두 번째 테이블(RIGHT 테이블)>
     ON <조인 조건>
[WHERE 검색 조건]
```
<br>

****Cross Join****
<br>
한쪽 테이블의 모든 행과 다른 쪽 테이블의 모든 행을 조인시키는 기능입니다. 상호 조인 결과의 전체 행 개수는 두 테이블의 각 행의 개수를 곱한 수만큼 됩니다.
카티션 곱(CARTESIAN PRODUCT)라고도 합니다.
<br>
```
SELECT *
FROM <첫 번째 테이블>
    CROSS JOIN <두 번째 테이블>
```
<br>

****Self Join****
<br>
자체 조인은 자기 자신과 조인하므로 1개의 테이블을 사용합니다. 별도의 문법이 있는 것은 아니고 1개로 조인하면 자체 조인이 됩니다.
<br>
```
SELECT <열 목록>
FROM <테이블> 별칭A
    INNER JOIN <테이블> 별칭B
[WHERE 검색 조건]
```
<br>
출처 :
https://hongong.hanbit.co.kr/sql-%EA%B8%B0%EB%B3%B8-%EB%AC%B8%EB%B2%95-joininner-outer-cross-self-join/
---
