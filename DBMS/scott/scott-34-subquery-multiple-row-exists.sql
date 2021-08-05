-- 서브쿼리: 다중행 서브쿼리(multi-row subquery)
-- 실행 결과 행이 여러 개 나오는 서브쿼리
-- 다중행 연산자: in, any, some, all, exists


-- [exists]
-- 서브쿼리가 반환한 여러 결과가 하나 이상 존재하면 true
-- 서브쿼리가 반환한 여러 결과가 존재하지 않으면 false
-- 메인쿼리는 서브쿼리의 존재유무로 결정

-- 존재
SELECT deptno, dname FROM dept WHERE deptno = 10;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 10);

SELECT deptno, dname FROM dept WHERE deptno = 10;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 10)
AND deptno = 10;

-- 존재하지 않음
SELECT deptno, dname FROM dept WHERE deptno = 60;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 60);


