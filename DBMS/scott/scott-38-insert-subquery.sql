-- 서브쿼리를 이용한 입력
-- 서브쿼리를 이용하여 INSERT를 하는 경우 VALUES구문을 생략
-- 컬럼의 갯수가 일치
-- 컬럼의 자료형이 일치



-- salgrade(1) : 700 ~ 1200
SELECT e.* 
FROM emp e, salgrade s
WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 1;

-- 사원(emp2) 테이블에 급여등급 salgrade(1) 사원을 입력
INSERT INTO emp2 
    SELECT e.* 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 1;

-- 사원(emp2) 테이블에 급여등급 salgrade(2) 사원을 입력
 SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 2;
    
INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal)
    SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 2;

-- 서브쿼리를 이용하여 INSERT를 하는 경우 VALUES구문을 생략
-- 오류: VALUES를 생략하지 않음
INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal)
    VALUES(
        SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal
        FROM emp e, salgrade s
        WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 3
    );
    
SELECT * FROM emp2;    
