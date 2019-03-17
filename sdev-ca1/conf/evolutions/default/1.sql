# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  number                        varchar(255),
  street                        varchar(255),
  city                          varchar(255),
  post_code                     varchar(255),
  constraint pk_address primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  email                         varchar(255),
  emp_first_name                varchar(255),
  emp_last_name                 varchar(255),
  role                          varchar(255),
  dob                           date,
  password                      varchar(255),
  mobile_number                 varchar(255),
  address_id                    bigint,
  department_id                 bigint,
  constraint uq_employee_address_id unique (address_id),
  constraint pk_employee primary key (id)
);

create table employee_project (
  employee_id                   bigint not null,
  project_project_id            bigint not null,
  constraint pk_employee_project primary key (employee_id,project_project_id)
);

create table project (
  project_id                    bigint auto_increment not null,
  project_name                  varchar(255),
  project_description           varchar(255),
  project_status                varchar(255),
  constraint pk_project primary key (project_id)
);

alter table employee add constraint fk_employee_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);

alter table employee_project add constraint fk_employee_project_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_employee_project_employee on employee_project (employee_id);

alter table employee_project add constraint fk_employee_project_project foreign key (project_project_id) references project (project_id) on delete restrict on update restrict;
create index ix_employee_project_project on employee_project (project_project_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_address_id;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

alter table employee_project drop constraint if exists fk_employee_project_employee;
drop index if exists ix_employee_project_employee;

alter table employee_project drop constraint if exists fk_employee_project_project;
drop index if exists ix_employee_project_project;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists employee_project;

drop table if exists project;

