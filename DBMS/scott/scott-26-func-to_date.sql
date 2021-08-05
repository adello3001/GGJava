-- 문자 데이터를 날짜 데이터로 변환 하는 함수
-- to_date(문자열, 날짜포맷)

SELECT to_date('2020-09-07', 'YYYY-MM-DD') FROM dual;
SELECT to_date('2020/09/10', 'YYYY/MM/DD') FROM dual;
SELECT to_date('2020.09.10', 'YYYY.MM.DD') FROM dual;
SELECT to_date('09-07-2021', 'MM-DD-YYYY') FROM dual;