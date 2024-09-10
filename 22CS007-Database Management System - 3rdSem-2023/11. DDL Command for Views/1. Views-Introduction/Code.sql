CREATE OR REPLACE VIEW student_view 
AS SELECT roll_no as id, marks 
FROM students 
WHERE marks > 75;