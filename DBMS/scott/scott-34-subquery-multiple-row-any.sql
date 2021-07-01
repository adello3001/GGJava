-- 서브쿼리: 다중행 서브쿼리(multi-row subquery)
-- 실행 결과 행이 여러 개 나오는 서브쿼리
-- 다중행 연산자: in, any, some, all, exists


-- [any, some]
-- 서브쿼리가 반환한 여러 결과 중 
-- 메인쿼리와 조건식을 사용한 결과가 하나라도  true이면
-- 메인쿼리 조건식을  true로 반환
-- 비교연산자를 사용: =, >, <, ....

-- 각 부서별 최고 급여액
SELECT max(sal) FROM emp;
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;
SELECT * FROM emp ORDER BY  deptno, sal desc;

-- [any]
-- 각 부서별 최고 급여와 동일한 급여를 받는 사원 정보
-- 서브쿼리에서 비교연산자(=)과 any, some은 in과 동일
SELECT * 
FROM emp
WHERE sal = any (SELECT max(sal) FROM emp GROUP BY deptno);

-- [some]
SELECT * 
FROM emp
WHERE sal = some (SELECT max(sal) FROM emp GROUP BY deptno);

-- [문제1] 
-- 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원 정보

-- 30번 부서의 급여 정보: 950 <= sal >= 2850
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal desc;

-- 30번 부서의 최대 급여를 받는 사람보다 적은 급여를 받는 모든 사원 선택
SELECT * 
FROM emp
WHERE sal < ANY (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

SELECT * 
FROM emp
WHERE sal < SOME (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- max() 함수를 사용
-- 30번 부서의 최대 급여를 받는 사람의 급여액
SELECT max(sal) FROM emp WHERE deptno = 30;

SELECT * 
FROM emp
WHERE sal < (SELECT max(sal) FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- [문제]
-- 30번 부서의 최소 급여를 받는 사람보다 많은 급여를 받는 모든 사원
-- any, min
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal;
SELECT ename, sal FROM emp WHERE sal > 950 ORDER BY sal;

SELECT * 
FROM emp
WHERE sal > ANY (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- min
SELECT min(sal) FROM emp WHERE deptno = 30;
SELECT * 
FROM emp
WHERE sal > (SELECT min(sal) FROM emp WHERE deptno = 30)
ORDER BY sal, empno;
