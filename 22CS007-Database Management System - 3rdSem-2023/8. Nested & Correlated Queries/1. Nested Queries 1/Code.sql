SELECT teacher_name
FROM teacher
WHERE class_id IN (
    SELECT class_id
    FROM class
    WHERE no_of_students > 35
);