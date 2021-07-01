-- 날짜 데이터를 다루는 함수
-- sysdate : 현재 날짜
-- add_months :  월을 다루는 함수

-- 오늘 날짜
SELECT sysdate FROM dual;
SELECT sysdate, ename FROM emp;

-- 내일 날짜
SELECT sysdate + 1 as tomorrow FROM dual;

-- 어제 날짜
SELECT sysdate - 1 as yesterday FROM dual;

-- 다음 달
SELECT add_months(sysdate, 1) FROM dual;

-- 지날달
SELECT add_months(sysdate, -1) FROM dual;

-- 입사 30년차 사원정보
SELECT  ename, hiredate, add_months(hiredate, 30 * 12) FROM emp;

-- 입사 40년 미만인 사원정보
SELECT  ename, hiredate, add_months(hiredate, 40 * 12) 
FROM emp 
WHERE add_months(hiredate, 40*12) > sysdate;


-- 입사 40년 이상인 사원정보
SELECT  ename, hiredate, add_months(hiredate, 40 * 12) 
FROM emp 
WHERE add_months(hiredate, 40*12) <= sysdate;

