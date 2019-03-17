package models.users;

import models.*;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;

@Entity
public class Employee extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String empFirstName;
    @Constraints.Required
    private String empLastName;
    private String role; //administrator, manager or employee
    @Constraints.Required
    private Date dob;
    @Constraints.Required
    private String password;
    @Constraints.Required
    private String mobileNumber;
    @OneToOne(mappedBy="employee", cascade = CascadeType.ALL)
    private Address address;
    @ManyToOne
    private Department department;
    @ManyToMany
    private List<Project> projects;

    public Employee() {
    }

    public Employee(Long id, String email, String fname, String lname, String role, Date dob, String password, String mobileNumber){
        this.id = id;
        this.email = email;
        this.empFirstName = fname;
        this.empLastName = lname;
        this.role = role;
        this.dob = dob;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmpFirstName(){
        return empFirstName;
    }

    public void setEmpFirstName(String fname){
        this.empFirstName = fname;
    }

    public String getEmpLastName(){
        return empLastName;
    }

    public void setEmpLastName(String lname){
        this.empLastName = lname;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getDateOfBirthString(){
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
            String strDate = formatter.format(dob);
            return strDate;
        } catch (ParseException ex){
            return "----";
        }
    }

    public Date getDateOfBirth(){
        return dob;
    }

    public void setDateOfBirth(Date dob){
        this.dob = dob;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department dep){
        this.department = dep;
    }

    public List<Project> getProjects(){
        return projects;
    }

    public void setProjects(List<Project> projects){
        this.projects = projects;
    }

    public static Employee getUserById(String email) {
        if (email == null) {
            return null;
        } else {
            return find.query().where().eq("email", email).findUnique();
        }
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
			    
    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public static Employee authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }
    
}