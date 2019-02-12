import java.util.List;
public class Project {

    private int projectID;
    private String projectName;
    private String projectDescription;
    // private String projectStatus;
    private List<Employee> employees; //Map to Employee table


    public Project(){
    }

    public Project(int projectID, String projectName, String projectDescription){
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        employees = new ArrayList<>();
    }

    public int getProjectID(){
        return projectID;
    }

    public String getProjectName(){
        return projectName;
    }

    public String getProjectDescription(){
        return projectDescription;
    }

    // public String getProjectStatus(){
    //     return projectStatus;
    // }

    public Employee getEmployees(){
        return employees;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription){
        this.projectDescription = projectDescription;
    }

    // public void setProjectStatus(String projectStatus){
    //     this.projectStatus = projectStatus;
    // }
}