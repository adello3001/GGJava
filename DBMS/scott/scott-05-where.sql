
-- 조회 조건식없이 모든 테이블의 내용을 검색
SELECT * FROM emp;

-- 조회 조건검색: deptno가 30인 값을 검색
SELECT * FROM emp WHERE deptno = 30;

-- 부서코드가 30이고 직업이 'SALESMAN'인 사원 : AND
SELECT * FROM emp WHERE deptno = 30 AND JOB = 'SALESMAN';

-- 부서코드가 30이거나 직업이 'SALESMAN'인 사원 : OR
SELECT * FROM emp WHERE deptno = 30 OR JOB = 'SALESMAN';

-- 산술연산자를 검색 조건에 넣기
-- 연소득이 SAL * 12 = 36000
SELECT * FROM emp WHERE (SAL * 12) = 36000;       -- 같다                                         
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  > 36000;  -- 크다
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  >= 36000;  -- 크거나 같다
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  < 36000;    -- 작다
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  <= 36000;  -- 작거나 같다

-- 같지 않다. : != , <>, ^=
SELECT sal, sal *12 FROM emp WHERE (sal * 12) != 36000; 
SELECT sal, sal *12 FROM emp WHERE (sal * 12) <> 36000; 
SELECT sal, sal *12 FROM emp WHERE (sal * 12) ^= 36000; 

-- 논리 부정 연산자 : NOT
SELECT * FROM emp WHERE sal = 3000;
SELECT * FROM emp WHERE NOT sal = 3000;
SELECT * FROM emp WHERE sal != 3000;




