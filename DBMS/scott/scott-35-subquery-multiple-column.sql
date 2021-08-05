-- 다중열 서브쿼리(multiple-column subquery)
-- 다중열(컬럼이 여러개 인 경우) 서브쿼리, 복수열 서브쿼리

-- 부서별로 가장 급여를 많이 받는 사원의 급여액
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno;

-- 부서별로 가장 급여를 많이 받는 사원 정보
SELECT * FROM emp
WHERE sal in (SELECT max(sal) FROM emp GROUP BY deptno);

-- 오류 : 서브쿼리가 아닌 경우 다중열에 제한
-- SELECT * FROM emp WHERE (deptno, sal) in (10, 2850);

-- 다중열 서브쿼리
SELECT * FROM emp
WHERE (deptno, sal) in (SELECT deptno, max(sal) FROM emp GROUP BY deptno);

-- 10(5000), 20(10000), 30(2850)

DESC dual;
SELECT sysdate FROM dual;

-- 다중열 서브쿼리
SELECT 10 as deptno, 5001 as maxsal FROM dual;
SELECT 20 as deptno, 10001 as maxsal FROM dual;
SELECT 30 as deptno,2850 as maxsal FROM dual;

SELECT * FROM emp
WHERE (deptno, sal) in (
    SELECT 10 as deptno, 5001 as maxsal FROM dual
    UNION
    SELECT 20 as deptno, 10001 as maxsal FROM dual
    UNION
    SELECT 30 as deptno,2850 as maxsal FROM dual);
