package model;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    @Id
    private int empID;

    @Constraints.Required
    private String empFirstName;

    @Constraints.Required
    private String empLastName;
    
    // @Constraints.Required
    // private Address address;

    // @Constraints.Required
    // private Department department;

    public Employee() {
    }

    public Employee(int empID, String fname, String lnamem
    // ,Address address,
    // Department department
    ){
        this.empID = empID;
        this.empFirstName = fname;
        this.empLastName = lname;
        // this.address = address;
        // this.department = department;
    }

    public int getEmpID(){
        return empID;
    }

    public String getEmpFirstName(){
        return empFirstName;
    }

    public String getEmpLastName(){
        return empLastName;
    }

    // public Address getEmpAddress(){
    //     return address;
    // }

    // public Department getEmpDepartment(){
    //     return department;
    // }

    public void setEmpFirstName(String fname){
        this.empFirstName = fname;
    }

    public void setEmpLastName(String lname){
        this.empLastName = lname;
    }
    
}