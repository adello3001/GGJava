-- replace :  문자열을 대체(바꿈)
-- replace(문자열, 찾는문자열, 대체문자열)

SELECT '010-1234-5678' tel, replace('010-1234-5678', '-', '.') telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno from dual;

-- 대체문자열을 명시하지 않으면 삭제효과
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', ' ') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '/') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '대시') as telno from dual;




SELECT ename, replace(ename, 'E', '-') FROM emp;
