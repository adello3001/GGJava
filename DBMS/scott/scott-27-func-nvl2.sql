-- NULL 처리함수
-- nvl2 : 컬럼 또는 데이터가  NULL일 경우화 아닐 경우 각각 대체 값을 지정
-- nvl2(데이터, NULL이 아닐겨우 대체값, NULL일 경우 대체값)

-- nvl2: NULL이면 'X', NULL이 아니면 'O'
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 FROM emp;

-- comm이 NULL이면 계산을 하지 않음
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 ,
    nvl2(comm, sal*12+comm, sal*12)
FROM emp;

-- comm이 NULL이면 기본값(10)을 더함
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 ,
    nvl2(comm, sal*12+comm, sal*12 + nvl(comm, 10) )
FROM emp;
