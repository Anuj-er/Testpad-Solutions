CREATE TABLE students(
  Id INT,
  Name VARCHAR(50),
  Age INT CHECK (Age > 15)
);