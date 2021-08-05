-- 외부조인(outer join)
--    -> 왼쪽 외부 조인(left outer join)
--    -> 오른쪽 외부 조인(right outer join)
--    -> 양쪽 외부 조인(full outer join)

INSERT INTO emp VALUES(8000, 'Shyun', 'Arch', 1000, to_date('2021-03-30', 'YYYY-MM-DD'),4000, null, 10);

-- 왼쪽 외부 조인(left outer join)
-- 왼쪽에 있는 조건(테이블) 기준으로 오른쪽 조건의 값이 없는 경우
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr = m.empno(+)
ORDER BY e.empno;

-- 오른쪽 외부 조인(right outer join)
-- 오른쪽에 있는 조건(테이블) 기준으로 왼쪽 조건의 값이 없는 경우
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr(+) = m.empno
ORDER BY e.empno;

SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp m, emp e
WHERE m.empno = e.mgr(+)
ORDER BY e.empno;

