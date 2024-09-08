select rollNo, studentName from student where semester = 4 AND marks > 75;
select rollNo, studentName from student where branch == 'ECE' OR semester == 6;
select rollNo from student where branch == 'CSE' OR marks < 40;