-- GROUP BY
-- HAVING : 조건, 
--     -> 출력 그룹을 제한하는 조건식
--     ->  GROUP BY절을 사용해 그룹화된 결과 중에서 출력 그굽을 선별하는 조건식

-- 부서별(deptno), 직책별(job) 평균 급여액, 정렬(부서별, 직책별)
SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno, job ORDER BY deptno;

-- 부서별, 직책별 평균 급여액
-- 조건: 평균 급여액이 2000보다 크거나 같다.
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) >= 2000
ORDER BY deptno;

-- 조건: 평균 급여액이 2000보다 작은 것
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) < 2000
ORDER BY deptno;

-- 조건: 평균 급여액이 2000보다 작은 것
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) = 3000
ORDER BY deptno;

-- 그룹핑 함수는 WHERE 절에 기술할 수 없다.
-- 오류: WHERE  avg(sal) >= 3000
SELECT deptno, job, avg(sal) 
FROM emp 
WHERE  avg(sal) >= 3000
GROUP BY deptno, job 
ORDER BY deptno;


-------------------------------------------------------
-- 부서별로 사원들의 수, 급여총액,  평균급여액
-- 조건1: 부서(10,20)
-- 조건2: 사원수가 3이하인 경우
-------------------------------------------------------
SELECT deptno, count(*), sum(sal), avg(sal) 
FROM emp 
 WHERE deptno IN (10, 20)
-- WHERE deptno = 10 OR deptno = 20
GROUP BY deptno 
HAVING count(*) <= 3
ORDER BY deptno;




