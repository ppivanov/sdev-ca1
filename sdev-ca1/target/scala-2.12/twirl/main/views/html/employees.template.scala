
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employee],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees", user)/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<h1>Current employees</h1>

	"""),_display_(/*5.3*/if(flash.containsKey("success"))/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
		"""),format.raw/*6.3*/("""<div class="alert alert-success">
			"""),_display_(/*7.5*/flash/*7.10*/.get("success")),format.raw/*7.25*/("""
		"""),format.raw/*8.3*/("""</div>
""")))}),format.raw/*9.2*/("""

   """),format.raw/*11.4*/("""<div class="col-sm-9">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Date of birth</th>
            <th>Mobile number</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),_display_(/*26.14*/for(e <- employees) yield /*26.33*/ {_display_(Seq[Any](format.raw/*26.35*/("""
                """),_display_(/*27.18*/if(e.getRole() != "admin")/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""
               """),format.raw/*28.16*/("""<tr>
                  <td>"""),_display_(/*29.24*/e/*29.25*/.getEmail),format.raw/*29.34*/("""</td>
                  <td>"""),_display_(/*30.24*/e/*30.25*/.getEmpFirstName),format.raw/*30.41*/("""</td>
                  <td>"""),_display_(/*31.24*/e/*31.25*/.getEmpLastName),format.raw/*31.40*/("""</td>
                  <td>"""),_display_(/*32.24*/e/*32.25*/.getDateOfBirthString),format.raw/*32.46*/("""</td>
                  <td>"""),_display_(/*33.24*/e/*33.25*/.getMobileNumber),format.raw/*33.41*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*36.18*/routes/*36.24*/.LoginController.updateAdmin(e.getEmail)),format.raw/*36.64*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*42.18*/routes/*42.24*/.LoginController.deleteAdmin(e.getEmail)),format.raw/*42.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
                """)))}),format.raw/*47.18*/("""
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.LoginController.addEmployee()),format.raw/*54.55*/("""">
            <button class="btn btn-primary">Register a new employee</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.users.Employee],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 14:43:42 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/employees.scala.html
                  HASH: 1c4faa0a0ba255826463539643d05336258f88d3
                  MATRIX: 995->1|1158->72|1189->95|1227->96|1258->101|1313->131|1353->163|1392->165|1421->168|1484->206|1497->211|1532->226|1561->229|1598->237|1630->242|2077->662|2112->681|2152->683|2197->701|2232->727|2271->728|2315->744|2370->772|2380->773|2410->782|2466->811|2476->812|2513->828|2569->857|2579->858|2615->873|2671->902|2681->903|2723->924|2779->953|2789->954|2826->970|2928->1045|2943->1051|3004->1091|3231->1291|3246->1297|3307->1337|3537->1536|3582->1550|3627->1568|3703->1617|3718->1623|3769->1653
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|42->11|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|67->36|67->36|67->36|73->42|73->42|73->42|78->47|79->48|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          