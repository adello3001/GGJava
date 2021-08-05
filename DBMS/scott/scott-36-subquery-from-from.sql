-- 서브쿼리 : FROM절에 사용하는 서브쿼리
-- 인라인 뷰(inline view)
-- 테이블 전체가 아니라 SELECT 문을 통해 일부 데이터를 추출해서 사용

-- 부서가 10인 사원의 정보
SELECT e.empno, e.ename, e.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND e.deptno = 10;

--  서브쿼리: 부서가 10인 사원의 정보
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT * FROM emp WHERE deptno = 10) e, dept d
WHERE e.deptno = d.deptno;

-- 서브쿼리: 부서가 10인 사원의 정보
-- WHERE 문이 필요 없음
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT * FROM emp WHERE deptno = 10) e, 
            (SELECT * FROM dept WHERE deptno = 10) d;
-- WHERE e.deptno = d.deptno;

-- 필요한 컬럼만 명시하여 용량을 절약하고 성능을 향상
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT empno, ename, deptno FROM emp WHERE deptno = 10) e, 
            (SELECT deptno, dname FROM dept WHERE deptno = 10) d;

-- WITH절 : FROM절에 명시한 것도 동일
WITH
e AS (SELECT empno, ename, deptno FROM emp WHERE deptno = 10),
d AS (SELECT deptno, dname FROM dept WHERE deptno = 10)
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM e, d;


-- WITH
-- 서브쿼리: 부서가 10인 사원의 정보
WITH
e as (SELECT * FROM emp WHERE deptno = 10)
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM e, dept d
WHERE e.deptno = d.deptno;




