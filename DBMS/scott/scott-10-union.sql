-- 집합연산자
-- UNION(합집합)
-- 컬럼의 갯수와 자료형이 일치
-- 중복되는 데이터는 하나만 선택됨(중복되는 값은 제거)

SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp WHERE deptno = 20;

SELECT * FROM emp WHERE deptno IN(10, 20);

-- 컬럼의 갯수와 자료형이 일치
SELECT * FROM emp WHERE deptno = 10
UNION
SELECT * FROM emp WHERE deptno = 20;

-- 컬럼이 일치해야 한다.
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20;

-- 중복되는 데이터는 하나만 선택됨
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20  -- 6개의 행
UNION
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20; -- 3개의 행


-- 값이 다르면 선택됨
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20  -- 6개의 행
UNION
SELECT empno, ename, sal * 12 as sal, deptno FROM emp WHERE deptno = 20; -- 3개의 행

-- emp UNION emp2
SELECT * FROM emp UNION SELECT * FROM emp2;

SELECT * FROM emp  WHERE empno in(7369, 7499)
UNION 
SELECT * FROM emp2  WHERE empno in(7369, 7499);

