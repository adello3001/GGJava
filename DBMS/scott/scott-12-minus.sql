-- 집합 연산자
-- 차집합(MINUS)
-- 상위에 작성한 SELECT문의 결과에서 하위에 작성한  SELECT 문의 결과를 뺀 결과를 선택
-- 컬럼의 갯수와 타입이 일치해야 함

-- MINUS
SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- MINUS
SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno, ename, sal, deptno FROM emp2;

-- MINUS
SELECT empno, ename, deptno FROM emp
MINUS
SELECT empno, ename, deptno FROM emp2;


