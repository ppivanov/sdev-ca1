// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Sun Mar 17 14:43:42 GMT 2019

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
  // @LINE:17
  LoginController_2: controllers.LoginController,
  // @LINE:39
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:11
    ProjectController_3: controllers.ProjectController,
    // @LINE:17
    LoginController_2: controllers.LoginController,
    // @LINE:39
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
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

  // @LINE:7
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProjectController_addProject2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-project")))
  )
  private[this] lazy val controllers_ProjectController_addProject2_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_ProjectController_updateProject3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_updateProject3_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_ProjectController_deleteProject4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProject4_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_ProjectController_addProjectSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-project-submit")))
  )
  private[this] lazy val controllers_ProjectController_addProjectSubmit5_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_LoginController_deleteEmployee6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_deleteEmployee6_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_LoginController_deleteAdmin7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-admin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_deleteAdmin7_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_LoginController_updateEmployee8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_updateEmployee8_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_LoginController_updateAdmin9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-admin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_updateAdmin9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_usersAdmin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_HomeController_usersAdmin10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_HomeController_usersEmployee11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_HomeController_usersEmployee11_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_LoginController_addAdmin12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-admin")))
  )
  private[this] lazy val controllers_LoginController_addAdmin12_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_LoginController_addAdminSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-admin-submit")))
  )
  private[this] lazy val controllers_LoginController_addAdminSubmit13_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_LoginController_addEmployee14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-employee")))
  )
  private[this] lazy val controllers_LoginController_addEmployee14_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_LoginController_addEmployeeSubmit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-employee-submit")))
  )
  private[this] lazy val controllers_LoginController_addEmployeeSubmit15_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_LoginController_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login16_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_LoginController_loginSubmit17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login-lubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit17_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_LoginController_logout18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout18_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_HomeController_about1_route(params@_) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:11
    case controllers_ProjectController_addProject2_route(params@_) =>
      call { 
        controllers_ProjectController_addProject2_invoker.call(ProjectController_3.addProject)
      }
  
    // @LINE:12
    case controllers_ProjectController_updateProject3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_updateProject3_invoker.call(ProjectController_3.updateProject(id))
      }
  
    // @LINE:13
    case controllers_ProjectController_deleteProject4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_deleteProject4_invoker.call(ProjectController_3.deleteProject(id))
      }
  
    // @LINE:15
    case controllers_ProjectController_addProjectSubmit5_route(params@_) =>
      call { 
        controllers_ProjectController_addProjectSubmit5_invoker.call(ProjectController_3.addProjectSubmit)
      }
  
    // @LINE:17
    case controllers_LoginController_deleteEmployee6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_deleteEmployee6_invoker.call(LoginController_2.deleteEmployee(id))
      }
  
    // @LINE:18
    case controllers_LoginController_deleteAdmin7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_deleteAdmin7_invoker.call(LoginController_2.deleteAdmin(id))
      }
  
    // @LINE:20
    case controllers_LoginController_updateEmployee8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_updateEmployee8_invoker.call(LoginController_2.updateEmployee(id))
      }
  
    // @LINE:21
    case controllers_LoginController_updateAdmin9_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_updateAdmin9_invoker.call(LoginController_2.updateAdmin(id))
      }
  
    // @LINE:23
    case controllers_HomeController_usersAdmin10_route(params@_) =>
      call { 
        controllers_HomeController_usersAdmin10_invoker.call(HomeController_0.usersAdmin)
      }
  
    // @LINE:24
    case controllers_HomeController_usersEmployee11_route(params@_) =>
      call { 
        controllers_HomeController_usersEmployee11_invoker.call(HomeController_0.usersEmployee)
      }
  
    // @LINE:27
    case controllers_LoginController_addAdmin12_route(params@_) =>
      call { 
        controllers_LoginController_addAdmin12_invoker.call(LoginController_2.addAdmin)
      }
  
    // @LINE:28
    case controllers_LoginController_addAdminSubmit13_route(params@_) =>
      call { 
        controllers_LoginController_addAdminSubmit13_invoker.call(LoginController_2.addAdminSubmit)
      }
  
    // @LINE:30
    case controllers_LoginController_addEmployee14_route(params@_) =>
      call { 
        controllers_LoginController_addEmployee14_invoker.call(LoginController_2.addEmployee)
      }
  
    // @LINE:31
    case controllers_LoginController_addEmployeeSubmit15_route(params@_) =>
      call { 
        controllers_LoginController_addEmployeeSubmit15_invoker.call(LoginController_2.addEmployeeSubmit)
      }
  
    // @LINE:33
    case controllers_LoginController_login16_route(params@_) =>
      call { 
        controllers_LoginController_login16_invoker.call(LoginController_2.login)
      }
  
    // @LINE:34
    case controllers_LoginController_loginSubmit17_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit17_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:36
    case controllers_LoginController_logout18_route(params@_) =>
      call { 
        controllers_LoginController_logout18_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:39
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
