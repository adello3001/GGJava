-- 숫자 데이터 연산을 위한 함수
-- round : 반올림
-- trunc : 버림
-- ceil : 지정한 숫자보다 큰 정수 중에서 가장 작은 정수를 반환
-- floor : 지정한 숫자보다 작은 정수 중에서 가장 큰 정수를 반환
-- mod : 나머지 값 반환


-- round(숫자, 반올림위치)
-- 반올림 위치를 지정하지 않으면 소숫점이하 첫째 자리에서 반올림
SELECT round(12.5678) FROM dual;
SELECT round(12.5678, 0) FROM dual;

-- 소숫점 첫째자리까지 표현(둘째 자리에서 반올림)
SELECT round(12.5678, 1) FROM dual;      -- 12.6
SELECT round(12.44444, 1) FROM dual;    -- 12.4
SELECT round(12.456555, 1) FROM dual;    -- 12.5

SELECT round(12.5678, 2) FROM dual;      -- 12.57



