-- ISO/ANSI: SQL-99

-- 등가조인(동등조인)
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno
ORDER BY 1,2;

-- 자연조인(natural join)
-- 대상이 되는 두 테이블에 이름과 자료형이 같은 컬럼(column)을 기준으로 동등조인을 한다.
-- deptno를 가지고 조인을 수행하므로 테이블 별칭(e, d)을 붙이면 안된다.
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
FROM emp e natural join dept d
ORDER BY 1,2;

-- join ~ using
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
FROM emp e join dept d using(deptno)
ORDER BY 1,2;

-- join ~ on
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
FROM emp e join dept d on(e.deptno = d.deptno)
ORDER BY e.empno, e.deptno;


--left outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e left outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;

--right outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e right outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;

--full outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e full outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;
