-- 돌아오는 요일의 날짜를 구하는 함수
-- next_day(날짜데이터, 요일문자)

-- 오늘 날짜를 기준으로 돌아오는 요일의 날짜는?
SELECT sysdate, next_day(sysdate, '금요일') FROM dual;
SELECT sysdate, next_day(sysdate, '월요일') FROM dual;
SELECT sysdate, next_day(sysdate, '수요일') FROM dual;

-- 달의 마지막 날짜를 구하는 함수
-- last_day(날짜데이터)
SELECT sysdate, last_day(sysdate) FROM dual;
SELECT '21/10/15', last_day('21/10/15') FROM dual;