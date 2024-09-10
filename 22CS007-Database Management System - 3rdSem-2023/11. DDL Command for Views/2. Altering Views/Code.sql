ALTER 
VIEW student_view
AS SELECT roll_no as id, stud_name as name, marks
FROM students
WHERE marks > 50;