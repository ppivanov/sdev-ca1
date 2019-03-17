package models;

import models.users.*;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Project extends Model{

    @Id
    private Long projectID;
    @Constraints.Required
    private String projectName;
    // @Constraints.Required
    private String projectDescription;
    @Constraints.Required
    private String projectStatus;

    @ManyToMany(mappedBy = "projects", cascade = CascadeType.PERSIST)
    private List<Employee> employees; //Map to Employee table


    public Project(){
    }

    public Project(Long projectID, String projectName, String projectDescription, String projectStatus){
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectStatus = projectStatus;
    }

    public Long getProjectId(){
        return projectID;
    }

    public void setProjectId(Long id){
        this.projectID = id;
    }

    public String getProjectName(){
        return projectName;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public String getProjectDescription(){
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription){
        this.projectDescription = projectDescription;
    }

    public String getProjectStatus(){
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus){
        this.projectStatus = projectStatus;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    public static final Finder<Long, Project> find = new Finder<>(Project.class);
			    
    public static final List<Project> findAll() {
        return Project.find.all();
    }

    private List<Long> empSelect = new ArrayList<Long>();

    public List<Long> getEmpSelect() {
        return empSelect;
    }
    public void setEmpSelect(List<Long> empSelect) {
        this.empSelect = empSelect;
    }
}