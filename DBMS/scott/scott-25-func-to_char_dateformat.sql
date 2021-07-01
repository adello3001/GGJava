-- 자료형 변환
-- to_char : 숫자 또는 날짜 데이터를 문자 데이터로 변환
-- to_number : 문자 데이터를 숫자 데이터로 변환
-- to_date : 문자 데이터를 날짜 데이터로 변환

-- NUMBER + 문자열(숫자) -> 자동형변환에 의해서 숫자로 변환되어 계산
-- 암시적 형 변환(IMPLICIT TYPE CONVERSION)
SELECT empno, 
    ename, 
    empno + '88'
FROM emp
WHERE empno = 7902;

-- NUMBER + 문자열(숫자형태가 아닌 경우) -> INVALID NUMBER 오류
SELECT empno, 
    ename, 
    empno + 'HELLO'
FROM emp
WHERE empno = 7902;

-- 문자타입 + 문자열 -> invalid number
-- plus(+)로 인해서 숫자연산으로 인식하여 오류 발생
SELECT empno, 
    ename, 
    ename + 'HELLO'
FROM emp
WHERE empno = 7902;

-- 정상
SELECT empno, 
    ename, 
    empno || 'HELLO'
FROM emp
WHERE empno = 7902;


-- to_char : 숫자 또는 날짜 데이터를 문자 데이터로 변환
SELECT sysdate, to_char(sysdate, 'YYYY/MM/DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYY-MM-DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYY.MM.DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYYMMDD') FROM dual;

SELECT sysdate, to_char(sysdate, 'CC') FROM dual; -- 세기

SELECT sysdate, to_char(sysdate, 'YY') FROM dual; -- 연도(연 2자리 숫자)
SELECT sysdate, to_char(sysdate, 'YYYY') FROM dual; -- 연도(연 4자리 숫자)

SELECT sysdate, to_char(sysdate, 'MM') FROM dual; -- 월(숫자 2자리)
SELECT sysdate, to_char(sysdate, 'MON') FROM dual; -- 월(언어별 월 이름 약자)
SELECT sysdate, to_char(sysdate, 'MONTH') FROM dual; -- 월(언어별 월 이름 전체)

SELECT sysdate, to_char(sysdate, 'DD') FROM dual; -- 일(숫자 2자리)
SELECT sysdate, to_char(sysdate, 'DDD') FROM dual; -- 일(1년 중 며칠, 1~366)

SELECT sysdate, to_char(sysdate, 'DY') FROM dual; -- 요일(언어별 요일 이름 약자)
SELECT sysdate, to_char(sysdate, 'DAY') FROM dual; -- 요일(언어별 요일 이름 전체)
SELECT sysdate, to_char(sysdate, 'W') FROM dual; -- 요일(월의  몇 번째 주, 1~5)
SELECT sysdate, to_char(sysdate, 'WW') FROM dual; -- 요일(1년 중 몇 번째 주, 1~53)

-- 시간
SELECT sysdate, to_char(sysdate, 'HH24:MI:SS') FROM dual;  -- 시:분:초
SELECT sysdate, to_char(sysdate, 'AM HH12:MI:SS') FROM dual;  -- 오전/오후 시:분:초
SELECT sysdate, to_char(sysdate, 'PM HH12:MI:SS') FROM dual;  -- 오전/호후 시:분:초
SELECT sysdate, to_char(sysdate, 'A.M. HH12:MI:SS') FROM dual;  -- 오전/호후 시:분:초
SELECT sysdate, to_char(sysdate, 'P.M. HH12:MI:SS') FROM dual;  -- 오전/호후 시:분:초
SELECT sysdate, to_char(sysdate, 'HH12:MI:SS AM') FROM dual;  -- 시:분:초 오전/오후

SELECT sysdate, to_char(sysdate, 'HH24') FROM dual; -- 시간(24시간으로 표시)
SELECT sysdate, to_char(sysdate, 'HH12') FROM dual; -- 시간(12시간으로 표시)
SELECT sysdate, to_char(sysdate, 'HH') FROM dual; -- 시간(12시간으로 표시)
SELECT sysdate, to_char(sysdate, 'MI') FROM dual; -- 분
SELECT sysdate, to_char(sysdate, 'SS') FROM dual; -- 초



