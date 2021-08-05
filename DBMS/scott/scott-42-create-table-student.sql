-- 테이블 생성
-- 학생정보(STUDENT)

CREATE TABLE student(
    sno       NUMBER(4),     -- 학번
    sname     VARCHAR2(20),  -- 이름
    subject   VARCHAR2(20),  -- 전공
    handphone VARCHAR2(15),  -- 핸드폰번호
    postcd    CHAR(6),       -- 우편번호
    address   VARCHAR2(50)   -- 상세주소
);

DESC student;

SELECT * FROM student;

INSERT INTO student VALUES(1234, '샤이니', '컴퓨터공학', '010-1234-5678', '123456', null);
INSERT INTO student VALUES(2456, '이사오육', '물류', '010-2424-2424', '2424', null);

COMMIT;

SELECT * FROM student WHERE postcd = '2424';
SELECT * FROM student WHERE postcd = '2424  ';

SELECT postcd, length(postcd), lengthb(postcd), sname, length(sname), lengthb(sname) FROM student;
