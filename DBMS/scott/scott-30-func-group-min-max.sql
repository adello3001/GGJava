-- MAX(column) : 최대값
-- MIN(column) : 최솟값

-- [MAX]
-- 사원테이블에서 가강 급여를 많이 받는 사원의 급여
SELECT max(sal) FROM emp;

-- 부서코드 30인 사원들 가운데 가강 급여를 많이 받는 사원의 급여
SELECT max(sal) FROM emp WHERE deptno = 30;

-- 검증용
SELECT deptno, sal FROM emp ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2 desc;

-----------------------------------------------------------
-- [MIN]
-- 사원테이블에서 가강 급여를 적게 받는 사원의 급여
SELECT min(sal) FROM emp;

-- 부서코드 30인 사원들 가운데 가강 급여를 적게 받는 사원의 급여
SELECT min(sal) FROM emp WHERE deptno = 30;

-- 검증용
SELECT deptno, sal FROM emp ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2 desc;

-- 부서번호가 20인 사원의 입사일 중 제일 오래된 입사일(hiredate)?
-- min(hiredate)
SELECT min(hiredate) FROM emp WHERE deptno = 20;

-- 부서번호가 20인 사원의 입사일 중 최근 입사일(hiredate)?
SELECT max(hiredate) FROM emp WHERE deptno = 20;

-- 부서번호가 20인 사원의 입사일 중 제일 오래된 입사일과 최근 입사일(hiredate)?
SELECT min(hiredate), max(hiredate) FROM emp WHERE deptno = 20;

