
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

    """),_display_(/*14.6*/form(action=routes.LoginController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*15.58*/ {_display_(Seq[Any](format.raw/*15.60*/("""
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

            """),_display_(/*38.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*38.102*/("""

            """),format.raw/*40.13*/("""<label>Upload profile picture</label>
            <input class="btn-sm btn-default" type="file" name="upload">
            
            <div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.HomeController.index()),format.raw/*45.56*/("""">
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
                  DATE: Mon Mar 18 18:26:49 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addAdmin.scala.html
                  HASH: d400a8dc50853261cad71f7bfc319f0adf5f322d
                  MATRIX: 1021->1|1203->113|1239->143|1283->111|1310->159|1337->161|1379->195|1417->196|1448->202|1486->232|1525->234|1554->237|1616->274|1629->279|1662->292|1692->295|1731->304|1763->309|1839->359|2004->515|2044->517|2081->527|2094->531|2125->541|2167->556|2262->630|2303->644|2411->730|2452->744|2557->828|2598->842|2720->942|2761->956|2866->1040|2907->1054|3018->1143|3060->1158|3342->1419|3384->1433|3433->1455|3533->1534|3574->1548|3674->1627|3715->1641|3811->1716|3852->1730|3956->1813|3998->1828|4108->1916|4150->1930|4448->2201|4463->2207|4507->2230|4667->2360|4696->2378|4728->2380
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|45->14|46->15|46->15|47->16|47->16|47->16|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|61->30|63->32|64->33|64->33|65->34|65->34|66->35|66->35|67->36|67->36|69->38|69->38|71->40|76->45|76->45|76->45|80->49|80->49|81->50
                  -- GENERATED --
              */
          