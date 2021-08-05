-- 인덱스(index)
-- 색인, 목차
-- 속도, 빠른 검색
-- 데이터 검색 성능 향상
-- 인덱스의 사용여부 :
--  -> Table Full Scan : 선형탐색, 처음부터 끝까지 검색
--  -> Index Scan : 인덱스를 통해서 검색
-- 인덱스 관련 데이터베이스 사전: USER_INDEXES, USER_IND_COLUMNS

-- [ USER_INDEXES ]
-- 사용자 계정이 소유한 인덱스 정보
SELECT * FROM USER_INDEXES;


-- [ USER_IND_COLUMNS ]
-- 사용자 계정이 소유한 인덱스의 컬럼 정보
SELECT * FROM USER_IND_COLUMNS;

SELECT a.index_name, a.table_name, b.column_name
FROM user_indexes a, user_ind_columns b
WHERE a.index_name = b.index_name;




