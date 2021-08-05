-- 셀프조인(self join)

-- 셀프조인을 쓰지 않게되면 사원테이블(emp)과 같은 복사본을 만들어 조인을 해야 한다.
-- 문제는 사원테이블에 변경이 발생하게 되면 emp_mgr에 변경된 내용을 반영해야 하는 번거로움이 발생
-- 이중 테이블을 관리하는 번거로움이 발생
CREATE TABLE emp_mgr AS SELECT * FROM emp;

-- 사원(empno)의 매니저(mgr)
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp_mgr m
WHERE e.mgr = m.empno;

-- 셀프조인
SELECT '[self join]', e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr = m.empno
ORDER BY 2;
