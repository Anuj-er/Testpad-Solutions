CREATE TABLE dept (
    dept_id INTEGER PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE students (
    roll_no INT,
    student_name VARCHAR(50),
    age INT,
    dept_id INT,
    FOREIGN KEY(dept_id) REFERENCES dept(dept_id)
);