--  문자 데이터를 숫자 데이터로 변환하는 함수
-- to_number(문자열데이터, 숫자포맷)

SELECT to_number('12345', '9999999') FROM dual;

SELECT to_number('12,345', '9,999,999') FROM dual;
SELECT to_number('12,345.678', '9,999,999.999') FROM dual;
SELECT to_number('12,345.678', '9,999,999.000') FROM dual;

