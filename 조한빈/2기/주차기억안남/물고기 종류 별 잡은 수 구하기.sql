SELECT
    COUNT(*) AS FISH_COUNT,
    NI.FISH_NAME
FROM
    FISH_NAME_INFO NI
JOIN
    FISH_INFO I
ON
    NI.FISH_TYPE = I.FISH_TYPE
GROUP BY
    NI.FISH_NAME
ORDER BY
    FISH_COUNT DESC

