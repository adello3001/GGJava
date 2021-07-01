-- DECODE 함수
-- DECODE(column, 조건1, 결과1, 조건2, 결과2, ..., 결과N)
-- IF, SWITCH-CASE문과 유사

SELECT empno, ename, job, sal FROM emp;

-- 직책이 MANAGER인 사람 : 급여의 10%를 인상한 급여액 출력
-- 직책이 SALESMAN인 사람 : 급여의 5%를 인상한 급여액 출력
-- 직책이 ANALYST인 사람 :  급여의 0%를 인상한 급여액 출력
-- 나머지는  :  급여의 3%를 인상한 급여액 출력

SELECT empno, ename, job, sal,
    DECODE(job, 
        'MANAGER', sal * 1.1,
        'SALESMAN', sal * 1.05,
        'ANALYST', sal, 
        sal * 1.03) as upsal
FROM emp;


