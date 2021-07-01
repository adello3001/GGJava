-- GROUP BY
-- 결과값을 원하는 컬럼으로 묶어서 출력

-- 부서별 사원들의 평균 급여액
SELECT avg(sal) FROM emp WHERE deptno = 10;
SELECT avg(sal) FROM emp WHERE deptno = 20;
SELECT avg(sal) FROM emp WHERE deptno = 30;

-- 집합연산자(합집합)
-- union all
SELECT avg(sal),  '10' as deptno FROM emp WHERE deptno = 10
UNION ALL
SELECT avg(sal),  '20' as deptno FROM emp WHERE deptno = 20
UNION ALL 
SELECT avg(sal),  '30' as deptno FROM emp WHERE deptno = 30
UNION ALL 
SELECT avg(sal),  '40' as deptno FROM emp WHERE deptno = 40;

-- GROUP BY
-- 부서별 사원들의 평균 급여액
SELECT avg(sal), deptno FROM emp GROUP BY deptno;
SELECT deptno, avg(sal) FROM emp GROUP BY deptno;
SELECT deptno, avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;

-- 부서별(deptno), 직책별(job) 평균 급여액, 정렬(부서별, 직책별)
SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno, job ORDER BY deptno;

-- 오류: 다중행인 job이 GROUP BY의 컬럼으로 지정되지 않았기 때문
-- SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;

-------------------------------------------------------
-- [문제1] 부서별로 사원들의 급여 총액
-------------------------------------------------------
SELECT deptno, sum(sal) FROM emp GROUP BY deptno ORDER BY deptno;


-------------------------------------------------------
-- [문제2] 부서별로 사원들의 수 
-------------------------------------------------------
SELECT deptno, count(*) FROM emp GROUP BY deptno ORDER BY deptno;


-------------------------------------------------------
-- [문제3] 부서별로 사원들의 수, 급여총액,  평균급여액
-------------------------------------------------------
SELECT deptno, count(*), sum(sal), avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;




