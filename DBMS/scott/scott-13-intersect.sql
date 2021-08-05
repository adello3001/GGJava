-- 집합 연산자
-- 교집합(INTERSECT)
-- 컬럼의 갯수와 타입이 일치해야 함
-- 같은 즉 공통되는 데이터만 선택

-- INTERSECT
SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- INTERSECT
SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno, ename, sal, deptno FROM emp2;

-- INTERSECT
SELECT empno, ename, deptno FROM emp
INTERSECT
SELECT empno, ename, deptno FROM emp2;

-- INTERSECT
SELECT job FROM emp
INTERSECT
SELECT job FROM emp2;



