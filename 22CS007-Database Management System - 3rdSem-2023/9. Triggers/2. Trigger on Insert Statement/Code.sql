CREATE TRIGGER calc_marks
AFTER INSERT
ON students
BEGIN
	UPDATE students SET total_marks = (NEW.sub1_marks + NEW.sub2_marks + NEW.sub3_marks) WHERE roll_no = NEW.roll_no;
END;