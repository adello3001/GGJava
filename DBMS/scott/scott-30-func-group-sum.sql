-- 데이터 그룹화 함수
-- SUM : 데이터의 합
-- COUNT : 데이터의 개수
-- MAX : 데이터 중 최댓값
-- MIN : 데이터 중 최솟값
-- AVG : 데이터의 평균값

-- sum(column)
-- 전체 사원의 급여 총액
SELECT sum(sal) FROM emp;

-- 각 부서별 급여 총액
SELECT sum(sal) FROM emp WHERE deptno = 10;
SELECT sum(sal) FROM emp WHERE deptno = 20;
SELECT sum(sal) FROM emp WHERE deptno = 30;

-- sum(distinct column) : 중복데이터는 하나만 선택
-- sum(all column) : 중복데이터 포함해서 모두 선택
-- sum(column) :  중복데이터 포함해서 모두 선택
SELECT sum(distinct sal), sum(all sal), sum(sal) FROM emp;

SELECT sal FROM emp ORDER BY sal;

-- [문제] 사원테이블(emp)에서 모든 사원들의 대해서 급여와 추가 수당의 합계를 구하라.
SELECT sum(sal) as sal, sum(comm) as comm, sum(sal) + sum(comm) as salcomm  FROM emp;


