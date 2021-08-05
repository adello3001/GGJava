-- AVG(column)
-- 평균값을 구하는 함수

-- 전체 사원의 평균 급여액?
SELECT avg(sal) FROM emp;

-- 부서가 30인 사원들의 평균 급여액?
SELECT avg(sal) FROM emp WHERE deptno = 30;

-- 옵션: distinct, all
-- avg(distinct column) : 중복데이터는 하나만 선택
-- avg(all column) : 중복데이터 포함해서 모두 선택
-- avg(column) :  중복데이터 포함해서 모두 선택

-- 부서가 30인 사원들의 평균 급여액? (중복데이터 제거)
SELECT avg(sal), avg(distinct sal) FROM emp WHERE deptno = 30;
