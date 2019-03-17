package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

// Check if this is an admin user (before permitting an action)
public class CheckIfCustomer extends Action.Simple {

    public CompletionStage<Result> call(Http.Context ctx) {

        // Check if current user (in session) is an admin
        String id = ctx.session().get("email");
        if (id != null) {
            Employee e = Employee.getUserById(id);
            if (!(e.getRole().equals("admin"))) {

                // User admin sp continue with the http request
                return delegate.call(ctx);
            }
        }
        //Result unauthorized = Results.unauthorized("unauthorized");
        // Unauthorised - redirect to login page
        ctx.flash().put("error", "Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}
