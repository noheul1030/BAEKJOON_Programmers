SELECT TO_CHAR(SALES_DATE,'YYYY') YEAR
    ,TO_NUMBER(TO_CHAR(SALES_DATE,'MM')) MONTH
    ,COUNT(DISTINCT B.USER_ID) PUCHASED_USERS
    ,TO_CHAR(ROUND
        (COUNT(DISTINCT B.USER_ID)/
        (SELECT COUNT(*) FROM USER_INFO  
         WHERE TO_CHAR(JOINED,'YYYY') = '2021'), 1)) AS PUCHASED_RATIO
FROM ONLINE_SALE B
JOIN USER_INFO A
ON A.USER_ID = B.USER_ID
WHERE TO_CHAR(A.JOINED,'YYYY') = '2021'
GROUP BY TO_CHAR(B.SALES_DATE,'YYYY'),TO_CHAR(B.SALES_DATE,'MM')
ORDER BY YEAR,MONTH