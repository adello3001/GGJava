-- 서브쿼리 : SELECT절에 SELECT
-- 스칼라 서브쿼리(scalar subquery)
-- SELECT절에 하나의 열 영역의 결과를 출력
-- SELECT절 명시하는 서브쿼리는 반드시 하나의 결과만 반환하도록 해야 한다.

-- 급여등급
SELECT grade FROM salgrade;

-- 사원의 급여 등급
SELECT e.empno, e.ename, e.sal, s.grade 
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal and s.hisal;

SELECT grade FROM salgrade WHERE 800 BETWEEN losal AND hisal;
SELECT grade FROM salgrade WHERE 1300 BETWEEN losal AND hisal;
SELECT grade FROM salgrade WHERE 2000 BETWEEN losal AND hisal;

-- 정상
SELECT e.empno, e.ename, e.sal, (SELECT grade FROM salgrade WHERE e.sal BETWEEN losal AND hisal) as salgrade
FROM emp e;

-- 오류: 다중 결과가 나오면 안된다.
SELECT e.empno, e.ename, e.sal, (SELECT grade FROM salgrade) as salgrade FROM emp e;

-- 오류: 다중 컬럼을 지정할 수 없다.
SELECT e.empno, e.ename, e.sal, (SELECT grade, losal, hisal FROM salgrade WHERE e.sal BETWEEN losal AND hisal) as salgrade
FROM emp e;


