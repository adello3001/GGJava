-- 테이블 삭제
-- DROP TABLE 테이블이름;
-- 1. 테이블이 있는 데이터를 삭제
-- 2. 테이블의 구조(객체)도 삭제
-- 3. 테이블에 있는 데이터와 구조(객체)도 복구 불가

CREATE TABLE student2 AS SELECT * FROM student;
SELECT * FROM student2;

DROP TABLE student2;
DESC student2;

