SELECT month(birthdate) AS MonthNumber FROM students;
SELECT DAYNAME(birthdate) AS Name FROM students;
SELECT ABS(DATEDIFF(birthdate, "2021-03-11")) AS DateDifference FROM students;