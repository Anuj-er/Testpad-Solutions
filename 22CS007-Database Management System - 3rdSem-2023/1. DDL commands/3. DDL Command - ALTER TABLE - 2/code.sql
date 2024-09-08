/* Perform the given tasks 
 Table 'students' already created*/
-- Rename the 'phone' column to 'contact'
ALTER TABLE students
RENAME COLUMN phone TO contact;
-- Change the data type of 'stud_name' to VARCHAR(30)
ALTER TABLE students
MODIFY COLUMN stud_name VARCHAR(30);
-- Drop the 'marks' column from the table
ALTER TABLE students
DROP COLUMN marks;