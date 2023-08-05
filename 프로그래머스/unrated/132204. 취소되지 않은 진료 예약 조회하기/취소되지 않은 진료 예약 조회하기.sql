SELECT A.APNT_NO
    ,B.PT_NAME
    ,A.PT_NO
    ,A.MCDP_CD
    ,C.DR_NAME
    ,A.APNT_YMD
FROM APPOINTMENT A
JOIN PATIENT B
    ON A.PT_NO = B.PT_NO 
JOIN DOCTOR C
    ON A.MDDR_ID = C.DR_ID
WHERE TO_CHAR(A.APNT_YMD,'YYYY-MM-DD') = '2022-04-13' AND A.APNT_CNCL_YN = 'N'
ORDER BY APNT_YMD