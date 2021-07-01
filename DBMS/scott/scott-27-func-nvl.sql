-- NULL 처리함수
-- nvl : 컬럼 또는 데이터가  NULL이 아니면 그대로 반환하고,  NULL인 경우 지정한 데이터를 반환
-- nvl(데이터, 대체값)

-- 계산되는 컬럼에 NULL이 있으면 결과가 NULL
SELECT ename, sal, comm, sal + comm FROM emp;

-- nvl
SELECT ename, sal, comm, sal + comm, nvl(comm, 0) comm2, sal + nvl(comm, 0) 
FROM emp;
