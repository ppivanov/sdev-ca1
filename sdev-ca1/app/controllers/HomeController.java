package controllers;

import play.mvc.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;


public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public HomeController(FormFactory f,Environment env) {
        this.formFactory = f;
        this.env = env;
    }

    public Result index() {
        return ok(index.render(Employee.getUserById(session().get("email"))));
    }

    // public Result projects(Long emp) {
    //     List<Project> projects = null;
    //     List<Employee> emps = Employee.findAll();
        
    //     if(emp == 0){
    //         projects = Project.findAll();
    //     } else {
    //         projects = Employee.find.ref(emp).getProjects();
    //     }
    //     return ok(projects.render(projects, Employee.getUserById(session().get("email"))));
    // }

    public Result about() {
        return ok(about.render(Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    public Result usersAdmin() {
        List<Employee> empList = Employee.findAll();

        return ok(admin.render(empList, Department.findAll(), Employee.getUserById(session().get("email")), env));

    }

    @Security.Authenticated(Secured.class)
    public Result usersEmployee() {
        List<Employee> empList = Employee.findAll();

        return ok(employees.render(empList, Department.findAll(), Employee.getUserById(session().get("email")), env));

    }

}
