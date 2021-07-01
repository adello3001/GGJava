
-- 행단위로 조회: 셀렉션(Selection)
SELECT * FROM emp;

-- 열단위로 조회하는 프로젝션(Projection)
SELECT empno, ename, deptno FROM emp;

-- 조인(Join) : emp.deptno = dept.deptno
SELECT emp.empno, emp.ename, emp.deptno, dept.dname, dept.loc
    FROM emp, dept
    WHERE emp.deptno = dept.deptno;

SELECT empno, ename, deptno FROM emp WHERE empno = 7369;
SELECT * FROM dept WHERE deptno = 20;
