-- COUNT(column)
-- 데이터의 갯수를 구하는 함수

-- 사원테이블의 총 사원수
SELECT count(*) FROM emp;
SELECT count(empno) FROM emp;
SELECT count(ename) FROM emp;

-- 컬럼에 null이 있는 경우는 갯수에 포함되지 않음
SELECT count(comm) FROM emp;
SELECT count(comm) FROM emp WHERE comm is not null;


-- 옵션: distinct, all
-- count(distinct column) : 중복데이터는 하나만 선택
-- count(all column) : 중복데이터 포함해서 모두 선택
-- count(column) :  중복데이터 포함해서 모두 선택
SELECT count(distinct sal), count(all sal), count(sal) FROM emp;
