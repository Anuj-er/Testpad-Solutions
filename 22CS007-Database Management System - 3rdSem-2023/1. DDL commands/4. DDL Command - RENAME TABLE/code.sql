-- Create the student table if it doesn't exist
CREATE TABLE IF NOT EXISTS student (
    studentId INT,
    studentName VARCHAR(50),
    enrollmentDate DATE,
    grade INT
);
-- Rename the student table to student_data
ALTER TABLE student RENAME TO student_data;