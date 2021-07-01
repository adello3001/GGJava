-- 테이블 변경(ALTER TABLE)
--------------------------------------------
-- 테이블에 컬럼을 추가(ADD)
-- ALTER TABLE 테이블이름 ADD 컬럼이름 자료형;
--------------------------------------------
-- 테이블에 컬럼 이름을 변경(RENAME)
-- ALTER TABLE 테이블이름 RENAME COLUMN 기존컬럼명 TO 새컬럼명;
--------------------------------------------
-- 테이블에 컬럼의 자료형 변경(MODIFY)
-- ALTER TABLE 테이블이름 MODIFY 컬럼명 자료형;
--   -> 자료형의 크기를 늘리는 것은 문제가 없다.
--   -> 자료형의 크기를 줄이려면 컬럼의 값이 NULL 이어야 한다.
--------------------------------------------
-- 테이블에 컬럼을 삭제(DROP)
-- ALTER TABLE 테이블이름 DROP COLUMN 컬럼명;
--------------------------------------------


-- 학생정보(STUDENT)에 컬럼 나이(AGE)를 추가
ALTER TABLE student ADD age NUMBER(2);

-- 학생정보(STUDENT)에 컬럼 이름변경 HANDPHONE -> HP
ALTER TABLE student RENAME COLUMN handphone TO hp;

-- 학생정보(STUDENT)에 컬럼 나이(AGE)의 자료형을 변경(MODIFY)
-- NUMBER(2)-> NUMBER(3)
ALTER TABLE student MODIFY age NUMBER(3);
INSERT INTO student VALUES(1010,'장수맨','인류학','010-1010-1010',null,null,100);

-- 자료형의 크기를 줄이려면 컬럼의 값이 NULL 이어야 한다.
-- NUMBER(3)-> NUMBER(2)
UPDATE student SET age = null WHERE age is not null;
COMMIT;
ALTER TABLE student MODIFY age NUMBER(2);

DESC student;
SELECT * FROM student;

-- 테이블에 컬럼을 삭제(DROP)
-- ALTER TABLE 테이블이름 DROP COLUMN 컬럼명;
ALTER TABLE student DROP COLUMN age;
