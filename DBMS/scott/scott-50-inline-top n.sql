-- TOP-N
-- 순위를 지정
-- 서브쿼리, inline view, rownum 활용해서 처리 가능

-- 사원중에서 급여를 가장 많이 받는 순서
SELECT empno, ename, sal FROM emp ORDER BY sal desc;

-- 사원중에서 급여를 가장 많이 받는 최상위 5명
SELECT empno, ename, sal FROM emp ORDER BY sal desc;

-- 12c 이상가능하고 11g는 지원하지 않음
SELECT empno, ename, sal FROM emp ORDER BY sal desc
    FETCH FIRST 5 ROWS ONLY;

-- 11g
-- rownum : 테이블에 저장된 행이 조회된 순서(일련번호)
SELECT rownum, empno, ename, sal FROM emp ORDER BY empno;
SELECT rownum, empno, ename, sal FROM emp ORDER BY sal desc;

-- 인라인뷰(서브쿼리)를 하게되면 인라인뷰로 새로운 ROWNUM이 부여
-- 서브쿼리에 정렬한 순서와 ROWNUM이 일치
-- 새로 부여된 rownum으로 레코드의 갯수를 지정할 수 있다.
-- 사원중에서 급여(sal)를 가장 많이 받는 최상위 5명
SELECT * FROM emp ORDER BY sal desc;

SELECT rownum, empno, ename, sal 
    FROM (SELECT * 
        FROM emp
        ORDER BY sal desc)
    WHERE rownum <= 5;        

-- 다음 자료 검색을 위해서 먼저 검색된 자료의 마지막 자료를 기준으로
-- 새로운 검색 조건을 지정하여 다음 최상위 5명을 검색
-- sal < 3000 : 3000은 먼저 검색된 마지막 급여액
SELECT rownum, e.empno, e.ename, e.sal 
    FROM (SELECT * 
        FROM emp
        WHERE sal < 3000
        ORDER BY sal desc) e
    WHERE rownum <= 5;


    
