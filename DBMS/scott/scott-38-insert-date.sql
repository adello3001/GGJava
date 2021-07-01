-- INSERT : DATE TYPE

-- 테이블을 복제하는데 데이터는 복사하지 않음
-- TABLE: EMP -> EMP2
CREATE TABLE emp2
    AS  SELECT * FROM emp WHERE 1 != 1;
    
SELECT * FROM emp2;    
    
-- 날짜형식: 'YYYY/MM/DD'
INSERT INTO emp2 VALUES (8888, 'Runner', 'Player', 8000, '2021/06/01', 500, 100, 80);    

-- 날짜형식: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (9999, '비둘기', '비행사', 9000, '1999-09-09', 500, 100, 90);    

-- 날짜형식: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (7777, '행운아', '상담사', 7000, '20-01-10', NULL,  NULL, NULL);    

-- 날짜형식: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (1999, '김해상', '항해사', 9000, '99-09-10', NULL,  NULL, NULL);    

-- 날짜형식: 'MM-DD-YYYY'
INSERT INTO emp2 VALUES (2100, '양키스', '야구', 2000, '10-09-2009', NULL,  NULL, NULL);    -- 오류

-- 날짜형식: 'MM-DD-YYYY' 
-- TO_DATE(value, format)
INSERT INTO emp2 VALUES (2100, '양키스', '야구', 2000, TO_DATE('10-15-2009', 'MM-DD-YYYY'), NULL,  NULL, NULL);    

-- SYSDATE : 시스템 날짜
INSERT INTO emp2 VALUES (3100, '장그래', '사무', 3000, SYSDATE, NULL,  NULL, NULL);    

