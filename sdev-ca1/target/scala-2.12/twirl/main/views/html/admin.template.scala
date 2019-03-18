
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
                """),format.raw/*30.17*/("""<tr>
                    """),_display_(/*31.22*/if(env.resource("public/images/profileImages/" + a.getId + "thumb.jpg").isDefined)/*31.104*/ {_display_(Seq[Any](format.raw/*31.106*/("""
                        """),format.raw/*32.25*/("""<td><img src="/assets/images/profileImages/"""),_display_(/*32.69*/(a.getId + "thumb.jpg")),format.raw/*32.92*/(""""/></td>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<td><img src="/assets/images/profileImages/noImage.jpg"/></td>
                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""<td>"""),_display_(/*36.26*/a/*36.27*/.getEmail),format.raw/*36.36*/("""</td>
                    <td>"""),_display_(/*37.26*/a/*37.27*/.getEmpFirstName),format.raw/*37.43*/("""</td>
                    <td>"""),_display_(/*38.26*/a/*38.27*/.getEmpLastName),format.raw/*38.42*/("""</td>
                    <td>"""),_display_(/*39.26*/a/*39.27*/.getDateOfBirthString),format.raw/*39.48*/("""</td>
                    <td>"""),_display_(/*40.26*/a/*40.27*/.getMobileNumber),format.raw/*40.43*/("""</td>
                    <td>"""),_display_(/*41.26*/a/*41.27*/.getDepartment.getName),format.raw/*41.49*/("""</td>
                  
                    """),_display_(/*43.22*/if(user != null)/*43.38*/{_display_(Seq[Any](format.raw/*43.39*/("""
                    """),format.raw/*44.21*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*46.18*/routes/*46.24*/.LoginController.updateAdmin(a.getEmail)),format.raw/*46.64*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                        """),_display_(/*50.26*/if("admin".equals(user.getRole()))/*50.60*/{_display_(Seq[Any](format.raw/*50.61*/("""
                    """),format.raw/*51.21*/("""<!-- Delete button -->
						<td>
							<a href=""""),_display_(/*53.18*/routes/*53.24*/.LoginController.deleteAdmin(a.getEmail)),format.raw/*53.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
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
        <a href=""""),_display_(/*67.19*/routes/*67.25*/.LoginController.addAdmin()),format.raw/*67.52*/("""">
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
                  DATE: Mon Mar 18 21:22:09 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/admin.scala.html
                  HASH: ea322d418d04e05410f19f77a10b4b71867c80a5
                  MATRIX: 1036->1|1261->134|1297->162|1335->163|1366->168|1426->203|1466->235|1505->237|1534->240|1597->278|1610->283|1645->298|1674->301|1711->309|1744->315|2260->804|2290->818|2330->820|2375->838|2410->864|2449->865|2494->882|2547->908|2639->990|2680->992|2733->1017|2804->1061|2848->1084|2897->1115|2910->1120|2949->1121|3002->1146|3117->1230|3166->1251|3198->1256|3208->1257|3238->1266|3296->1297|3306->1298|3343->1314|3401->1345|3411->1346|3447->1361|3505->1392|3515->1393|3557->1414|3615->1445|3625->1446|3662->1462|3720->1493|3730->1494|3773->1516|3846->1562|3871->1578|3910->1579|3959->1600|4037->1651|4052->1657|4113->1697|4296->1853|4339->1887|4378->1888|4427->1909|4505->1960|4520->1966|4581->2006|4798->2192|4851->2214|4895->2230|4949->2253|4994->2267|5039->2285|5115->2334|5130->2340|5178->2367
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|42->11|59->28|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|81->50|81->50|81->50|82->51|84->53|84->53|84->53|88->57|89->58|90->59|91->60|92->61|94->63|98->67|98->67|98->67
                  -- GENERATED --
              */
          