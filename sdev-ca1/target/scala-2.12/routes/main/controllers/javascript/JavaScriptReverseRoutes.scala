// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Mon Mar 18 21:13:15 GMT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:11
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-project"})
        }
      """
    )
  
    // @LINE:11
    def showMyProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.showMyProjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my-projects"})
        }
      """
    )
  
    // @LINE:15
    def deleteProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteProject",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete-project/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def updateProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.updateProject",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update-project/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def addProjectSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addProjectSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-project-submit"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def projects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.projects",
      """
        function(empid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("empid", empid0))})
        }
      """
    )
  
    // @LINE:25
    def usersAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.usersAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admins"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:26
    def usersEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.usersEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def addEmployeeSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.addEmployeeSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-employee-submit"})
        }
      """
    )
  
    // @LINE:36
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login-lubmit"})
        }
      """
    )
  
    // @LINE:19
    def deleteEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.deleteEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete-employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def addAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.addAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-admin"})
        }
      """
    )
  
    // @LINE:23
    def updateAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.updateAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update-admin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def deleteAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.deleteAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete-admin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:38
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:22
    def updateEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.updateEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update-employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:32
    def addEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.addEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-employee"})
        }
      """
    )
  
    // @LINE:30
    def addAdminSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.addAdminSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-admin-submit"})
        }
      """
    )
  
    // @LINE:35
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
