-- 데이터 사전(Data Dictionary)
-- 데이터베이스 운영관련 정보
-- 데이터베이스 관리 업무

SELECT * FROM DICT ORDER BY 1;

-- 데이터베이스 관리 권한을 가진 소유자의 객체 정보
DESC dba_tables;
SELECT * FROM dba_tables;

-- 사용자 정보
SELECT * FROM dba_users;
SELECT * FROM dba_users WHERE username = 'SCOTT';
