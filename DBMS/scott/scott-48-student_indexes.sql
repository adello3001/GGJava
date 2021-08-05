/*
[ 인덱스 생성 ]
CREATE INDEX 인덱스이름 ON 테이블이름
(
    컬럼명 ASC or DESC,
    컬럼명 ASC or DESC,
    ...    
);

ASC  : 오름차순, 기본값(default)
DESC : 내림차순
*/

-- 단일 인덱스(single index) : 하나의 컬럼을 인덱스오 지정
-- 학생정보테이블에서 학번(sno)으로 인덱스를 생성
CREATE INDEX idx_student_sno ON student(sno);
DROP INDEX idx_student_sno;

-- 결합인덱스(composite index)
CREATE INDEX idx_student_sno_postcd ON student(sno, postcd);
DROP INDEX idx_student_sno_postcd;

-- 고유인덱스(unique index) : 중복데이터를 허용하지 않음
CREATE UNIQUE INDEX idx_student_sno ON student(sno);
INSERT INTO student (sno, sname) VALUES (1010, 'endless');

----------------------------------------------------------
SELECT * FROM user_indexes;
SELECT * FROM user_ind_columns ORDER BY index_name, column_position;
SELECT * FROM student ORDER BY 1 DESC;
SELECT * FROM student ORDER BY 1 ASC;
SELECT * FROM student ORDER BY hp DESC;


 