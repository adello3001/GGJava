-- 테이블 뷰(Table View)
-- 가상 테이블(Virtual Table)
-- CREATE VIEW 뷰이름 (컬럼1, 컬럼2, ...) AS (SELECT 문);

-- 사원 테이블에서 부서코드가 30인 사원
SELECT * FROM emp WHERE deptno = 30;

-- 서브쿼리
SELECT * 
    FROM (SELECT * FROM emp WHERE deptno = 30);
    
-- 테이블 뷰(수정가능)
CREATE VIEW emp_dept30
AS (SELECT * FROM emp WHERE deptno = 30);

SELECT * FROM emp_dept30;

INSERT INTO emp_dept30 (empno, ename, job, deptno)
    VALUES(9210, 'e9210', 'student', 30);

DELETE FROM emp_dept30 WHERE empno = 9210;
commit;

-- 사전(DICT)을 통한 뷰 확인
SELECT * FROM USER_VIEWS;

