
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
		"""),format.raw/*8.3*/("""<div class="alert alert-danger">
			"""),_display_(/*9.5*/flash/*9.10*/.get("error")),format.raw/*9.23*/("""
		"""),format.raw/*10.3*/("""</div>
	""")))}),format.raw/*11.3*/("""
    """),format.raw/*12.5*/("""<p class="lead">Add a new administrator</p>

    """),_display_(/*14.6*/form(action=routes.LoginController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*14.104*/ {_display_(Seq[Any](format.raw/*14.106*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("empFirstName"), '_label -> "First name", 'class -> "form-control")),format.raw/*18.100*/("""
            """),_display_(/*19.14*/inputText(userForm("empLastName"), '_label -> "Last name", 'class -> "form-control")),format.raw/*19.98*/("""
            """),_display_(/*20.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*20.114*/("""
            """),_display_(/*21.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.98*/("""
            """),_display_(/*22.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*22.103*/("""

            """),_display_(/*24.14*/select(
                userForm("department.id"),
                options(Department.options),
                '_label -> "Department", '_default -> "-- Choose a department --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*29.14*/("""

            """),format.raw/*31.13*/("""Address:
            """),_display_(/*32.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*32.93*/("""
            """),_display_(/*33.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*33.93*/("""
            """),_display_(/*34.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*34.89*/("""
            """),_display_(/*35.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*35.97*/("""

            """),_display_(/*37.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*37.102*/("""

            """),format.raw/*39.13*/("""<label>Upload profile picture</label>
            <input class="btn-sm btn-default" type="file" name="upload">
            
            <div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*44.27*/routes/*44.33*/.HomeController.index()),format.raw/*44.56*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*48.6*/(""" """),format.raw/*48.24*/("""
""")))}),format.raw/*49.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 14:07:55 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addAdmin.scala.html
                  HASH: a1e96737524c63166a2c2c8e81cda919f2fe93e7
                  MATRIX: 1021->1|1203->113|1239->143|1283->111|1310->159|1337->161|1379->195|1417->196|1448->202|1486->232|1525->234|1554->237|1616->274|1629->279|1662->292|1692->295|1731->304|1763->309|1839->359|1947->457|1988->459|2025->469|2038->473|2069->483|2111->498|2206->572|2247->586|2355->672|2396->686|2501->770|2542->784|2664->884|2705->898|2810->982|2851->996|2962->1085|3004->1100|3286->1361|3328->1375|3377->1397|3477->1476|3518->1490|3618->1569|3659->1583|3755->1658|3796->1672|3900->1755|3942->1770|4052->1858|4094->1872|4392->2143|4407->2149|4451->2172|4611->2302|4640->2320|4672->2322
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|55->24|60->29|62->31|63->32|63->32|64->33|64->33|65->34|65->34|66->35|66->35|68->37|68->37|70->39|75->44|75->44|75->44|79->48|79->48|80->49
                  -- GENERATED --
              */
          