-- 정렬(order by) : sort

-- 디폴트 오름차순(asc) : 작은 값에서 큰 값으로 정렬
-- sal 컬럼을 기준으로 오름차순으로 정렬
SELECT * FROM emp ORDER BY sal;
SELECT * FROM emp ORDER BY sal ASC;

-- ORDER BY에서 컬럼명 대신 컬럼의 순번으로 지정
-- EMPNO : 1번째 컬럼
SELECT * FROM emp ORDER BY 1;

-- 내림차순(desc) : 큰 값에서 작은 값으로 정렬
-- sal 컬럼을 기준으로 내림차순으로 정렬
SELECT * FROM emp ORDER BY sal DESC;

-- ORDER BY에서 컬럼명 대신 컬럼의 순번으로 지정
-- SAL : 6번째 컬럼
SELECT * FROM emp ORDER BY 6 DESC;

-- ORDER BY에 여러 컬럼을 지정
SELECT * FROM emp ORDER BY deptno ASC, sal DESC;
SELECT deptno, sal, ename FROM emp ORDER BY deptno ASC, sal DESC;
