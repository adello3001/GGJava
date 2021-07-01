-- 사원의 연간 총 수입
SELECT ename, sal, sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + comm, comm FROM emp;
SELECT ename, sal, sal*12+comm, comm FROM emp;

-- 월 평균 수입
SELECT ename, sal, sal*12+comm, comm, (sal*12+comm) / 12 FROM emp;


-- 컬럼에 별칭 지정(한글)
SELECT ename, sal, sal*12+comm "연수입", comm FROM emp;
SELECT ename, sal, sal*12+comm 연수입, comm FROM emp;
SELECT ename, sal, sal*12+comm as "연수입", comm FROM emp;
SELECT ename, sal, sal*12+comm as 연수입, comm FROM emp;

-- 컬럼에 별칭 지정(영문)
SELECT ename, sal, sal*12+comm "annual", comm FROM emp;
SELECT ename, sal, sal*12+comm annual, comm FROM emp;
SELECT ename, sal, sal*12+comm as "annual", comm FROM emp;
SELECT ename, sal, sal*12+comm as annual, comm FROM emp;


