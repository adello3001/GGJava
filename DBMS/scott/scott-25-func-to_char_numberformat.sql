-- to_char(숫자데이터, 숫자형식)

-- 천 단위로 구분 기호 표시(,)
SELECT sal, to_char(sal, '999,999') FROM emp;

-- 달러 표시($)
SELECT sal, to_char(sal, '$999,999') FROM emp;

-- 지역 화폐 표시(L)
SELECT sal, to_char(sal, 'L999,999') FROM emp;

-- 소수점(.)
SELECT sal, to_char(sal, '999.99') FROM emp;

-- 빈자리를 0으로 채움
SELECT sal, to_char(sal, '000,999.00') FROM emp;
