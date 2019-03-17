
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employee],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admins: List[models.users.Employee],user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrators",user)/*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""
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
            <th>Email</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Date of birth</th>
            <th>Mobile number</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),_display_(/*26.14*/for(a<-admins) yield /*26.28*/ {_display_(Seq[Any](format.raw/*26.30*/("""
                """),_display_(/*27.18*/if(a.getRole() == "admin")/*27.44*/{_display_(Seq[Any](format.raw/*27.45*/("""
               """),format.raw/*28.16*/("""<tr>
                  <td>"""),_display_(/*29.24*/a/*29.25*/.getEmail),format.raw/*29.34*/("""</td>
                  <td>"""),_display_(/*30.24*/a/*30.25*/.getEmpFirstName),format.raw/*30.41*/("""</td>
                  <td>"""),_display_(/*31.24*/a/*31.25*/.getEmpLastName),format.raw/*31.40*/("""</td>
                  <td>"""),_display_(/*32.24*/a/*32.25*/.getDateOfBirthString),format.raw/*32.46*/("""</td>
                  <td>"""),_display_(/*33.24*/a/*33.25*/.getMobileNumber),format.raw/*33.41*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*36.18*/routes/*36.24*/.LoginController.updateAdmin(a.getEmail)),format.raw/*36.64*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*42.18*/routes/*42.24*/.LoginController.deleteAdmin(a.getEmail)),format.raw/*42.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
                """)))}),format.raw/*47.18*/("""
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.LoginController.addAdmin()),format.raw/*54.52*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(admins:List[models.users.Employee],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(admins,user)

  def f:((List[models.users.Employee],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (admins,user) => apply(admins,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 01:14:10 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/admin.scala.html
                  HASH: 7ab16421952264db42b1f3e355aed3d592542ce8
                  MATRIX: 991->1|1150->68|1185->95|1223->96|1254->101|1314->136|1354->168|1393->170|1422->173|1485->211|1498->216|1533->231|1562->234|1599->242|1632->248|2079->668|2109->682|2149->684|2194->702|2229->728|2268->729|2312->745|2367->773|2377->774|2407->783|2463->812|2473->813|2510->829|2566->858|2576->859|2612->874|2668->903|2678->904|2720->925|2776->954|2786->955|2823->971|2925->1046|2940->1052|3001->1092|3228->1292|3243->1298|3304->1338|3534->1537|3579->1551|3624->1569|3700->1618|3715->1624|3763->1651
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|42->11|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|67->36|67->36|67->36|73->42|73->42|73->42|78->47|79->48|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          