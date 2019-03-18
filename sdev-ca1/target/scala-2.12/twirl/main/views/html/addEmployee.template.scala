
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

    """),_display_(/*15.6*/form(action=routes.LoginController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*15.107*/ {_display_(Seq[Any](format.raw/*15.109*/("""
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""

            """),_display_(/*18.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*18.88*/("""
            """),_display_(/*19.14*/inputText(userForm("empFirstName"), '_label -> "First name", 'class -> "form-control")),format.raw/*19.100*/("""
            """),_display_(/*20.14*/inputText(userForm("empLastName"), '_label -> "Last name", 'class -> "form-control")),format.raw/*20.98*/("""
            """),_display_(/*21.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*21.114*/("""
            """),_display_(/*22.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*22.98*/("""
            """),_display_(/*23.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*23.103*/("""

            """),_display_(/*25.14*/select(
                userForm("department.id"),
                options(Department.options),
                '_label -> "Department", '_default -> "-- Choose a department --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*30.14*/("""

            """),format.raw/*32.13*/("""Address:
            """),_display_(/*33.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*33.93*/("""
            """),_display_(/*34.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*34.93*/("""
            """),_display_(/*35.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*35.89*/("""
            """),_display_(/*36.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*36.97*/("""

            """),_display_(/*38.14*/inputText(userForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*38.105*/("""
            """),_display_(/*39.14*/inputText(userForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*39.75*/("""
            """),format.raw/*40.13*/("""<label>Upload profile picture</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.HomeController.index),format.raw/*45.54*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*49.6*/(""" """),format.raw/*49.24*/("""
""")))}),format.raw/*50.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:55:43 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addEmployee.scala.html
                  HASH: 922ae72361923278a34dc0a078f0d10648e56812
                  MATRIX: 1024->1|1206->113|1242->143|1286->111|1313->159|1340->161|1377->190|1415->191|1446->197|1484->227|1523->229|1552->232|1614->269|1627->274|1660->287|1690->290|1729->299|1762->305|1833->350|1944->451|1985->453|2022->463|2035->467|2066->477|2108->492|2203->566|2244->580|2352->666|2393->680|2498->764|2539->778|2661->878|2702->892|2807->976|2848->990|2959->1079|3001->1094|3283->1355|3325->1369|3374->1391|3474->1470|3515->1484|3615->1563|3656->1577|3752->1652|3793->1666|3897->1749|3939->1764|4052->1855|4093->1869|4175->1930|4216->1943|4509->2209|4524->2215|4566->2236|4726->2366|4755->2384|4787->2386
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|61->30|63->32|64->33|64->33|65->34|65->34|66->35|66->35|67->36|67->36|69->38|69->38|70->39|70->39|71->40|76->45|76->45|76->45|80->49|80->49|81->50
                  -- GENERATED --
              */
          