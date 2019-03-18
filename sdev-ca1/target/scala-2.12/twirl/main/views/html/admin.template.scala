
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admins: List[models.users.Employee], departments: List[models.Department], user: models.users.Employee, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrators", user)/*2.30*/{_display_(Seq[Any](format.raw/*2.31*/("""
    """),format.raw/*3.5*/("""<h1>Current administrators</h1>

	"""),_display_(/*5.3*/if(flash.containsKey("success"))/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
		"""),format.raw/*6.3*/("""<div class="alert alert-success">
			"""),_display_(/*7.5*/flash/*7.10*/.get("success")),format.raw/*7.25*/("""
		"""),format.raw/*8.3*/("""</div>
""")))}),format.raw/*9.2*/("""

    """),format.raw/*11.5*/("""<div class="col-sm-9">
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
       
            """),_display_(/*28.14*/for(a<-admins) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
                """),_display_(/*29.18*/if(a.getRole() == "admin")/*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
               """),format.raw/*30.16*/("""<tr>
                    """),_display_(/*31.22*/if(env.resource("public/images/profileImages/" + a.getId + "thumb.jpg").isDefined)/*31.104*/ {_display_(Seq[Any](format.raw/*31.106*/("""
                        """),format.raw/*32.25*/("""<td><img src="/assets/images/profileImages/"""),_display_(/*32.69*/(a.getId + "thumb.jpg")),format.raw/*32.92*/(""""/></td>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<td><img src="/assets/images/profileImages/noImage.jpg"/></td>
                    """)))}),format.raw/*35.22*/("""
                  """),format.raw/*36.19*/("""<td>"""),_display_(/*36.24*/a/*36.25*/.getEmail),format.raw/*36.34*/("""</td>
                  <td>"""),_display_(/*37.24*/a/*37.25*/.getEmpFirstName),format.raw/*37.41*/("""</td>
                  <td>"""),_display_(/*38.24*/a/*38.25*/.getEmpLastName),format.raw/*38.40*/("""</td>
                  <td>"""),_display_(/*39.24*/a/*39.25*/.getDateOfBirthString),format.raw/*39.46*/("""</td>
                  <td>"""),_display_(/*40.24*/a/*40.25*/.getMobileNumber),format.raw/*40.41*/("""</td>
                  <td>"""),_display_(/*41.24*/a/*41.25*/.getDepartment.getName),format.raw/*41.47*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*44.18*/routes/*44.24*/.LoginController.updateAdmin(a.getEmail)),format.raw/*44.64*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*50.18*/routes/*50.24*/.LoginController.deleteAdmin(a.getEmail)),format.raw/*50.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
                """)))}),format.raw/*55.18*/("""
            """)))}),format.raw/*56.14*/("""
        
        """),format.raw/*58.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*62.19*/routes/*62.25*/.LoginController.addAdmin()),format.raw/*62.52*/("""">
            <button class="btn btn-primary">Add a new administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(admins:List[models.users.Employee],departments:List[models.Department],user:models.users.Employee,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(admins,departments,user,env)

  def f:((List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (admins,departments,user,env) => apply(admins,departments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 18:26:49 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/admin.scala.html
                  HASH: a0137e1ab03508a4292c5672e638805168b79c59
                  MATRIX: 1036->1|1261->134|1297->162|1335->163|1366->168|1426->203|1466->235|1505->237|1534->240|1597->278|1610->283|1645->298|1674->301|1711->309|1744->315|2260->804|2290->818|2330->820|2375->838|2410->864|2449->865|2493->881|2546->907|2638->989|2679->991|2732->1016|2803->1060|2847->1083|2896->1114|2909->1119|2948->1120|3001->1145|3116->1229|3163->1248|3195->1253|3205->1254|3235->1263|3291->1292|3301->1293|3338->1309|3394->1338|3404->1339|3440->1354|3496->1383|3506->1384|3548->1405|3604->1434|3614->1435|3651->1451|3707->1480|3717->1481|3760->1503|3862->1578|3877->1584|3938->1624|4165->1824|4180->1830|4241->1870|4471->2069|4516->2083|4561->2101|4637->2150|4652->2156|4700->2183
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|42->11|59->28|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|75->44|75->44|75->44|81->50|81->50|81->50|86->55|87->56|89->58|93->62|93->62|93->62
                  -- GENERATED --
              */
          