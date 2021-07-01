-- CASE문 기준 데이터 없이 조건식만 사용하기
-- CASE
--            WHEN '조건1' THEN 결과1    
--            WHEN '조건2' THEN 결과2    
--            WHEN '조건3' THEN 결과3    
--            ELSE 결과4
-- END AS ALIAS

SELECT empno, ename, comm,
    CASE
            WHEN comm is null THEN '해당사항 없음'
            -- WHEN comm = null THEN 'null이면 조건에 걸리 않음'
            WHEN comm = 0 THEN ' 수당없음'
            WHEN comm > 0 THEN '수당 : ' || comm
            ELSE '알수없음'
    END AS comm_text
FROM emp;
            