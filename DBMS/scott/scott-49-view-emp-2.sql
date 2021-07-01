-- 테이블 뷰(Table View)
-- 가상 테이블(Virtual Table)
-- CREATE VIEW 뷰이름 (컬럼1, 컬럼2, ...) AS (SELECT 문);

-- 사원 테이블에서 부서코드가 30인 사원
SELECT * FROM emp WHERE deptno = 20;

-- 서브쿼리
SELECT * 
    FROM (SELECT * FROM emp WHERE deptno = 20);
    
-- 테이블 뷰
-- 옵션: 열람만 가능
-- WITH READ ONLY
CREATE VIEW emp_dept20
    AS (SELECT * FROM emp WHERE deptno = 20) WITH READ ONLY;

-- 테이블 뷰 수정
-- 뷰가 없으면 생성하고 있으면 변경
CREATE OR REPLACE VIEW emp_dept20
    AS (SELECT * FROM emp WHERE deptno = 20) WITH READ ONLY;

SELECT * FROM emp_dept20;

-- 오류: ORA-42399: cannot perform a DML operation on a read-only view
-- 옵션 WITH READ ONLY로써 입력 불가
INSERT INTO emp_dept20 (empno, ename, job, deptno)
    VALUES(9220, 'E9220', 'student', 20);

-- 사전(DICT)을 통한 뷰 확인
SELECT * FROM USER_VIEWS;

-- 뷰 삭제
DROP VIEW EMP_DEPT20;

