-- 데이터 사전(Data Dictionary)
-- 데이터베이스 운영관련 정보
-- 데이터베이스 관리 업무
DESC DICT;
SELECT * FROM DICT WHERE TABLE_NAME LIKE 'USER_T%' ORDER BY 1;
SELECT * FROM DICT ORDER BY 1;

-- 접속한 사용자의 테이블 정보
DESC USER_TABLES;
SELECT * FROM USER_TABLES;

--사용자가 소유한 객체 정보
DESC all_tables;
SELECT * FROM all_tables;

SELECT * FROM all_tables WHERE owner IN('SYS', 'SYSTEM');
SELECT * FROM all_tables WHERE owner = 'SCOTT';

-- 데이터베이스 관리 권한을 가진 소유자
-- 'SCOTT' 계정이 관리자 권한을 소유하고 있지 않음
DESC dba_tables;