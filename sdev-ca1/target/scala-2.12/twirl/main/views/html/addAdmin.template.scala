
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
    """),format.raw/*7.5*/("""<p class="lead">Add a new administrator</p>

    """),_display_(/*9.6*/form(action=routes.LoginController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.104*/ {_display_(Seq[Any](format.raw/*9.106*/("""
        """),format.raw/*10.37*/("""
        """),format.raw/*11.99*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""

            """),_display_(/*14.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.88*/("""
            """),_display_(/*15.14*/inputText(userForm("fname"), '_label -> "First name", 'class -> "form-control")),format.raw/*15.93*/("""
            """),_display_(/*16.14*/inputText(userForm("lname"), '_label -> "Last name", 'class -> "form-control")),format.raw/*16.92*/("""
            """),_display_(/*17.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*17.114*/("""
            """),_display_(/*18.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*18.94*/("""
            """),_display_(/*19.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*19.103*/("""

            """),format.raw/*21.13*/("""Address:
            """),_display_(/*22.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*22.93*/("""
            """),_display_(/*23.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*23.93*/("""
            """),_display_(/*24.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*24.89*/("""
            """),_display_(/*25.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*25.97*/("""

            """),_display_(/*27.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*27.102*/("""
            
            """),format.raw/*29.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.index()),format.raw/*31.56*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*35.6*/(""" """),format.raw/*35.24*/("""
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 01:12:30 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addAdmin.scala.html
                  HASH: a0c1025a1a9c433a308aac7bff255b5ceba884f8
                  MATRIX: 1021->1|1203->113|1239->143|1283->111|1310->159|1337->161|1379->195|1417->196|1448->201|1523->251|1630->349|1670->351|1707->388|1744->487|1781->497|1794->501|1825->511|1867->526|1962->600|2003->614|2103->693|2144->707|2243->785|2284->799|2406->899|2447->913|2548->993|2589->1007|2700->1096|2742->1110|2791->1132|2891->1211|2932->1225|3032->1304|3073->1318|3169->1393|3210->1407|3314->1490|3356->1505|3466->1593|3520->1619|3682->1754|3697->1760|3741->1783|3901->1913|3930->1931|3962->1933
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|58->27|60->29|62->31|62->31|62->31|66->35|66->35|67->36
                  -- GENERATED --
              */
          