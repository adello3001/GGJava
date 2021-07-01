-- DML(Data Manipulation Language)
-- 데이터 조작어: 데이터 검색, 추가, 수정, 삭제

-- 데이터 추가(INSERT)
-- INSERT INTO  테이블이름 [ (컬럼1, 컬럼2, ... 컬머N) ] VALUES ( 데이터1, 데이터2, ... 데이터N);
-- 컬럼이 명시되면 데이터는 컬럼의 갯수에 대응하여 기술되어야 한다.
-- 컬럼이 명시되지 않으면 테이블에 정의된 모든 컬럼에 해당하는 데이터가 기술되어야 한다.

-- 임시 테이블 생성
CREATE TABLE  DEPT_TEMP AS SELECT * FROM DEPT;

-- 컬럼을 명시하지 않음
INSERT INTO dept_temp VALUES (50, 'ACADEMY', 'SEONGNAM');

-- 컬럼 이름을 명시
INSERT INTO dept_temp (deptno, dname, loc) VALUES (60, 'RnD', 'SEOUL');
INSERT INTO dept_temp (deptno, dname) VALUES (70, 'MARKETING');

-- 문자열이 숫자로 변환될 수 있으면 입력 가능
INSERT INTO dept_temp (deptno, dname, loc) VALUES ('90', 'TELE-MARKETING', 'DAEJEON');

-- TO_NUMBER 함수를 이용하여 문자열을 숫자로 변환해서 입력
INSERT INTO dept_temp (deptno, dname, loc) VALUES (TO_NUMBER('91', '99'),  'TEAM91', 'LOC91');

-- 오류:문자열이 숫자로 변환할 수 없으면 오류
INSERT INTO dept_temp (deptno, dname, loc) VALUES ('XY', 'XY-TEAM', 'XY-LOC');
INSERT INTO dept_temp (deptno, dname, loc) VALUES (TO_NUMBER('XY', '99'), 'XY-TEAM', 'XY-LOC');

-- 오류: 컬럼과 값이 일치하지 않으면 오류
INSERT INTO dept_temp (deptno, dname, loc) VALUES (80, 'MARKETING');
INSERT INTO dept_temp (deptno, dname) VALUES (80, 'MARKETING', 'BUSAN');

-- 오류: 정의된 컬럼의 자료형의 크기보다 크다.
INSERT INTO dept_temp (deptno, dname) VALUES (123, 'TEAM123', 'LOC123');



-- 오류: PRIMARY KEY로 설정되어 있는 값이 중복
INSERT INTO dept (deptno, dname, loc) VALUES (40, 'MARKETING', 'BUSAN');

-- 조회
SELECT * FROM dept_temp;

-- NULL 데이터
-- VALUES 목록에 데이터를 기술하지 않으면 해당하는 컬럼의 값은 NULL로 처리(컬럼 LOC)
INSERT INTO dept_temp (deptno, dname) VALUES (92, 'TEAM92');
INSERT INTO dept_temp (deptno, dname, loc) VALUES (95, NULL, 'DAEGU');
INSERT INTO dept_temp (deptno, loc) VALUES (96, 'ULSAN');

-- 컬럼을 명시하면 VALUES 목록에 NULL을 기술(컬럼 LOC)
INSERT INTO dept_temp (deptno, dname, loc) VALUES (93, 'TEAM93', NULL);

-- 컬럼을 명시하면 VALUES 목록에 빈스트링('')을 기술(컬럼 LOC)
INSERT INTO dept_temp (deptno, dname, loc) VALUES (94, 'TEAM94', '');

