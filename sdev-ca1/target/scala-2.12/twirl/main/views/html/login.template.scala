
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display login errors if there are any-->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-danger">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
	"""),_display_(/*14.3*/if(flash.containsKey("error"))/*14.33*/ {_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<div class="alert alert-success">
			"""),_display_(/*16.5*/flash/*16.10*/.get("error")),format.raw/*16.23*/("""
		"""),format.raw/*17.3*/("""</div>
	""")))}),format.raw/*18.3*/("""
    """),format.raw/*19.5*/("""<!-- The login form-->
    """),_display_(/*20.6*/helper/*20.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*20.76*/ {_display_(Seq[Any](format.raw/*20.78*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""
        
        """),format.raw/*23.9*/("""<div class="form-group">
            """),_display_(/*24.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.72*/("""
        """),format.raw/*26.9*/("""</div>
        <div class="form-group">
            """),_display_(/*28.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.75*/("""
        
        """),format.raw/*31.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*35.6*/(""" """),format.raw/*35.24*/("""
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 18:26:49 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/login.scala.html
                  HASH: 6db5e752daf10802515ca3ec8361f253c8d81ea8
                  MATRIX: 988->1|1127->69|1171->85|1198->87|1225->106|1264->108|1295->113|1392->185|1429->214|1468->216|1503->225|1573->269|1620->301|1659->303|1704->321|1714->322|1743->330|1793->349|1829->358|1869->368|1898->371|1937->401|1977->403|2007->406|2071->444|2085->449|2119->462|2149->465|2188->474|2220->479|2274->507|2289->513|2362->577|2402->579|2439->589|2452->593|2483->603|2528->621|2593->659|2731->776|2767->785|2847->838|2995->965|3040->983|3204->1117|3233->1135|3265->1137
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|56->25|57->26|59->28|60->29|62->31|66->35|66->35|67->36
                  -- GENERATED --
              */
          