-- 수정하기 : UPDATE
-- UPDATE 테이블명
--      SET 컬럼1=데이터1,
--              컬럼2=데이터2,
--              ...
--              컬럼N=데이터N
--     [ WHERE 변경될 행에 대한 검색 조건 ]

-- 부서의 모든 지역을 서울(SEOUL)로 변경
UPDATE dept_temp SET loc = 'SEOUL';

-- 트랜잭션 취소
ROLLBACK;

SELECT * FROM dept_temp;

UPDATE dept_temp
    SET loc = 'SEONGNAM'
    WHERE deptno >= 91 AND deptno <= 94;

COMMIT;

-- dname이 비어있는 것을 'TEAM' + 자신의 부서번호로 수정
SELECT deptno, dname, 'TEAM' || deptno
    FROM dept_temp
    WHERE dname IS NULL;

UPDATE dept_temp
    SET dname = 'TEAM' || deptno, 
            loc = 'SEONGNAM'
    WHERE dname IS NULL;
    
-- [문제]
-- 사원(EMP2)의 급여가 1000이하인 사원만 추가 수당을 50으로 수정
SELECT * FROM emp2 WHERE sal <= 1000;

UPDATE emp2
    SET comm = 50
    WHERE sal <= 1000;

    