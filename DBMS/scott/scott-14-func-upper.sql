-- 오라클 내장함수(Built-in function)
-- 단일행 함수(single-row function) :  데이터가 한 행씩 입력되고 입력된 한 행당 결과가 하나씩 나오는 함수
-- 다중행 함수(multiple-row function) : 데이터가 여러 행에 입력되어 하나의 행으로 결과가 반환되는 함수

-- 문자함수(String)
-- 대.소문자 바꾸는 함수
-- upper : 데이터를 대문자로 변환
-- lower : 데이터를 소문자로 변환
-- initcap : 첫 글자는 대문자, 나머지는 소문자 변환

SELECT ename,  upper(ename), lower(ename), initcap(ename) FROM emp;

SELECT ename,  upper(ename) ename_upper, lower(ename) ename_lower, initcap(ename) ename_initcap FROM emp;

SELECT * FROM emp WHERE  ename = 'JAMES';

SELECT * FROM emp WHERE  ename = 'james';

SELECT * FROM emp WHERE  ename = upper('james');

SELECT * FROM emp WHERE  upper(ename) = upper('James'); -- 비권장(성능에 영향)

SELECT * FROM emp WHERE  ename LIKE upper('%ame%');


