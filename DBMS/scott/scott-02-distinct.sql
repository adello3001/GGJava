-- distinct : 중복 데이터 삭제

-- 부서코드
SELECT deptno FROM emp;

-- 중복제거: 컬럼이 한 개인 경우 중복 제거
SELECT DISTINCT deptno FROM emp;

-- 열이 여러개인 경우 중복 제거
-- job, deptno를 합쳐서 중복을 제거
SELECT job, deptno FROM emp;
SELECT DISTINCT job, deptno FROM emp;
