
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
    """),format.raw/*7.5*/("""<p class="lead">Add a new administrator</p>

    """),_display_(/*9.6*/form(action=routes.LoginController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.104*/ {_display_(Seq[Any](format.raw/*9.106*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

            """),_display_(/*12.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*12.88*/("""
            """),_display_(/*13.14*/inputText(userForm("fname"), '_label -> "First name", 'class -> "form-control")),format.raw/*13.93*/("""
            """),_display_(/*14.14*/inputText(userForm("lname"), '_label -> "Last name", 'class -> "form-control")),format.raw/*14.92*/("""
            """),_display_(/*15.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*15.114*/("""
            """),_display_(/*16.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.94*/("""
            """),_display_(/*17.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*17.103*/("""

            """),format.raw/*19.13*/("""Address:
            """),_display_(/*20.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*20.93*/("""
            """),_display_(/*21.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*21.93*/("""
            """),_display_(/*22.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*22.89*/("""
            """),_display_(/*23.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*23.97*/("""

            """),_display_(/*25.14*/inputText(userForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*25.105*/("""
            
            """),format.raw/*27.13*/("""<label>Upload Profile Image</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*32.27*/routes/*32.33*/.HomeController.index),format.raw/*32.54*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*36.6*/(""" """),format.raw/*36.24*/("""
""")))}),format.raw/*37.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 01:13:54 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addEmployee.scala.html
                  HASH: 2ed6c87b6b7330a4088bb0b3aef68f9c64997346
                  MATRIX: 1024->1|1206->113|1242->143|1286->111|1313->159|1340->161|1377->190|1415->191|1446->196|1521->246|1628->344|1668->346|1705->356|1718->360|1749->370|1791->385|1886->459|1927->473|2027->552|2068->566|2167->644|2208->658|2330->758|2371->772|2472->852|2513->866|2624->955|2666->969|2715->991|2815->1070|2856->1084|2956->1163|2997->1177|3093->1252|3134->1266|3238->1349|3280->1364|3393->1455|3447->1481|3738->1745|3753->1751|3795->1772|3955->1902|3984->1920|4016->1922
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|56->25|58->27|63->32|63->32|63->32|67->36|67->36|68->37
                  -- GENERATED --
              */
          