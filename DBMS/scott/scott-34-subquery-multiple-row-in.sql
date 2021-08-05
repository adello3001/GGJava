-- 서브쿼리: 다중행 서브쿼리(multi-row subquery)
-- 실행 결과 행이 여러 개 나오는 서브쿼리
-- 다중행 연산자: in, any, some, all, exists


-- [in]
-- or 조건으로 in 안에 조건중 하나라도 만족한는 것
SELECT * FROM emp WHERE deptno in(10,20,30,50) ORDER BY deptno;

-- 각 부서별 최고 급여액
SELECT max(sal) FROM emp;
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;
SELECT * FROM emp ORDER BY  deptno, sal desc;

-- 각 부서별 최고 급여와 동일한 급여를 받는 사원 정보
SELECT * 
FROM emp
WHERE sal in (SELECT max(sal) FROM emp GROUP BY deptno);

-- 각 부서별 최저 급여와 동일한 급여를 받는 사원 정보
SELECT * 
FROM emp
WHERE sal in (SELECT min(sal) FROM emp GROUP BY deptno);


