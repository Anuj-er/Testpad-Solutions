CREATE TRIGGER stud_update
AFTER UPDATE
ON students
BEGIN
	INSERT INTO stud_logs VALUES(OLD.roll_no, 'updated');
END;
CREATE TRIGGER stud_delete
AFTER DELETE
ON students
BEGIN
	INSERT INTO stud_logs VALUES(OLD.roll_no, 'deleted');
END;