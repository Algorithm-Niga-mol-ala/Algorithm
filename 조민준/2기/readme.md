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
