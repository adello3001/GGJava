-- substr : 문자열 추출 함수

-- substr(데이터, 시작위치, 추출길이)
-- 문자열의 시작은 1부터 
-- 추출길이를 생략하면 문자열의 끝까지
-- 시작위치를 마이너스(minus)를 주게되면 마지막 위치부터 시작

-- 1번째 위치에서 2개의 문자를 추출
SELECT job, substr(job, 1, 2) FROM emp;

-- 5번째 위치에서 3개의 문자를 추출
SELECT job, substr(job, 5, 3) FROM emp;

-- 추출길이를 생략
-- 5번째 위치에서 문자열의 끝까지 추출
SELECT job, substr(job, 5) FROM emp;

-- 시작위치가 minus(-) 인 경우
-- 문자열 끝까지 추출
SELECT job, substr(job, -1) FROM emp;
SELECT job, substr(job, -2) FROM emp;
SELECT job, substr(job, -3) FROM emp;
SELECT job, substr(job, -4) FROM emp;

SELECT job, substr(job, -4, 2) FROM emp;

-- 시작위치가 문자열의 length보다 작으면 null
SELECT job, substr(job, -20) FROM emp; 

-- 전체를 추출
SELECT job, substr(job, -length(job)) FROM emp; 

