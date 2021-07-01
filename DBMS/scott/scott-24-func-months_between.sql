-- 두 날짜 사이의 개월 수 차이를 구하는 함수
-- months_between(날짜데이터1, 날짜데이터2)
-- 결과는 개월 수

SELECT ename, hiredate, 
    months_between(hiredate, sysdate), 
    months_between(sysdate, hiredate),
    trunc(months_between(sysdate, hiredate))
FROM emp;