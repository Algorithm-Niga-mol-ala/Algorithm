SELECT
    CONCAT(LENGTH, 'cm') AS MAX_LENGTH
FROM
    FISH_INFO
ORDER BY
    LENGTH DESC
LIMIT
    1
