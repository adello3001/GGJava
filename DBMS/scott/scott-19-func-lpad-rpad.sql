--  빈 공간을 특정 문자로 채우기
-- lpad : 왼쪽에 채우기
-- rpad : 오른쪽에 채우기

-- 왼쪽 채우기
-- lpad(문자열, 최대크기, 채울문자)
SELECT job, lpad(job, 20, '#') FROM emp;
 -- 스페이스(공백)으로 채우기
SELECT job, lpad(job, 20, ' ') FROM emp;  
SELECT job, lpad(job, 20) FROM emp;  

-- 오른쪽 채우기
-- rpad(문자열, 최대크기, 채울문자)
SELECT job, rpad(job, 20, '#') FROM emp;
-- 스페이스(공백)으로 채우기
SELECT job, rpad(job, 20, ' ') FROM emp;     
SELECT job, rpad(job, 20), length(rpad(job, 20)) FROM emp;     

-- 주민번호
SELECT rpad('990101-', 14, '*') as "주민번호" FROM dual;

-- 전화번호
SELECT rpad('010-1234-', 13, '#') as "전화번호" FROM dual;
