-- trunc : 버림
-- trunc(숫자, 버림위치)

-- 버림 위치를 지정하지 않으면 소숫점 첫 번째 자리에서 버림
SELECT trunc(1234.5678) FROM dual;
SELECT trunc(1234.5678, 0) FROM dual;

SELECT trunc(1234.5678, 1) FROM dual;
SELECT trunc(1234.5678, 2) FROM dual;
SELECT trunc(1234.5678, 3) FROM dual;
