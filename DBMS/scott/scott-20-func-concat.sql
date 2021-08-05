-- 두 문자열 합치는 함수
-- concat(문자열1, 문자열2)
-- 문자열1 +  문자열2 

-- 사번과 이름을 합침
SELECT empno, ename, concat(empno, ename) FROM emp;

-- 사번 + '-' + 이름
SELECT empno, ename, concat(empno, concat('-', ename)) FROM emp;

-- 사번 + ':' + 이름
SELECT empno, ename, concat(empno, concat(':', ename)) FROM emp;

--  문자열 데이터 연결(||) : javalang(OR)
SELECT empno, ename, empno || ename FROM emp;
SELECT empno, ename, empno || '-' || ename FROM emp;
SELECT empno, ename, empno || ':' || ename FROM emp;

