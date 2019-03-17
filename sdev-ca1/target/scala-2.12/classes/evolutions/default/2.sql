# --- !Ups

insert into address (id, number, street, city, post_code) values (100, '33', 'Lazy Street', 'Sometown', 'W42ABCD');

insert into department (id, name) values (200, 'Planning');

insert into project (project_id, project_name, project_description, project_status) values (300, 'E-commerce website', '--', 'Planning');

insert into employee (id, email, emp_first_name, emp_last_name, role, dob, password, mobile_number, address_id, department_id) values (400, 'admin@play.com', 'John', 'Doe', 'admin', DATE '1998-05-20', 'password', '0851234567', 100, 200);

insert into employee_project (project_project_id, employee_id) values (300, 400);