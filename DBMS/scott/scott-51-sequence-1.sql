-- 시퀀스(sequence)
-- 순번: 연속적으로 발행되는 일련번호
/*
CREATE SEQUENCE 시퀀스이름
  INCREMENT BY n      -- 증가값(기본값 1)
  START WITH n        -- 시작값(기본값 1)
  MAXVALUE n          -- 최대값
  MINVALUE n          -- 최소값
  CYCLE | NOCYCLE     -- 최대값에 도달했을 때 시작값에서 다시 시작할 것인지 유무
  CACHE n | NOCACHE   -- 생성할 번호를 메모리에 미리 할당해 놓은 수를 지정할지 유무(기본값은 20)
*/

-- 시퀀스 생성
CREATE SEQUENCE dept_sequence
    INCREMENT BY 10
    START WITH 10
    MAXVALUE 90
    MINVALUE 0
    CYCLE
    CACHE 2;

-- 시퀀스 수정
-- START WITH는 수정할 수 없다.
ALTER SEQUENCE dept_sequence
    INCREMENT BY 1
    -- START WITH 10
    MAXVALUE 99
    MINVALUE 0
    NOCYCLE
    CACHE 2;

-- 시퀀스 삭제    
DROP SEQUENCE dept_sequence;

SELECT * FROM user_sequences;    

-- 다음번호 발행
SELECT dept_sequence.nextval FROM dual;

-- 발행된 현재 번호 조회
SELECT dept_sequence.currval FROM dual;

CREATE TABLE DEPT_SEQ AS SELECT * FROM DEPT WHERE 1 <> 1;
SELECT * FROM DEPT_SEQ;
INSERT INTO DEPT_SEQ VALUES(dept_sequence.nextval, 'DBA', 'SEONGNAM');
SELECT * FROM DEPT_SEQ;
