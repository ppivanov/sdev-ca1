
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
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("error")),format.raw/*9.23*/("""
		"""),format.raw/*10.3*/("""</div>
	""")))}),format.raw/*11.3*/("""

    """),format.raw/*13.5*/("""<p class="lead">Add a new employee</p>

    """),_display_(/*15.6*/form(action=routes.LoginController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*15.107*/ {_display_(Seq[Any](format.raw/*15.109*/("""
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""

            """),_display_(/*18.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*18.88*/("""
            """),_display_(/*19.14*/inputText(userForm("fname"), '_label -> "First name", 'class -> "form-control")),format.raw/*19.93*/("""
            """),_display_(/*20.14*/inputText(userForm("lname"), '_label -> "Last name", 'class -> "form-control")),format.raw/*20.92*/("""
            """),_display_(/*21.14*/inputDate(userForm("dob"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*21.114*/("""
            """),_display_(/*22.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*22.98*/("""
            """),_display_(/*23.14*/inputText(userForm("mobileNumber"), '_label -> "Mobile number", 'class -> "form-control")),format.raw/*23.103*/("""

            """),format.raw/*25.13*/("""Address:
            """),_display_(/*26.14*/inputText(addressForm("number"), '_label -> "Number", 'class -> "form-control")),format.raw/*26.93*/("""
            """),_display_(/*27.14*/inputText(addressForm("street"), '_label -> "Street", 'class -> "form-control")),format.raw/*27.93*/("""
            """),_display_(/*28.14*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*28.89*/("""
            """),_display_(/*29.14*/inputText(addressForm("postCode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*29.97*/("""

            """),_display_(/*31.14*/inputText(userForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*31.105*/("""
            
            """),format.raw/*33.13*/("""<label>Upload Profile Image</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*38.27*/routes/*38.33*/.HomeController.index),format.raw/*38.54*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*42.6*/(""" """),format.raw/*42.24*/("""
""")))}),format.raw/*43.2*/(""" """))
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
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addEmployee.scala.html
                  HASH: 487bdf61d588c9838467947865fc6ade3211dd4c
                  MATRIX: 1024->1|1206->113|1242->143|1286->111|1313->159|1340->161|1377->190|1415->191|1446->197|1484->227|1523->229|1552->232|1615->270|1628->275|1661->288|1691->291|1730->300|1763->306|1834->351|1945->452|1986->454|2023->464|2036->468|2067->478|2109->493|2204->567|2245->581|2345->660|2386->674|2485->752|2526->766|2648->866|2689->880|2794->964|2835->978|2946->1067|2988->1081|3037->1103|3137->1182|3178->1196|3278->1275|3319->1289|3415->1364|3456->1378|3560->1461|3602->1476|3715->1567|3769->1593|4060->1857|4075->1863|4117->1884|4277->2014|4306->2032|4338->2034
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|57->26|57->26|58->27|58->27|59->28|59->28|60->29|60->29|62->31|62->31|64->33|69->38|69->38|69->38|73->42|73->42|74->43
                  -- GENERATED --
              */
          