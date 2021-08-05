-- 서브쿼리: 다중행 서브쿼리(multi-row subquery)
-- 실행 결과 행이 여러 개 나오는 서브쿼리
-- 다중행 연산자: in, any, some, all, exists


-- [all]
-- 서브쿼리가 반환한 여러 결과가 
-- 메인쿼리와 조건식을 사용한 결과와 모두(all) 같으면
-- 메인쿼리 조건식을  true로 반환
-- 비교연산자를 사용: =, >, <, >=, <=, !=, ...


-- 30번 부서의 급여 정보: 950 <= sal >= 2850
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal;

-- 30번 부서 사원들의 최소 급여보다 더 적은 급여를 받는 사원 정보
SELECT * 
FROM emp
WHERE sal < ALL (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- 30번 부서 사원들의 최대 급여보다 더 많은 급여를 받는 사원 정보
SELECT * 
FROM emp
WHERE sal > ALL (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;
