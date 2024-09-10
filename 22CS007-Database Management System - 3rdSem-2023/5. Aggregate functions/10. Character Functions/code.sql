SELECT CONCAT(fname, ' ', lname) AS FullName
FROM students;
SELECT REPLACE(fname, 'a', 'i') AS UpdatedFirstName
FROM students;
SELECT SUBSTR(fname, 1, 5) AS Initials
FROM students;