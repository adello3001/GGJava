-- 조인(join)

-- 카티시안 프로턱션, 크로스 조인, 교차 조인
SELECT * FROM emp, dept ORDER BY emp.empno, emp.deptno, dept.deptno;

-- 등가조인(equal join), 동등조인, 내부조인, 단순조인
SELECT * FROM emp, dept WHERE emp.deptno = dept.deptno ORDER BY empno;

-- 테이블에 접근
SELECT emp.empno, emp.ename, emp.job, emp.deptno, dept.dname 
FROM emp, dept 
WHERE emp.deptno = dept.deptno 
ORDER BY empno;

-- 테이블의 별칭
SELECT e.empno, e.ename, e.job, e.deptno, d.dname 
FROM emp e, dept d 
WHERE e.deptno = d.deptno 
ORDER BY empno;

-- 급여가 3000 미만이면서 수당도 없는 경우
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, e.sal, e.comm
FROM emp e, dept d 
WHERE e.deptno = d.deptno 
AND e.sal < 3000
AND e.comm is null
ORDER BY e.empno;
