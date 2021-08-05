-- 삭제하기 : DELETE
-- DELETE [FROM]  테이블이름
-- [WHERE 삭제될 행에 대한 검색 조건]

CREATE TABLE DEPT2
    AS SELECT * FROM dept_temp;
    
DELETE FROM dept2;
DELETE dept2;

DELETE FROM dept2
    WHERE deptno = 80;

-- 부서이름이 'ACA'로 시작하는 데이터를 삭제
SELECT * FROM  dept2  WHERE dname LIKE 'ACA%';    
DELETE FROM  dept2  WHERE dname LIKE 'ACA%';

-- 사원테이블(EMP3)
-- 급여등급이 3등급이고 급여가 1401~2000 사이에 있는 사원
-- 그리고 부서번호가 30인 사원을 삭제
SELECT * FROM emp e, salgrade s
    WHERE e.sal BETWEEN s.losal AND s.hisal
    AND s.grade = 3
    AND e.deptno = 30;
    
DELETE FROM  emp3
    WHERE empno IN(
        SELECT e.empno FROM emp e, salgrade s
        WHERE e.sal BETWEEN s.losal AND s.hisal
        AND s.grade = 3
        AND e.deptno = 30);

    



