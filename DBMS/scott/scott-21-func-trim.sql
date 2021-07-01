-- 문자열에서 특정 문자 지우기
-- trim  : 문자열의 양쪽의 지움
-- ltrim : 문자열의 왼쪽을 지움
-- rtrim : 문자열의 오른쪽을 지움

-- 문자열의 양쪽 공백을 제거
SELECT '[' || trim('  홍길동  ') || ']' FROM dual;

-- 문자열의 앞쪽의 공백을 제거
SELECT '[' || trim(leading from '  홍길동  ') || ']' FROM dual;

-- 문자열의 앞쪽의 지정한 문자('-')을 제거
SELECT '[' || trim(leading '-' from '--홍길동--') || ']' FROM dual;

-- 문자열의 뒤쪽의 공백을 제거
SELECT '[' || trim(trailing from '  홍길동  ') || ']' FROM dual;

-- 문자열의 뒤쪽의 지정한 문자('-') 공백을 제거
SELECT '[' || trim(trailing '-' from '--홍길동--') || ']' FROM dual;

-- 문자열에서  양쪽의 지정한 문자('-')를 제거
SELECT '[' || trim(both '-' from '--홍길동--') || ']' FROM dual;

-- LTRIM(문자열, 삭제할문자열) : 왼쪽의 문자 제거
-- 삭제할 문자열을 지정하지 않으면 공백 제거
SELECT '[' || ltrim('  홍길동  ') || ']' FROM dual;

-- 삭제할 문자열('-')을 지정
SELECT '[' || ltrim('--홍길동--', '-') || ']' FROM dual;

-- RTRIM(문자열, 삭제할문자열) : 오른쪽의 문자 제거
-- 삭제할 문자열을 지정하지 않으면 공백제거
SELECT '[' || rtrim('  홍길동  ') || ']' FROM dual;

-- 삭제할 문자열('-')을 지정
SELECT '[' || rtrim('--홍길동--', '-') || ']' FROM dual;


