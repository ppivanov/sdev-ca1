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

// import play.mvc.Http.*;
// import play.mvc.Http.MultipartFormData.FilePart;
// import java.io.File;

// import java.io.IOException;
// import java.awt.image.*;
// import javax.imageio.*;

public class ProjectController extends Controller {
    
    private FormFactory formFactory;

    @Security.Authenticated(Secured.class)
    public Result addProject() {
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addProjectSubmit() {
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.render(newProjectForm,Employee.getUserById(session().get("email"))));
        } else {
            Project newProject = newProjectForm.get();

            List<Employee> newEmployees = new ArrayList<Employee>();
            for (Long id : newProject.getEmpSelect()) {
                newEmployees.add(Employee.find.byId(id));
            }
            newProject.setEmployees(newEmployees);
            
            if(newProject.getProjectId()==null){
                newProject.save();
                flash("success", "Project " + newProject.getProjectName() + " was added.");
            } else {
                newProject.update();
                flash("success", "Project " + newProject.getProjectName() + " was updated.");
            }
            
            return redirect(controllers.routes.HomeController.projects());
        }
    }

    @Security.Authenticated(Secured.class)
    public Result updateProject(Long id) {
        Project project;
        Form<Project> projectForm;

        try {
            project = Project.find.byId(id);
            projectForm = formFactory.form(Project.class).fill(project);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProject.render(projectForm,Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been deleted.");
        return redirect(controllers.routes.HomeController.projects());
    }
}