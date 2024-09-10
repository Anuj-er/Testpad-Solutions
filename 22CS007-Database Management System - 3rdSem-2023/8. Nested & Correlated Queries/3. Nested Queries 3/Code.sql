SELECT teacher_name 
FROM teacher
WHERE class_id IN(
  SELECT class_id FROM students 
  WHERE stud_name == 'Rohit'
);