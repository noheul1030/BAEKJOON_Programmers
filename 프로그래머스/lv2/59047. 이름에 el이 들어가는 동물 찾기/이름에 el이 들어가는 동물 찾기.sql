SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE = 'Dog'
        AND (NAME LIKE '%el%' OR NAME LIKE '%El%')
ORDER BY NAME;
