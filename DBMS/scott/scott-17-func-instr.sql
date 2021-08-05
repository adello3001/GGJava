-- instr : 문자열에서 특정 문자 위치를 찾는 함수
-- instr(문자열, 찾으려는문자, 시작위치, 순번)
-- 없으면 zero(0)
-- 최초에 찾은 문자의 위치를 리턴

SELECT job, instr(job, 'E') FROM emp;
SELECT job, instr(job, 'A') FROM emp;

-- 시작위치
SELECT job, instr(job, 'A'), instr(job, 'A', 3) FROM emp;

-- 시작위치
-- 순번: 몇 번째 만나는 문자
-- instr(job, 'A', 1, 2) : 문자열의 처음부터 검색을 하여 두번째 만나는 'A'의 위치를 검색
SELECT job, instr(job, 'A'), instr(job, 'A', 3), instr(job, 'A', 1, 2) FROM emp;

SELECT instr('02-1234-7890', '-', 1, 2) "서울",  instr('031-1234-7890', '-', 1, 2) "성남" FROM dual;
