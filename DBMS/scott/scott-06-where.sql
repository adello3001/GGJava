
-- OR
SELECT * FROM emp
WHERE job = 'MANAGER'
        OR job = 'SALESMAN'
        OR job = 'CLERK';

-- NOT OR
SELECT * FROM emp
WHERE NOT (job = 'MANAGER'  OR job = 'SALESMAN'  OR job = 'CLERK');

-- AND
SELECT * FROM emp
WHERE job != 'MANAGER'
        AND job != 'SALESMAN'
        AND job != 'CLERK';

        
-- IN
SELECT * FROM emp
WHERE job IN ('MANAGER', 'SALESMAN',  'CLERK');

-- NOT IN
SELECT * FROM emp
WHERE job NOT IN ('MANAGER', 'SALESMAN',  'CLERK');

        
        