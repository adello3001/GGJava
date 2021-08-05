-- 서브쿼리를 사용한 수정

--     
SELECT dname, loc FROM dept_temp WHERE deptno = 60;

-- 여러개의 컬럼을 서브쿼리를 지정하여 수정
UPDATE dept_temp
    SET (dname, loc) = (SELECT dname, loc FROM dept_temp WHERE deptno = 60)
    WHERE deptno = 80;
    
UPDATE dept_temp
    SET (dname, loc) = (SELECT dname, loc FROM dept_temp WHERE deptno = 50)
    WHERE deptno in (91,92,93,94);

-- 각 컬럼별로 서브쿼리를 지정하여 수정
-- 각 컬럼별로 검색조건이 다른 때 사용
UPDATE dept_temp
    SET dname = (SELECT dname FROM dept_temp WHERE deptno = 20),
           loc = (SELECT loc FROM dept_temp WHERE deptno = 30)
    WHERE deptno in (95,96);           
    