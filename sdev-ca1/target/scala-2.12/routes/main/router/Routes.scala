// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Mon Mar 18 21:13:15 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_0: controllers.HomeController,
  // @LINE:11
  ProjectController_3: controllers.ProjectController,
  // @LINE:19
  LoginController_2: controllers.LoginController,
  // @LINE:41
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:11
    ProjectController_3: controllers.ProjectController,
    // @LINE:19
    LoginController_2: controllers.LoginController,
    // @LINE:41
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ProjectController_3, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ProjectController_3, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects/""" + "$" + """empid<[^/]+>""", """controllers.HomeController.projects(empid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """my-projects""", """controllers.ProjectController.showMyProjects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-project""", """controllers.ProjectController.addProject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update-project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete-project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.deleteProject(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-project-submit""", """controllers.ProjectController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete-employee/""" + "$" + """id<[^/]+>""", """controllers.LoginController.deleteEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete-admin/""" + "$" + """id<[^/]+>""", """controllers.LoginController.deleteAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update-employee/""" + "$" + """id<[^/]+>""", """controllers.LoginController.updateEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update-admin/""" + "$" + """id<[^/]+>""", """controllers.LoginController.updateAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins""", """controllers.HomeController.usersAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.HomeController.usersEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-admin""", """controllers.LoginController.addAdmin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-admin-submit""", """controllers.LoginController.addAdminSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-employee""", """controllers.LoginController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-employee-submit""", """controllers.LoginController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login-lubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_projects1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects/"), DynamicPart("empid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_projects1_invoker = createInvoker(
    HomeController_0.projects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """projects/""" + "$" + """empid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProjectController_showMyProjects2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("my-projects")))
  )
  private[this] lazy val controllers_ProjectController_showMyProjects2_invoker = createInvoker(
    ProjectController_3.showMyProjects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "showMyProjects",
      Nil,
      "GET",
      this.prefix + """my-projects""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProjectController_addProject3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-project")))
  )
  private[this] lazy val controllers_ProjectController_addProject3_invoker = createInvoker(
    ProjectController_3.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """add-project""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProjectController_updateProject4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_updateProject4_invoker = createInvoker(
    ProjectController_3.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """update-project/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProjectController_deleteProject5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProject5_invoker = createInvoker(
    ProjectController_3.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delete-project/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProjectController_addProjectSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-project-submit")))
  )
  private[this] lazy val controllers_ProjectController_addProjectSubmit6_invoker = createInvoker(
    ProjectController_3.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """add-project-submit""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_deleteEmployee7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_deleteEmployee7_invoker = createInvoker(
    LoginController_2.deleteEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "deleteEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delete-employee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_deleteAdmin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-admin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_deleteAdmin8_invoker = createInvoker(
    LoginController_2.deleteAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "deleteAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delete-admin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginController_updateEmployee9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_updateEmployee9_invoker = createInvoker(
    LoginController_2.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "updateEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """update-employee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LoginController_updateAdmin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-admin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_updateAdmin10_invoker = createInvoker(
    LoginController_2.updateAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "updateAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """update-admin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_usersAdmin11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_HomeController_usersAdmin11_invoker = createInvoker(
    HomeController_0.usersAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersAdmin",
      Nil,
      "GET",
      this.prefix + """admins""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_usersEmployee12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_HomeController_usersEmployee12_invoker = createInvoker(
    HomeController_0.usersEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersEmployee",
      Nil,
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LoginController_addAdmin13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-admin")))
  )
  private[this] lazy val controllers_LoginController_addAdmin13_invoker = createInvoker(
    LoginController_2.addAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addAdmin",
      Nil,
      "GET",
      this.prefix + """add-admin""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LoginController_addAdminSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-admin-submit")))
  )
  private[this] lazy val controllers_LoginController_addAdminSubmit14_invoker = createInvoker(
    LoginController_2.addAdminSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addAdminSubmit",
      Nil,
      "POST",
      this.prefix + """add-admin-submit""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_addEmployee15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-employee")))
  )
  private[this] lazy val controllers_LoginController_addEmployee15_invoker = createInvoker(
    LoginController_2.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """add-employee""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_addEmployeeSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-employee-submit")))
  )
  private[this] lazy val controllers_LoginController_addEmployeeSubmit16_invoker = createInvoker(
    LoginController_2.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """add-employee-submit""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_LoginController_login17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login17_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_LoginController_loginSubmit18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login-lubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit18_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """login-lubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_LoginController_logout19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout19_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_HomeController_projects1_route(params@_) =>
      call(params.fromPath[Long]("empid", None)) { (empid) =>
        controllers_HomeController_projects1_invoker.call(HomeController_0.projects(empid))
      }
  
    // @LINE:11
    case controllers_ProjectController_showMyProjects2_route(params@_) =>
      call { 
        controllers_ProjectController_showMyProjects2_invoker.call(ProjectController_3.showMyProjects)
      }
  
    // @LINE:13
    case controllers_ProjectController_addProject3_route(params@_) =>
      call { 
        controllers_ProjectController_addProject3_invoker.call(ProjectController_3.addProject)
      }
  
    // @LINE:14
    case controllers_ProjectController_updateProject4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_updateProject4_invoker.call(ProjectController_3.updateProject(id))
      }
  
    // @LINE:15
    case controllers_ProjectController_deleteProject5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_deleteProject5_invoker.call(ProjectController_3.deleteProject(id))
      }
  
    // @LINE:17
    case controllers_ProjectController_addProjectSubmit6_route(params@_) =>
      call { 
        controllers_ProjectController_addProjectSubmit6_invoker.call(ProjectController_3.addProjectSubmit)
      }
  
    // @LINE:19
    case controllers_LoginController_deleteEmployee7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_deleteEmployee7_invoker.call(LoginController_2.deleteEmployee(id))
      }
  
    // @LINE:20
    case controllers_LoginController_deleteAdmin8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_deleteAdmin8_invoker.call(LoginController_2.deleteAdmin(id))
      }
  
    // @LINE:22
    case controllers_LoginController_updateEmployee9_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_updateEmployee9_invoker.call(LoginController_2.updateEmployee(id))
      }
  
    // @LINE:23
    case controllers_LoginController_updateAdmin10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_updateAdmin10_invoker.call(LoginController_2.updateAdmin(id))
      }
  
    // @LINE:25
    case controllers_HomeController_usersAdmin11_route(params@_) =>
      call { 
        controllers_HomeController_usersAdmin11_invoker.call(HomeController_0.usersAdmin)
      }
  
    // @LINE:26
    case controllers_HomeController_usersEmployee12_route(params@_) =>
      call { 
        controllers_HomeController_usersEmployee12_invoker.call(HomeController_0.usersEmployee)
      }
  
    // @LINE:29
    case controllers_LoginController_addAdmin13_route(params@_) =>
      call { 
        controllers_LoginController_addAdmin13_invoker.call(LoginController_2.addAdmin)
      }
  
    // @LINE:30
    case controllers_LoginController_addAdminSubmit14_route(params@_) =>
      call { 
        controllers_LoginController_addAdminSubmit14_invoker.call(LoginController_2.addAdminSubmit)
      }
  
    // @LINE:32
    case controllers_LoginController_addEmployee15_route(params@_) =>
      call { 
        controllers_LoginController_addEmployee15_invoker.call(LoginController_2.addEmployee)
      }
  
    // @LINE:33
    case controllers_LoginController_addEmployeeSubmit16_route(params@_) =>
      call { 
        controllers_LoginController_addEmployeeSubmit16_invoker.call(LoginController_2.addEmployeeSubmit)
      }
  
    // @LINE:35
    case controllers_LoginController_login17_route(params@_) =>
      call { 
        controllers_LoginController_login17_invoker.call(LoginController_2.login)
      }
  
    // @LINE:36
    case controllers_LoginController_loginSubmit18_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit18_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:38
    case controllers_LoginController_logout19_route(params@_) =>
      call { 
        controllers_LoginController_logout19_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:41
    case controllers_Assets_versioned20_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
