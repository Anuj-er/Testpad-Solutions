SELECT stud_dept, COUNT(*) as student_count
FROM students
WHERE stud_dept IN ('CSE', 'Mechanical')
GROUP BY stud_dept;