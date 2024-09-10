SELECT stud_name FROM students 
WHERE class_id IN (
  SELECT class_id FROM class WHERE no_of_students > 30 
);