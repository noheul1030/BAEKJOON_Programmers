SELECT B.ID
    ,B.NAME
    ,A.HOST_ID
FROM 
    (SELECT HOST_ID,COUNT(HOST_ID) FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(HOST_ID) > 1) A
JOIN PLACES B ON A.HOST_ID = B.HOST_ID
ORDER BY ID