
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Employee], addressForm: Form[models.users.Address], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.Employee
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add an employee", user)/*6.31*/{_display_(Seq[Any](format.raw/*6.32*/("""
    """),_display_(/*7.6*/if(flash.containsKey("error"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-danger">
			"""),_display_(/*9.5*/flash/*9.10*/.get("error")),format.raw/*9.23*/("""
		"""),format.raw/*10.3*/("""</div>
	""")))}),format.raw/*11.3*/("""

    """),format.raw/*13.5*/("""<p class="lead">Add a new employee</p>

    """),_display_(/*15.6*/form(action=routes.LoginController.addEmployeeSubmit(),'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*16.58*/ {_display_(Seq[Any](format.raw/*16.60*/("""
        """),_display_(/*17.10*/CSRF/*17.14*/.formField),format.raw/*17.24*/("""

            """),_display_(/*19.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*19.88*/("""
            """),_display_(/*20.14*/inputText(userForm("empFirstName"), '_label -> "First name", 'class -> "form-control")),format.raw/*20.100*/("""
            """),_display_(/*21.14*/inputText(userForm("empLastName"), '_label -> "Last name", 'class -> "form-control")),format.raw/*21.98*/("""
            """),_display_(/*22.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*22.114*/("""
            """),_display_(/*23.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*23.98*/("""
            """),_display_(/*24.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*24.103*/("""

            """),_display_(/*26.14*/select(
                userForm("department.id"),
                options(Department.options),
                '_label -> "Department", '_default -> "-- Choose a department --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*31.14*/("""

            """),format.raw/*33.13*/("""Address:
            """),_display_(/*34.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*34.93*/("""
            """),_display_(/*35.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*35.93*/("""
            """),_display_(/*36.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*36.89*/("""
            """),_display_(/*37.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*37.97*/("""

            """),_display_(/*39.14*/inputText(userForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*39.105*/("""
            """),_display_(/*40.14*/inputText(userForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*40.75*/("""
            """),_display_(/*41.14*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*41.78*/("""
            """),format.raw/*42.13*/("""<label>Upload profile picture</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*47.27*/routes/*47.33*/.HomeController.index),format.raw/*47.54*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*51.6*/(""" """),format.raw/*51.24*/("""
""")))}),format.raw/*52.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 18:26:49 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addEmployee.scala.html
                  HASH: 4af6d7d16f3d7b5bf6b758df5d7c1186304f05a4
                  MATRIX: 1024->1|1206->113|1242->143|1286->111|1313->159|1340->161|1377->190|1415->191|1446->197|1484->227|1523->229|1552->232|1614->269|1627->274|1660->287|1690->290|1729->299|1762->305|1833->350|2000->508|2040->510|2077->520|2090->524|2121->534|2163->549|2258->623|2299->637|2407->723|2448->737|2553->821|2594->835|2716->935|2757->949|2862->1033|2903->1047|3014->1136|3056->1151|3338->1412|3380->1426|3429->1448|3529->1527|3570->1541|3670->1620|3711->1634|3807->1709|3848->1723|3952->1806|3994->1821|4107->1912|4148->1926|4230->1987|4271->2001|4356->2065|4397->2078|4690->2344|4705->2350|4747->2371|4907->2501|4936->2519|4968->2521
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|46->15|47->16|47->16|48->17|48->17|48->17|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|57->26|62->31|64->33|65->34|65->34|66->35|66->35|67->36|67->36|68->37|68->37|70->39|70->39|71->40|71->40|72->41|72->41|73->42|78->47|78->47|78->47|82->51|82->51|83->52
                  -- GENERATED --
              */
          