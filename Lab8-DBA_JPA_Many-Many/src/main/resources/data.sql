INSERT INTO modules (id, module_name, credits) VALUES (1, 'Microservices Architecture', 10);
INSERT INTO modules (id, module_name, credits) VALUES (2, 'Databases', 5);
INSERT INTO modules (id, module_name, credits) VALUES (3, 'Continuous Integration', 5);
INSERT INTO modules (id, module_name, credits) VALUES (4, 'Object Oriented Programming', 5);
INSERT INTO modules (id, module_name, credits) VALUES (5, 'Web Technologies', 5);

INSERT INTO courses (id, course_name, department) VALUES (1, 'Software Masters', 'Engineering');
INSERT INTO courses (id, course_name, department) VALUES (2, 'Software Degree', 'Engineering');

INSERT INTO course_modules (course_id, module_id) VALUES (1, 1);
INSERT INTO course_modules (course_id, module_id) VALUES (1, 3);
INSERT INTO course_modules (course_id, module_id) VALUES (2, 2);
INSERT INTO course_modules (course_id, module_id) VALUES (2, 4);