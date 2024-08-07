SELECT
    APNT_NO,
    PT_NAME,
    P.PT_NO,
    D.MCDP_CD,
    D.DR_NAME,
    APNT.APNT_YMD
FROM
    PATIENT P
JOIN
    (SELECT
        *
    FROM
        APPOINTMENT A
    WHERE
        DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13' AND
        APNT_CNCL_YN = 'N' AND
        MCDP_CD = 'CS') AS APNT
ON
    P.PT_NO = APNT.PT_NO
JOIN
    DOCTOR D
ON
    APNT.MDDR_ID = D.DR_ID
ORDER BY
    APNT.APNT_YMD
