-- NULL  처리
-- 데이터의 값이 비어있는 상태
-- 데이터의 값이 존재하지 않는 상태
-- * NULL은 산술연산을 하면 NULL이 된다.

-- 연소득:  sal * 12
SELECT ename, sal, sal*12 as annsal, comm FROM emp;

-- 총소득:  sal * 12 + comm
SELECT ename, sal, sal*12+comm as annsal, comm FROM emp;

-- comm이 null인 경우
SELECT * FROM emp WHERE comm = NULL;   -- 자료가 검색되지 않음
SELECT * FROM emp WHERE comm IS NULL;

-- comm이 null이 아닌 경우
SELECT * FROM emp WHERE comm != NULL;   -- 자료가 검색되지 않음
SELECT * FROM emp WHERE comm IS NOT NULL;

-- AND 연산자와  IS NULL을 같이 사용
SELECT * FROM emp WHERE comm IS NULL AND sal > null;  -- 자료가 검색되지 않음

-- AND 연산:
-- 피연산1 AND 피연산2
-- true AND true -> true
-- true AND false -> false
-- true AND NULL -> NULL
-- NULL AND NULL -> NULL

-- OR 연산:
-- 피연산1 OR 피연산2
-- true OR true -> true
-- true OR false -> true
-- true OR NULL -> true
-- false OR NULL -> NULL
-- NULL OR false -> NULL
-- NULL OR NULL -> NULL
SELECT * FROM emp WHERE comm IS NULL OR sal >= 5000;
SELECT * FROM emp WHERE comm =  NULL OR sal >= 5000;
SELECT * FROM emp WHERE sal > 5000 OR comm = NULL; 
SELECT * FROM emp WHERE sal >= 5000 OR comm = NULL; 
