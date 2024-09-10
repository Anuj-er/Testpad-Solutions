CREATE TRIGGER stud_trigger
AFTER INSERT
ON students
BEGIN
	select null;
END;