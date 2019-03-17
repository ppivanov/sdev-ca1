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
    private Environment e;

    @Inject
    public HomeController(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
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

    
    
    public String saveFileOld(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }
                File file = uploaded.getFile();
                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File newFile = new File("public/images/productImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    return "/ file uploaded.";
                } else {
                    return "/ file upload failed.";
                }

            }
        }
        return "/ no image file.";
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }
                File file = uploaded.getFile();
                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File newFile = new File("public/images/productImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile); 
                        BufferedImage scaledImg = Scalr.resize(img, 90);
                        
                        if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/", id + "thumb.jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }
                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                } else {
                    return "/ file upload failed.";
                }

            }
        }
        return "/ no image file.";
    }

    @Security.Authenticated(Secured.class)
    public Result usersAdmin() {
        List<Employee> empList = null;

        empList = Employee.findAll();

        return ok(admin.render(empList, Employee.getUserById(session().get("email"))));

    }

    @Security.Authenticated(Secured.class)
    public Result usersEmployee() {
        List<Employee> empList = null;

        empList = Employee.findAll();

        return ok(employees.render(empList, Employee.getUserById(session().get("email"))));

    }

}
