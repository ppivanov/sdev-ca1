package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

import models.users.*;

import views.html.*;

public class LoginController extends Controller {
    private FormFactory formFactory;
 
    @Inject
    public LoginController(FormFactory f) {
        this.formFactory = f;
    }
    
    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm,Employee.getUserById(session().get("email"))));
}   

    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm,Employee.getUserById(session().get("email"))));
        } else {
            
            session().clear();

            session("email", loginForm.get().getEmail());

            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result logout() {
        session().clear();
        flash("success", "You have been logged out");
        return redirect(routes.LoginController.login());
    }

    @Security.Authenticated(Secured.class)
    public Result addEmployee() {
        Form<Employee> empForm = formFactory.form(Employee.class);
        Form<Address> aForm = formFactory.form(Address.class);
        return ok(addEmployee.render(empForm, aForm, Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addEmployeeSubmit() {
    Form<Employee> newEmpForm = formFactory.form(Employee.class).bindFromRequest();
    Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
    // MultipartFormData<File> data = request().body().asMultipartFormData();
    // FilePart<File> image = data.getFile("upload");
    if (newEmpForm.hasErrors() || newAddressForm.hasErrors()) {
        flash("error","Please fill in all the fieds!");
        return badRequest(addEmployee.render(newEmpForm, newAddressForm, Employee.getUserById(session().get("email"))));
    } else {
        Employee newEmp = newEmpForm.get();
        Address address = newAddressForm.get();
        newEmp.setAddress(address);
        
        if(Employee.getUserById(newEmp.getEmail())==null){
            if(newEmp.emailCheck()){
                newEmp.save();
                flash("success", "Employee " + newEmp.getEmpFirstName() + " " + newEmp.getEmpLastName() + " was added.");
            } else {
                flash("error", "Wrong email format! Please try again!");
            }
        } else {
            newEmp.update();
            flash("success", "Employee " + newEmp.getEmpFirstName() + " " + newEmp.getEmpLastName() + " was updated.");
        }
        // String saveImageMessage = saveFile(newEmp.getEmail(), image);
        return redirect(controllers.routes.HomeController.usersEmployee()); 
        }
    }
    
    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteAdmin(String email) {

        Employee e = Employee.getUserById(email);

        e.delete();

        flash("success", "Administrator " + e.getEmpFirstName() + " " + e.getEmpLastName() + " has been deleted.");
        return redirect(controllers.routes.HomeController.usersAdmin());
    }

    @Security.Authenticated(Secured.class)
    public Result updateAdmin(String email) {
        Employee e;
        Address a;
        Form<Employee> empForm;
        Form<Address> aForm;

        try {
            e = Employee.getUserById(email);
            e.update();

            a = e.getAddress();

            empForm = formFactory.form(Employee.class).fill(e);
            aForm = formFactory.form(Address.class).fill(a);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addAdmin.render(empForm, aForm,Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    public Result addAdmin() {
        Form<Employee> empForm = formFactory.form(Employee.class);
        Form<Address> aForm = formFactory.form(Address.class);
        return ok(addAdmin.render(empForm, aForm,Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addAdminSubmit() {
    Form<Employee> newEmpForm = formFactory.form(Employee.class).bindFromRequest();
    Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
    if (newEmpForm.hasErrors() || newAddressForm.hasErrors()) {
        flash("error","Please fill in all the fieds!");
        return badRequest(addAdmin.render(newEmpForm, newAddressForm, Employee.getUserById(session().get("email"))));
    } else {
        Employee newEmp = newEmpForm.get();
        Address address = newAddressForm.get();
        newEmp.setAddress(address);
        
        if(Employee.getUserById(newEmp.getEmail())==null){
            newEmp.save();
            flash("success", "Administrator " + newEmp.getEmpFirstName() + " " + newEmp.getEmpLastName() + " was added.");
        }else{
            newEmp.update();
            flash("success", "Administrator " + newEmp.getEmpFirstName() + " " + newEmp.getEmpLastName() + " was updated.");
        }
        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload"); 
        // String saveImageMessage = saveFile(newEmp.getId(), image);
        
        return redirect(controllers.routes.HomeController.usersAdmin()); 
        }
    }
    
    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteEmployee(String email) {

        Employee e = Employee.getUserById(email);
        e.delete();

        flash("success", "Employee" + e.getEmpFirstName() + "has been deleted.");
        return redirect(controllers.routes.HomeController.usersEmployee());
    }

    @Security.Authenticated(Secured.class)
    public Result updateEmployee(String email) {
        Employee e;
        Address a;
        Form<Employee> empForm;
        Form<Address> aForm;

        try {
            e = Employee.getUserById(email);
            e.update();

            a = e.getAddress();

            empForm = formFactory.form(Employee.class).fill(e);
            aForm  = formFactory.form(Address.class).fill(a);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEmployee.render(empForm, aForm, Employee.getUserById(session().get("email"))));
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();
                // String extension = "";
                // int i = fileName.lastIndexOf('.');
                // if (i >= 0) {
                //     extension = fileName.substring(i + 1);
                // }
                File file = uploaded.getFile();
                File dir = new File("public/images/profileImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // File newFile = new File("public/images/productImages/", id + "." + extension);
                File newFile = new File("public/images/profileImages/", id + ".jpg");

                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile); 
                        BufferedImage scaledImg = Scalr.resize(img, 90);
                        
                        if (ImageIO.write(scaledImg, "jpg", new File("public/images/profileImages/", id + "thumb.jpg"))) {
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
}