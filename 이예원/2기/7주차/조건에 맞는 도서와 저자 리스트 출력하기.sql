-- 코드를 입력하세요
SELECT DISTINCT BOOK_ID, AUTHOR_NAME, date_format(PUBLISHED_DATE, '%Y-%m-%d')
from AUTHOR a
inner join BOOK b
on a.AUTHOR_ID = b.AUTHOR_ID
where b.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE ASC;
