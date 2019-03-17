
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.Employee)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "Projects")/*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""class="active"""")))}),format.raw/*26.55*/("""><a href=""""),_display_(/*26.66*/routes/*26.72*/.HomeController.projects()),format.raw/*26.98*/("""">On Sale</a></li>
			<li """),_display_(/*27.9*/if(pagename == "About")/*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""class="active"""")))}),format.raw/*27.49*/("""><a href=""""),_display_(/*27.60*/routes/*27.66*/.HomeController.about()),format.raw/*27.89*/("""">About us</a></li>
			<li """),_display_(/*28.9*/if(pagename == "Add an employee")/*28.42*/ {_display_(Seq[Any](format.raw/*28.44*/("""class="active"""")))}),format.raw/*28.59*/("""><a href=""""),_display_(/*28.70*/routes/*28.76*/.LoginController.addEmployee()),format.raw/*28.106*/("""">Register user</a></li>
			"""),_display_(/*29.5*/if((user != null) && ("admin".equals(user.getRole())))/*29.59*/ {_display_(Seq[Any](format.raw/*29.61*/("""
				"""),format.raw/*30.5*/("""<li """),_display_(/*30.10*/if(pagename == "Administrators")/*30.42*/ {_display_(Seq[Any](format.raw/*30.44*/("""class="active"""")))}),format.raw/*30.59*/("""><a href=""""),_display_(/*30.70*/routes/*30.76*/.HomeController.usersAdmin()),format.raw/*30.104*/("""">View admins</a></li>
				<li """),_display_(/*31.10*/if(pagename == "Employees")/*31.37*/ {_display_(Seq[Any](format.raw/*31.39*/("""class="active"""")))}),format.raw/*31.54*/("""><a href=""""),_display_(/*31.65*/routes/*31.71*/.HomeController.usersEmployee()),format.raw/*31.102*/("""">View employees</a></li>

			""")))}),format.raw/*33.5*/("""
			
			"""),format.raw/*35.4*/("""<li """),_display_(/*35.9*/if(pagename == "Log In")/*35.33*/ {_display_(Seq[Any](format.raw/*35.35*/("""class="active"""")))}),format.raw/*35.50*/(""">
				"""),_display_(/*36.6*/if(user != null)/*36.22*/ {_display_(Seq[Any](format.raw/*36.24*/("""
					"""),format.raw/*37.6*/("""<a href=""""),_display_(/*37.16*/routes/*37.22*/.LoginController.logout()),format.raw/*37.47*/("""">Log Out</a>
				""")))}/*38.7*/else/*38.12*/{_display_(Seq[Any](format.raw/*38.13*/("""
					"""),format.raw/*39.6*/("""<a href=""""),_display_(/*39.16*/routes/*39.22*/.LoginController.login()),format.raw/*39.46*/("""">Log In</a>
			</li>
""")))}),format.raw/*41.2*/(""" 
		"""),format.raw/*42.3*/("""</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*57.5*/content),format.raw/*57.12*/("""
		    """),format.raw/*58.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*76.17*/routes/*76.23*/.Assets.versioned("javascripts/main.js")),format.raw/*76.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 01:55:52 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/main.scala.html
                  HASH: bbe1b4d31dcb4eb51137ac04d4aa56bd99dd04e0
                  MATRIX: 974->1|1127->61|1409->316|1437->317|1465->318|1550->376|1578->377|1611->383|1648->392|1677->393|1706->394|1782->442|1811->443|1844->449|1884->461|1913->462|1942->463|1989->482|2018->483|2051->489|2090->500|2119->501|2148->502|2215->541|2244->542|2277->548|2316->559|2345->560|2374->561|2440->599|2469->600|2502->606|2539->615|2568->616|2597->617|2637->629|2666->630|2695->632|2744->654|2773->662|3045->907|3076->929|3116->931|3162->946|3200->957|3215->963|3259->986|3313->1013|3348->1039|3388->1041|3434->1056|3472->1067|3487->1073|3534->1099|3587->1126|3619->1149|3659->1151|3705->1166|3743->1177|3758->1183|3802->1206|3856->1234|3898->1267|3938->1269|3984->1284|4022->1295|4037->1301|4089->1331|4144->1360|4207->1414|4247->1416|4279->1421|4311->1426|4352->1458|4392->1460|4438->1475|4476->1486|4491->1492|4541->1520|4600->1552|4636->1579|4676->1581|4722->1596|4760->1607|4775->1613|4828->1644|4889->1675|4924->1683|4955->1688|4988->1712|5028->1714|5074->1729|5107->1736|5132->1752|5172->1754|5205->1760|5242->1770|5257->1776|5303->1801|5340->1821|5353->1826|5392->1827|5425->1833|5462->1843|5477->1849|5522->1873|5575->1896|5606->1900|6132->2400|6160->2407|6194->2414|6830->3023|6845->3029|6906->3069
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|64->33|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|72->41|73->42|88->57|88->57|89->58|107->76|107->76|107->76
                  -- GENERATED --
              */
          