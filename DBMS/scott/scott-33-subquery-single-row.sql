-----------------------------------------------------------
-- 서브쿼리(sub-query)
-- SELECT문 안에 SELECT 문
-- 서브쿼리의 결과값을 사용하여 메인쿼리(main query)를 수행
-- 서브쿼리: 메인쿼리의 비교 대상과 자료형이 같아야 하며 갯수가 일치해야 한다.
-- 서브쿼리: 결과 행 수는 메인쿼리의 연산자 종류와 호환 가능해야 한다.
-----------------------------------------------------------
-- [실행 결과가 하나인 단일행 서브쿼리]
-- 크다: >
-- 크거나 같다: >=
-- 같다: =
-- 작다: <
--작거나 같다: <=
-- 같지 않다: !=, <>, ^=
-----------------------------------------------------------

-- 사원 이름이 'JONES' 인 사원의 급여
SELECT ename, sal as "급여" FROM emp WHERE ename = 'JONES';

--  JONES 사원의 급여(2975)보다 더 많은 급여를 받는 사원
SELECT * FROM emp WHERE sal > 2975;

--  JONES 사원의 급여(2975)보다 더 많은 급여를 받는 사원
-- 조건: 서브쿼리를 이용하여 결과를 출력
SELECT ename, sal FROM emp
WHERE sal > (SELECT sal 
                        FROM emp 
                        WHERE ename = 'JONES');
                        

-- 사원 테이블의  이름이 'ALLEN'인 사원의 추가 수당보다 많은 추가 수당을 받는 사원정보
-- 추가 추당(EMP.COMM)
SELECT ename, comm FROM emp WHERE ename = 'ALLEN';
SELECT * FROM emp WHERE comm > 300;

SELECT * FROM emp WHERE comm > (SELECT comm FROM emp WHERE ename = 'ALLEN');

-- 단행일 서브쿼리와 날짜형 데이터
--사원(MARTIN)보다 빨리 입사한 사원 목록
SELECT ename, hiredate FROM emp WHERE ename = 'MARTIN';
SELECT * FROM emp WHERE hiredate < '81/09/28';
SELECT * 
    FROM emp 
    WHERE hiredate < (SELECT hiredate FROM emp WHERE ename = 'MARTIN');

-- [문제1]    
-- 부서코드가 20에 속한 사원 중 
-- 전체 사원의 평균 급여보다 높은 급여를 받는
-- 사원 정보와 소속 부서 정보    
SELECT *
FROM emp e, dept d
WHERE e.deptno = d.deptno AND e.deptno = 20;

SELECT avg(sal) FROM emp;

SELECT ename, sal, deptno FROM emp ORDER BY deptno,sal;

SELECT e.empno, e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND e.deptno = 20
AND e.sal > (SELECT avg(sal) FROM emp);


--[문제2]
-- 전체 사원의 평균 급여보다 작거나 같은 급여를 받고 있는 
-- 30번 부서의 사원 및 부서의 정보
SELECT e.empno, e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND e.deptno = 30
AND e.sal <= (SELECT avg(sal) FROM emp);


