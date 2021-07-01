-- 트랜잭션(Transaction)
-- 정의: 하나의 논리적인 작업을 처리하기 위해 서로 연관되고 연속된 데이터베이스 명령어의 집합
-- 1. 하나의 논리적인 작업 단위
-- 2. 하나의 작업 또는 밀접하게 연관되어 있는 작업 수행을 위해 나눌 수 없는 최소 수행 단위.
-- 3. 트랜잭션을 제어하는 명령을 TCL(Transaction Control Language)
-- 4. 하나의 트랜잭션은 여러 DML 명령으로 이루어 진다.
-- 5. 커밋(COMMIT)에 의해서 트랜잭션이 완료 된다.
-- 6. 취소(ROLLBACK)에 의해서 수행된 SQL(DML)문이 취소처리 된다.

-- [트랜잭션 1]--------------------------------------------
-- 1. 신규 추가
INSERT INTO dept_temp VALUES(99, 'DBA', 'SEONGNAM');

-- 2. 자료 수정
UPDATE dept_temp SET loc = 'SEONGNAM' WHERE deptno = 90;

-- 3. 자료 삭제
DELETE FROM dept_temp WHERE dname = 'RnD';

-- 위에서 수행된 작업이 모두 취소
-- 작업하기 이전 상태로 되 돌림
ROLLBACK;
COMMIT;
-- [트랜잭션 1 완료]------------------------------------------

-- [트랜잭션 2 시작]------------------------------------------
INSERT INTO dept_temp VALUES(88, 'SEA', 'SEONGNAM');

-- 2. 자료 수정
UPDATE dept_temp SET dname = 'MARKETING' WHERE deptno = 90;

SAVEPOINT tr2;

-- 3. 자료 삭제
DELETE FROM dept_temp WHERE deptno IN (91,92,93);

ROLLBACK TO tr2;
ROLLBACK;
COMMIT;
-- [트랜잭션 2 완료]------------------------------------------
