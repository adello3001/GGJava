-- 비등가 조인(non-equi join)
-- 세타조인

-- 사원 테이블
SELECT * FROM emp;

-- 급여등급 테이블
SELECT * FROM salgrade;

-- 사원의 급여의 등급
SELECT * 
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal AND s.hisal;

SELECT * 
FROM emp e, salgrade s
WHERE e.sal >= s.losal  AND e.sal <= s.hisal;

