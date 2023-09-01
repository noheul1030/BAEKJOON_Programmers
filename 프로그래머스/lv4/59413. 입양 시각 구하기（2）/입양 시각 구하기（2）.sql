SELECT HOUR, COUNT(T2.DATETIME) AS COUNT
FROM
    (SELECT LEVEL-1 AS HOUR
        FROM DUAL
        CONNECT BY LEVEL <= 24) T1
        LEFT JOIN ANIMAL_OUTS T2
        ON T1.HOUR = TO_NUMBER(TO_CHAR(T2.DATETIME, 'HH24'))
GROUP BY HOUR
ORDER BY HOUR ASC