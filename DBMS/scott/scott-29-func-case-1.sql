-- CASE문
-- CASE column
--            WHEN '조건1' THEN 결과1    
--            WHEN '조건2' THEN 결과2    
--            WHEN '조건3' THEN 결과3    
--            ELSE 결과4
-- END AS ALIAS

-- 직책이 MANAGER인 사람 : 급여의 10%를 인상한 급여액 출력
-- 직책이 SALESMAN인 사람 : 급여의 5%를 인상한 급여액 출력
-- 직책이 ANALYST인 사람 :  급여의 0%를 인상한 급여액 출력
-- 나머지는  :  급여의 3%를 인상한 급여액 출력

SELECT empno, ename, job, sal,
    CASE job
                WHEN 'MANAGER' THEN sal * 1.1
                WHEN 'SALESMAN' THEN sal * 1.05
                WHEN 'ANALYST' THEN sal
                ELSE sal * 1.03
    END AS upsal
FROM emp;    