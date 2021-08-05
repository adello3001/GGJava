-- 세션(session)
-- 오라클 데이터베이스에서 세션은 데이터베이스 접속을 시작으로
-- 여러 데이터베이스에 관련 작업을 수행 한 후
-- 접속을 종료하기까지 전체 기간을 의미
-------------------------------------------------
-- 하나의 세션은 여러 개의 트랜잭션으로 구성된다.
-- 하나의 세션에서 수행되는 트랜잭션은 그 트랜잭션이 종료(commit, rollback) 될 때까지
-- 다른 세션에서는 데이터 조작 전 상태의 데이터만 조회 할 수 있다.
-------------------------------------------------
-- [LOCK 종류]
--  1. 행 레벨(row level lock) : WHERE 사용 
--  2. 테이블 레벨(table level lock) : WHERE를 사용하지 않으면
--  *. COMMIT, ROLLBACK에 의해서 LOCK이 풀림
-------------------------------------------------

SELECT * FROM DEPT_TEMP;

DELETE FROM DEPT_TEMP WHERE DEPTNO = 96;

COMMIT;

UPDATE DEPT_TEMP SET LOC = 'SEOUL' WHERE DEPTNO = 99;

ROLLBACK;

