
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
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
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
                  DATE: Sun Mar 17 14:43:42 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/login.scala.html
                  HASH: 4f402018afbdd14393781f082b2d1eeb721ae8eb
                  MATRIX: 988->1|1127->69|1171->85|1198->87|1225->106|1264->108|1295->113|1392->185|1429->214|1468->216|1503->225|1574->270|1621->302|1660->304|1705->322|1715->323|1744->331|1794->350|1830->359|1870->369|1899->372|1938->402|1978->404|2008->407|2072->445|2086->450|2120->463|2150->466|2189->475|2221->480|2275->508|2290->514|2363->578|2403->580|2440->590|2453->594|2484->604|2529->622|2594->660|2732->777|2768->786|2848->839|2996->966|3041->984|3205->1118|3234->1136|3266->1138
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|56->25|57->26|59->28|60->29|62->31|66->35|66->35|67->36
                  -- GENERATED --
              */
          