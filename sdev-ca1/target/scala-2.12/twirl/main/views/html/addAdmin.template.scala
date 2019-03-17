
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Employee], addressForm: Form[models.users.Address], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.Employee
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add an administrator", user)/*6.36*/{_display_(Seq[Any](format.raw/*6.37*/("""
    """),_display_(/*7.6*/if(flash.containsKey("error"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("error")),format.raw/*9.23*/("""
		"""),format.raw/*10.3*/("""</div>
	""")))}),format.raw/*11.3*/("""
    """),format.raw/*12.5*/("""<p class="lead">Add a new administrator</p>

    """),_display_(/*14.6*/form(action=routes.LoginController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*14.104*/ {_display_(Seq[Any](format.raw/*14.106*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("fname"), '_label -> "First name", 'class -> "form-control")),format.raw/*18.93*/("""
            """),_display_(/*19.14*/inputText(userForm("lname"), '_label -> "Last name", 'class -> "form-control")),format.raw/*19.92*/("""
            """),_display_(/*20.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*20.114*/("""
            """),_display_(/*21.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.98*/("""
            """),_display_(/*22.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*22.103*/("""

            """),format.raw/*24.13*/("""Address:
            """),_display_(/*25.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*25.93*/("""
            """),_display_(/*26.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*26.93*/("""
            """),_display_(/*27.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*27.89*/("""
            """),_display_(/*28.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*28.97*/("""

            """),_display_(/*30.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*30.102*/("""
            
            """),format.raw/*32.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.HomeController.index()),format.raw/*34.56*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*38.6*/(""" """),format.raw/*38.24*/("""
""")))}),format.raw/*39.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 14:54:58 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addAdmin.scala.html
                  HASH: c8e67a4d603a34bfa17dd706acc0fc4068ca9f9a
                  MATRIX: 1021->1|1203->113|1239->143|1283->111|1310->159|1337->161|1379->195|1417->196|1448->202|1486->232|1525->234|1554->237|1617->275|1630->280|1663->293|1693->296|1732->305|1764->310|1840->360|1948->458|1989->460|2026->470|2039->474|2070->484|2112->499|2207->573|2248->587|2348->666|2389->680|2488->758|2529->772|2651->872|2692->886|2797->970|2838->984|2949->1073|2991->1087|3040->1109|3140->1188|3181->1202|3281->1281|3322->1295|3418->1370|3459->1384|3563->1467|3605->1482|3715->1570|3769->1596|3931->1731|3946->1737|3990->1760|4150->1890|4179->1908|4211->1910
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|61->30|61->30|63->32|65->34|65->34|65->34|69->38|69->38|70->39
                  -- GENERATED --
              */
          