
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], departments: List[models.Department], user: models.users.Employee, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
            <th>Profile picture</th>
            <th>Email</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Date of birth</th>
            <th>Mobile number</th>
            <th>Department</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),_display_(/*28.14*/for(e <- employees) yield /*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""
                """),_display_(/*29.18*/if(e.getRole() != "admin")/*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
               """),format.raw/*30.16*/("""<tr>
                    """),_display_(/*31.22*/if(env.resource("public/images/profileImages/" + e.getId + "thumb.jpg").isDefined)/*31.104*/ {_display_(Seq[Any](format.raw/*31.106*/("""
                        """),format.raw/*32.25*/("""<td><img src="/assets/images/profileImages/"""),_display_(/*32.69*/(e.getId + "thumb.jpg")),format.raw/*32.92*/(""""/></td>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<td><img src="/assets/images/profileImages/noImage.jpg"/></td>
                    """)))}),format.raw/*35.22*/("""
                  """),format.raw/*36.19*/("""<td>"""),_display_(/*36.24*/e/*36.25*/.getEmail),format.raw/*36.34*/("""</td>
                  <td>"""),_display_(/*37.24*/e/*37.25*/.getEmpFirstName),format.raw/*37.41*/("""</td>
                  <td>"""),_display_(/*38.24*/e/*38.25*/.getEmpLastName),format.raw/*38.40*/("""</td>
                  <td>"""),_display_(/*39.24*/e/*39.25*/.getDateOfBirthString),format.raw/*39.46*/("""</td>
                  <td>"""),_display_(/*40.24*/e/*40.25*/.getMobileNumber),format.raw/*40.41*/("""</td>
                  <td>"""),_display_(/*41.24*/e/*41.25*/.getDepartment.getName),format.raw/*41.47*/("""</td>

                  """),_display_(/*43.20*/if(user != null)/*43.36*/{_display_(Seq[Any](format.raw/*43.37*/("""
                  """),format.raw/*44.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*46.18*/routes/*46.24*/.LoginController.updateEmployee(e.getEmail)),format.raw/*46.67*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                        """),_display_(/*50.26*/if("admin".equals(user.getRole()))/*50.60*/{_display_(Seq[Any](format.raw/*50.61*/("""
                  """),format.raw/*51.19*/("""<!-- Delete button -->
						<td>
							<a href=""""),_display_(/*53.18*/routes/*53.24*/.LoginController.deleteEmployee(e.getEmail)),format.raw/*53.67*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                        """)))}),format.raw/*57.26*/("""
                    """)))}),format.raw/*58.22*/("""
               """),format.raw/*59.16*/("""</tr>
                """)))}),format.raw/*60.18*/("""
            """)))}),format.raw/*61.14*/("""
        
        """),format.raw/*63.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*67.19*/routes/*67.25*/.LoginController.addEmployee()),format.raw/*67.55*/("""">
            <button class="btn btn-primary">Register a new employee</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],departments:List[models.Department],user:models.users.Employee,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,departments,user,env)

  def f:((List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,departments,user,env) => apply(employees,departments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:22:09 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/employees.scala.html
                  HASH: 69229ae43d54410e8e9ebe9e287ed61a6b76d8a7
                  MATRIX: 1040->1|1268->137|1299->160|1337->161|1368->166|1423->196|1463->228|1502->230|1531->233|1594->271|1607->276|1642->291|1671->294|1708->302|1740->307|2256->796|2291->815|2331->817|2376->835|2411->861|2450->862|2494->878|2547->904|2639->986|2680->988|2733->1013|2804->1057|2848->1080|2897->1111|2910->1116|2949->1117|3002->1142|3117->1226|3164->1245|3196->1250|3206->1251|3236->1260|3292->1289|3302->1290|3339->1306|3395->1335|3405->1336|3441->1351|3497->1380|3507->1381|3549->1402|3605->1431|3615->1432|3652->1448|3708->1477|3718->1478|3761->1500|3814->1526|3839->1542|3878->1543|3925->1562|4003->1613|4018->1619|4082->1662|4265->1818|4308->1852|4347->1853|4394->1872|4472->1923|4487->1929|4551->1972|4768->2158|4821->2180|4865->2196|4919->2219|4964->2233|5009->2251|5085->2300|5100->2306|5151->2336
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|42->11|59->28|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|81->50|81->50|81->50|82->51|84->53|84->53|84->53|88->57|89->58|90->59|91->60|92->61|94->63|98->67|98->67|98->67
                  -- GENERATED --
              */
          