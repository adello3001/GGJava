-- 테이블의 데이터 삭제
-- TRUNCATE TABLE 테이블명;
-- 1. TRUNCATE는 DDL 명령으로 즉시 실행
-- 2. 삭제된 데이터를 복구할 수 없다.

-- 데이터 삭제: DELETE DML로 ROLLBACK 가능 
SELECT * FROM student;
DELETE FROM student;
ROLLBACK;

-- TRUNCATE는 DDL로 취소 불가
TRUNCATE TABLE student2;
ROLLBACK;