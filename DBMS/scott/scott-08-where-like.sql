-- LIKE 연산자와 와일드 카드

SELECT * FROM emp WHERE ename LIKE 'S%';
SELECT * FROM emp WHERE ename LIKE 'M%';

-- Underscore(_) : 임의의 문자와 매치
SELECT * FROM emp WHERE ename LIKE '_L%';

-- %STRING%
SELECT * FROM emp WHERE ename LIKE '%AM%';

-- NOT LIKE %STRING%
SELECT * FROM emp WHERE ename NOT LIKE '%AM%';
