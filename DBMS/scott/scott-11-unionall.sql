-- 집합연산자
-- UNION ALL(합집합)
-- 컬럼의 갯수와 자료형이 일치
-- 중복되는 데이터도 모두 선택됨(중복되는 값은 제거하지 않음)


-- 중복되는 데이터도 모두 선택됨
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20  -- 6개의 행
UNION ALL
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20; -- 3개의 행

-- 여러개 SELECT문을 기술 가능
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION ALL
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20
UNION
SELECT empno, ename, sal, deptno FROM emp2;


