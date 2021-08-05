-- ceil : 지정한 숫자보다 큰 정수 중에서 가장 작은 정수를 반환
-- floor : 지정한 숫자보다 작은 정수 중에서 가장 큰 정수를 반환

-- ceil(숫자)
SELECT ceil(3.14) FROM dual;    -- result: 4
SELECT ceil(-3.14) FROM dual;    -- result:-3
SELECT ceil(3.0) FROM dual;    -- result: 3

-- floor(숫자)
SELECT floor(3.14) FROM dual;  -- result: 3
SELECT floor(3.0) FROM dual;  -- result: 3
SELECT floor(-3.14) FROM dual;  -- result: -4
