// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/conf/routes
// @DATE:Sun Mar 17 01:55:07 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:11
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add-project")
    }
  
    // @LINE:13
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete-project/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update-project/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add-project-submit")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def usersEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:9
    def projects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projects")
    }
  
    // @LINE:23
    def usersAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admins")
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add-employee-submit")
    }
  
    // @LINE:34
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login-lubmit")
    }
  
    // @LINE:17
    def deleteEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete-employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:27
    def addAdmin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add-admin")
    }
  
    // @LINE:21
    def updateAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update-admin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:18
    def deleteAdmin(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete-admin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:36
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def updateEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update-employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:30
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add-employee")
    }
  
    // @LINE:28
    def addAdminSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add-admin-submit")
    }
  
    // @LINE:33
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:39
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
